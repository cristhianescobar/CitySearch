package com.cristhianescobar.citysearch.api.domain


data class Venue(val name : String, val imageUrl : String, val location :VLocation?=null)

data class VLocation(val address : String)