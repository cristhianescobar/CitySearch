package com.cristhianescobar.citysearch.api.koin

import com.cristhianescobar.citysearch.api.repository.VenuesRepository
import com.cristhianescobar.citysearch.api.repository.impl.VenuesRepositoryImpl
import org.koin.dsl.module

internal val repositoryKoinModule = module {
    factory<VenuesRepository> { VenuesRepositoryImpl(get()) }
}