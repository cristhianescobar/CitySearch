package com.cristhianescobar.citysearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cristhianescobar.citysearch.ui.citysearch.CitySearchFragment

class CitySearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.city_search_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CitySearchFragment.newInstance())
                .commitNow()
        }
    }

}
