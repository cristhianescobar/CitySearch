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
import com.cristhianescobar.codegen.ws.models.typeahead.Venue
import kotlinx.coroutines.Dispatchers

class CitySearchViewModel(application: Application) : AndroidViewModel(application) {
    /* Dependency Injections */
    private val searchVenuesRepository: VenuesRepository by application.inject()

    /* Private Mutable Live Data*/
    private val _selectedVenue = MutableLiveData<Result<com.cristhianescobar.codegen.ws.models.venueDetails.Venue>>()
    private val _searchedTerm = MutableLiveData<String>()
    private val _nearByVenues = MutableLiveData<Result<List<Venue>>>()
    private val _suggestedSearchTerms = MutableLiveData<Result<List<Venue>>>()

    /* Public Mutable Live Data*/
    val selectedVenue: LiveData<Result<com.cristhianescobar.codegen.ws.models.venueDetails.Venue>>
        get() = _selectedVenue
    val searchedTerm: LiveData<String>
        get() = _searchedTerm
    val nearByVenues: LiveData<Result<List<Venue>>>
        get() = _nearByVenues
    val suggestedSearchTerms: LiveData<Result<List<Venue>>>
        get() = _suggestedSearchTerms

    /* ViewModel set methods */
    fun getVenuesNear(place: String = "Seattle,+WA", query: String) {
        _searchedTerm.value = query
        viewModelScope.launch(Dispatchers.IO) {
            val venuesNearBy = searchVenuesRepository.getVenuesNearBy(place, query)
            _nearByVenues.postValue(venuesNearBy)
        }
    }

    fun getSuggestions(near: String = "Seattle,+WA", searchWord: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val suggestedSearch = searchVenuesRepository.getSuggestions(near, searchWord)
            _suggestedSearchTerms.postValue(suggestedSearch)
        }
    }

    fun setVenueSelected(venueId : String) {
        viewModelScope.launch(Dispatchers.IO) {
            val venueDetails = searchVenuesRepository.getVenueDetails(venueId)
            _selectedVenue.postValue(venueDetails)
        }
    }
}
