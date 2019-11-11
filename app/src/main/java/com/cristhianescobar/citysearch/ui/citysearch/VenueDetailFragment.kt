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
import com.bumptech.glide.Glide
import com.cristhianescobar.citysearch.MainActivity

import com.cristhianescobar.citysearch.R
import com.cristhianescobar.citysearch.api.Result
import com.cristhianescobar.citysearch.extensions.getBestImage
import com.cristhianescobar.citysearch.extensions.getMainImageUrl
import com.cristhianescobar.citysearch.extensions.getPhoto
import com.cristhianescobar.citysearch.extensions.log
import com.cristhianescobar.codegen.ws.models.typeahead.Venue
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.fragment_venue_detail.*
import kotlinx.android.synthetic.main.home_fragment.*
import java.lang.StringBuilder

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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_venue_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = activity?.run {
            ViewModelProviders.of(this).get(CitySearchViewModel::class.java)
        } ?: throw Exception("Invalid Activity")
        (activity as MainActivity).setTitle("Venue Details ")

        viewModel.selectedVenue.observe(viewLifecycleOwner, Observer<Result<com.cristhianescobar.codegen.ws.models.venueDetails.Venue>> {
            when (it) {
                is Result.Success -> {
                    val venue = it.data
                    Glide.with(this)
                        .load(it.data.photos.getPhoto())
                        .into(heroImage)

                    details_title.text = venue.name
                    details_address.text = StringBuilder().append(venue.location.address)
                        .append("\n" + venue.location.city + " " + venue.location.state + " " + venue.location.postalCode)
                        .append("\n" + venue.location.country).toString()

                    details_details.text = venue.description


                }
                is Result.Error -> {
                    Toast.makeText(context, "Error?", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }

    override fun onStop() {
        super.onStop()
    }

}
