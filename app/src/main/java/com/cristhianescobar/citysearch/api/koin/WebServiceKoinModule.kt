package com.cristhianescobar.citysearch.api.koin

import com.cristhianescobar.citysearch.api.webservice.VenuesService
import org.koin.dsl.module

internal val webServiceKoinModule = module {
    factory { VenuesService(get()) }
}