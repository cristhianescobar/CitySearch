package com.cristhianescobar.citysearch.ui.citysearch

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.cristhianescobar.citysearch.api.repository.VenuesRepository
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import com.cristhianescobar.citysearch.api.Result
import com.cristhianescobar.codegen.ws.models.typeahead.SuggestedResponse
import com.cristhianescobar.codegen.ws.models.typeahead.Venue
import com.cristhianescobar.codegen.ws.models.typeahead.VenuesResponse

class CitySearchViewModel(application: Application) : AndroidViewModel(application) {
    /* Dependency Injections */
    private val searchVenuesRepository: VenuesRepository by application.inject()

    /* Private Mutable Live Data*/
    private val _selectedVenue = MutableLiveData<Venue>()
    private val _searchedTerm = MutableLiveData<String>()
    private val _nearByVenues = MutableLiveData<Result<List<Venue>>>()
    private val _suggestedSearchTerms = MutableLiveData<Result<List<Venue>>>()

    /* Public Mutable Live Data*/
    val selectedVenue: LiveData<Venue>
        get() = _selectedVenue
    val searchedTerm: LiveData<String>
        get() = _searchedTerm
    val nearByVenues: LiveData<Result<List<Venue>>>
        get() = _nearByVenues
    val suggestedSearchTerms: LiveData<Result<List<Venue>>>
        get() = _suggestedSearchTerms

    /* ViewModel set methods */
    fun getVenuesNear(place: String = "Seattle,+WA", query: String = "coffee") {
        _searchedTerm.value = query
        viewModelScope.launch {
            val venuesNearBy = searchVenuesRepository.getVenuesNearBy(place, query)
            _nearByVenues.postValue(venuesNearBy)
        }
    }

    fun getSuggestedVenues(near: String = "Seattle,+WA", searchWord: String) {
        viewModelScope.launch {
            val suggestedSearch = searchVenuesRepository.getSuggestedVenues(near, searchWord)
            _suggestedSearchTerms.postValue(suggestedSearch)
        }
    }

    fun setVenueSelected(v : Venue) {
        _selectedVenue.postValue(v)
    }
}
