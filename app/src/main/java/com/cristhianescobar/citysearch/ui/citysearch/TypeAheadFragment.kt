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
import com.cristhianescobar.citysearch.R
import com.cristhianescobar.citysearch.api.Result
import com.cristhianescobar.citysearch.extensions.showKeyboard
import com.cristhianescobar.codegen.ws.models.typeahead.Venue

import kotlinx.android.synthetic.main.fragment_type_ahead.*

/**
 * A fragment representing a list of Items.
 * Activities containing this fragment MUST implement the
 * [TypeAheadFragment.OnListFragmentInteractionListener] interface.
 */
class TypeAheadFragment : Fragment() {

    private var listener: OnPlaceClickedListener? =
        object : OnPlaceClickedListener {
            override fun onVenueClick(item: Venue?) {
                item?.let {
                    viewModel.getVenuesNear(query = it.name)
                    findNavController().navigate(R.id.display_nearby_places_dest)
                    (activity as MainActivity).hideSearchBar()
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
        inflater.inflate(R.layout.fragment_type_ahead, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(list) {
            layoutManager = LinearLayoutManager(context)
            adapter = venueRecyclerViewAdapter
        }
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity).setTitle("Find What You Are Looking For!")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = activity?.run {
            ViewModelProviders.of(this).get(CitySearchViewModel::class.java)
        } ?: throw Exception("Invalid Activity")
        viewModel.suggestedSearchTerms.observe(
            viewLifecycleOwner,
            Observer<Result<List<Venue>>> {
                when (it) {
                    is Result.Success -> {
                        venueRecyclerViewAdapter.addVenues(it.data)
                    }
                    is Result.Error -> {
                        Toast.makeText(context, "Error?", Toast.LENGTH_SHORT).show()
                    }
                }
            })
        (activity as MainActivity).showSearchBar()
        activity?.showKeyboard()
    }
}
