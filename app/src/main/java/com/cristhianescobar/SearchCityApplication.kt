package com.cristhianescobar

import android.app.Application
import com.cristhianescobar.citysearch.api.koin.repositoryKoinModule
import com.cristhianescobar.citysearch.api.koin.retrofitKoinModule
import com.cristhianescobar.citysearch.api.koin.webServiceKoinModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import com.facebook.flipper.plugins.inspector.DescriptorMapping
import com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin
import com.facebook.flipper.android.AndroidFlipperClient
import com.facebook.flipper.android.utils.FlipperUtils
import com.facebook.soloader.SoLoader
import com.cristhianescobar.citysearch.BuildConfig
import com.facebook.stetho.Stetho


class SearchCityApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)

        SoLoader.init(this, false)
        if (BuildConfig.DEBUG && FlipperUtils.shouldEnableFlipper(this)) {
            val client = AndroidFlipperClient.getInstance(this)
            client.addPlugin(InspectorFlipperPlugin(this, DescriptorMapping.withDefaults()))
            client.start()
        }

        // start Koin!
        startKoin {
            androidContext(this@SearchCityApplication)
            modules(retrofitKoinModule)
            modules(webServiceKoinModule)
            modules(repositoryKoinModule)
        }
    }
}