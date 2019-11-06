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
import com.cristhianescobar.codegen.ws.models.venue.VenuesResponse

class CitySearchViewModel(application: Application) : AndroidViewModel(application) {
    private val searchVenuesRepository: VenuesRepository by application.inject()

    private val _nearByVenues = MutableLiveData<Result<VenuesResponse>>()

    val nearByVenues: LiveData<Result<VenuesResponse>>
        get() = _nearByVenues

    fun getVenuesNear(place : String = "Seattle,+WA", query : String = "coffee") {
        viewModelScope.launch {
            val venuesNearBy = searchVenuesRepository.getVenuesNearBy(place, query)
            _nearByVenues.postValue(venuesNearBy)
        }
    }
}
