package com.cristhianescobar.citysearch.ui.citysearch

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.cristhianescobar.citysearch.MainActivity
import com.cristhianescobar.citysearch.api.Result
import com.cristhianescobar.citysearch.R
import com.cristhianescobar.codegen.ws.models.typeahead.Venue
import kotlinx.android.synthetic.main.fragment_display_near_by_places.*
import kotlinx.android.synthetic.main.fragment_type_ahead.*
import kotlinx.android.synthetic.main.fragment_type_ahead.list
import kotlinx.android.synthetic.main.home_fragment.*

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [SearchListResultsFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [SearchListResultsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SearchListResultsFragment : Fragment() {

    private lateinit var viewModel: CitySearchViewModel

    private var listener: OnPlaceClickedListener? =
        object : OnPlaceClickedListener {
            override fun onVenueClick(venue: Venue?) {
                venue?.let {
                    findNavController().navigate(R.id.venue_details_dest)
                    viewModel.setVenueSelected(venue.id)
                }
            }
        }

    private var venueRecyclerViewAdapter = VenueRecyclerViewAdapter(emptyList(), listener)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_display_near_by_places, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(list) {
            layoutManager = LinearLayoutManager(context)
            adapter = venueRecyclerViewAdapter
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = activity?.run {
            ViewModelProviders.of(this).get(CitySearchViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

        viewModel.nearByVenues.observe(viewLifecycleOwner, Observer<Result<List<Venue>>> {
            when (it) {
                is Result.Success -> {
                    venueRecyclerViewAdapter.addVenues(it.data)
                }
                is Result.Error -> {
                    Toast.makeText(context, "Error?", Toast.LENGTH_SHORT).show()
                }
            }
        })
        viewModel.searchedTerm.observe(viewLifecycleOwner, Observer<String> {
            (activity as MainActivity).setTitle("Results for $it")
        })

        map_fab?.setOnClickListener {
            findNavController().navigate(R.id.search_map_results_dest)
        }
    }
}
