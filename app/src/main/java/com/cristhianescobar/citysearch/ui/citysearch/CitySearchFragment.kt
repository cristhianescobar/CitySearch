package com.cristhianescobar.citysearch.ui.citysearch

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import com.cristhianescobar.citysearch.R
import com.cristhianescobar.citysearch.api.Result
import com.cristhianescobar.codegen.ws.models.venue.VenuesResponse

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
        viewModel.nearByVenues.observe(viewLifecycleOwner, Observer<Result<VenuesResponse>> {
            when(it) {
                is Result.Success -> {
                    Toast.makeText(context, "Data? ${it.data.response.venues.map { it.name }}", Toast.LENGTH_SHORT).show()
                }
                is Result.Error -> {
                    Toast.makeText(context, "Error?", Toast.LENGTH_SHORT).show()
                }
            }
        })
        viewModel.getVenuesNear()
    }

}
