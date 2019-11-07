package com.cristhianescobar.citysearch.ui.citysearch

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.cristhianescobar.citysearch.R
import com.cristhianescobar.citysearch.api.Result
import com.cristhianescobar.citysearch.api.domain.Venue
import com.cristhianescobar.citysearch.extensions.getMainImageUrl
import com.cristhianescobar.codegen.ws.models.typeahead.Minivenue
import com.cristhianescobar.codegen.ws.models.typeahead.SuggestedResponse
import com.cristhianescobar.codegen.ws.models.typeahead.VenuesResponse

import kotlinx.android.synthetic.main.fragment_venue_list.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A fragment representing a list of Items.
 * Activities containing this fragment MUST implement the
 * [VenueFragment.OnListFragmentInteractionListener] interface.
 */
class VenueFragment : Fragment() {

    private var listener: OnListFragmentInteractionListener? =
        object : OnListFragmentInteractionListener {
            override fun onListFragmentInteraction(item: Venue?) {
                item?.let {
                    searchView.setQuery(it.name, true)
                }
            }
        }
    private var venueRecyclerViewAdapter = VenueRecyclerViewAdapter(emptyList(), listener)

    private lateinit var viewModel: CitySearchViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_venue_list, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(list) {
            layoutManager = LinearLayoutManager(context)
            adapter = venueRecyclerViewAdapter
        }

        searchView.queryHint = "Search Venues"
        searchView.setOnQueryTextListener(object :
            androidx.appcompat.widget.SearchView.OnQueryTextListener {

            override fun onQueryTextChange(newText: String): Boolean {
                if (newText.length > 3) {
                    viewModel.getSuggestedVenues(searchWord = newText)
                }
                return false
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                viewModel.getVenuesNear(query = query)
                Toast.makeText(context, "Final Search: $query", Toast.LENGTH_SHORT).show()
                return false
            }

        })
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(CitySearchViewModel::class.java)
        viewModel.suggestedSearchTerms.observe(
            viewLifecycleOwner,
            Observer<Result<SuggestedResponse>> {
                when (it) {
                    is Result.Success -> {
                        venueRecyclerViewAdapter.addVenues(it.data.response.minivenues.map { Venue(it.name, it.categories.getMainImageUrl()) })
                        Toast.makeText(context, "success", Toast.LENGTH_SHORT).show()
                    }
                    is Result.Error -> {
                        Toast.makeText(context, "Error?", Toast.LENGTH_SHORT).show()
                    }
                }
            })

        viewModel.nearByVenues.observe(viewLifecycleOwner,Observer<Result<VenuesResponse>>  {
            when (it) {
                is Result.Success -> {
                    venueRecyclerViewAdapter.addVenues(it.data.response.venues.map { Venue(it.name, it.categories.getMainImageUrl()) })
                    Toast.makeText(context, "success", Toast.LENGTH_SHORT).show()
                }
                is Result.Error -> {
                    Toast.makeText(context, "Error?", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson
     * [Communicating with Other Fragments](http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnListFragmentInteractionListener {
        fun onListFragmentInteraction(item: Venue?)
    }

    companion object {

        @JvmStatic
        fun newInstance() = VenueFragment()
    }
}
