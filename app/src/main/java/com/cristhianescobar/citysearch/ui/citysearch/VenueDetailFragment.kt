package com.cristhianescobar.citysearch.ui.citysearch

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.cristhianescobar.citysearch.MainActivity

import com.cristhianescobar.citysearch.R
import com.cristhianescobar.citysearch.api.Result
import com.cristhianescobar.codegen.ws.models.typeahead.Venue

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [VenueDetailFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [VenueDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VenueDetailFragment : Fragment() {
    private lateinit var viewModel: CitySearchViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_venue_detail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = activity?.run {
            ViewModelProviders.of(this).get(CitySearchViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

        viewModel.selectedVenue.observe(viewLifecycleOwner, Observer<Venue> {
            (activity as MainActivity).setTitle("About " + it.name)
        })
    }

}
