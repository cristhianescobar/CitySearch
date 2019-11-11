package com.cristhianescobar.citysearch.ui.citysearch

import com.cristhianescobar.codegen.ws.models.typeahead.Venue

interface OnPlaceClickedListener {
    fun onVenueClick(item: Venue?)
}