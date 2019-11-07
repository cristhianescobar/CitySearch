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
import com.cristhianescobar.codegen.ws.models.typeahead.VenuesResponse

class CitySearchViewModel(application: Application) : AndroidViewModel(application) {
    /* Dependency Injections */
    private val searchVenuesRepository: VenuesRepository by application.inject()

    /* Private Mutable Live Data*/
    private val _nearByVenues = MutableLiveData<Result<VenuesResponse>>()
    private val _suggestedSearchTerms = MutableLiveData<Result<SuggestedResponse>>()

    /* Public Mutable Live Data*/
    val nearByVenues: LiveData<Result<VenuesResponse>>
        get() = _nearByVenues
    val suggestedSearchTerms: LiveData<Result<SuggestedResponse>>
        get() = _suggestedSearchTerms

    /* ViewModel set methods */
    fun getVenuesNear(place: String = "Seattle,+WA", query: String = "coffee") {
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
}
