package com.cristhianescobar.citysearch.ui.citysearch

import android.app.SearchManager
import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.cristhianescobar.citysearch.R
import com.cristhianescobar.citysearch.api.Result
import com.cristhianescobar.codegen.ws.models.typeahead.VenuesResponse
import kotlinx.android.synthetic.main.city_search_fragment.*

class CitySearchFragment : Fragment() {

    companion object {
        fun newInstance() = CitySearchFragment()
    }

    private lateinit var viewModel: CitySearchViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.city_search_fragment, container, false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Verify the action and get the query
        if (Intent.ACTION_SEARCH == activity?.intent?.action) {
            activity?.intent?.getStringExtra(SearchManager.QUERY)?.also { query ->
                if (query.length > 3) {
                    Toast.makeText(context, "Start Search  for $query", Toast.LENGTH_SHORT).show()
                    viewModel.getSuggestedVenues(searchWord = query)
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide.with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Seattle_Kerry_Park_Skyline.jpg/1200px-Seattle_Kerry_Park_Skyline.jpg")
            .into(heroImage)

        searchView.setOnSearchClickListener {
            childFragmentManager.beginTransaction()
                .replace(R.id.container, VenueFragment.newInstance())
                .commitNow()
        }
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(CitySearchViewModel::class.java)
        viewModel.nearByVenues.observe(viewLifecycleOwner, Observer<Result<VenuesResponse>> {
            when (it) {
                is Result.Success -> {
                    Toast.makeText(
                        context,
                        "Data? ${it.data.response.minivenues.map { it.name }}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                is Result.Error -> {
                    Toast.makeText(context, "Error?", Toast.LENGTH_SHORT).show()
                }
            }
        })
        viewModel.getVenuesNear()
    }

}
