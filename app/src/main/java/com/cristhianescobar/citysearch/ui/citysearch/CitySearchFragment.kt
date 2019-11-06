package com.cristhianescobar.citysearch.ui.citysearch

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cristhianescobar.citysearch.R

class CitySearchFragment : Fragment() {

    companion object {
        fun newInstance() = CitySearchFragment()
    }

    private lateinit var viewModel: CitySearchViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.city_search_fragment, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CitySearchViewModel::class.java)
    }

}
