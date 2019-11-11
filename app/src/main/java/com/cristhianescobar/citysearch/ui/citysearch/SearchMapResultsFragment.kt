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
import com.cristhianescobar.citysearch.MainActivity

import com.cristhianescobar.citysearch.R
import com.cristhianescobar.citysearch.api.Result
import com.cristhianescobar.citysearch.extensions.log
import com.cristhianescobar.codegen.ws.models.typeahead.Venue
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

var SEATTLE_LAT = 47.60
var SEATTLE_LONG = 122.33

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [SearchMapResults.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [SearchMapResults.newInstance] factory method to
 * create an instance of this fragment.
 */
class SearchMapResults : Fragment(), OnMapReadyCallback {

    private lateinit var viewModel: CitySearchViewModel
    private var mMap: GoogleMap? = null


    private var listener: OnPlaceClickedListener? =
        object : OnPlaceClickedListener {
            override fun onVenueClick(venue: Venue?) {
                venue?.let {
                    findNavController().navigate(R.id.venue_details_dest)
                    viewModel.setVenueSelected(venue.id)
                }
            }
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_map_results, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        (childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment).getMapAsync(this)

        viewModel = activity?.run {
            ViewModelProviders.of(this).get(CitySearchViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

        viewModel.selectedVenue.observe(viewLifecycleOwner, Observer<Result<com.cristhianescobar.codegen.ws.models.venueDetails.Venue>> {
            when (it) {
                is Result.Success -> {
                    (activity as MainActivity).setTitle("About " + it.data)
                    "maps : ${it.data.name}".log()
                    val location = LatLng(it.data.location.lat, it.data.location.lng)
                    mMap?.addMarker(MarkerOptions().position(location).title(getString(R.string.app_name)))
                    mMap?.moveCamera(CameraUpdateFactory.newLatLng(location))                }
                is Result.Error -> {
                    Toast.makeText(context, "Error?", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        mMap?.mapType = GoogleMap.MAP_TYPE_NORMAL
        // Add a marker in Sydney and move the camera
        val seattle = LatLng(SEATTLE_LAT, SEATTLE_LONG)

        mMap?.addMarker(MarkerOptions().position(seattle).title(getString(R.string.app_name)))
        mMap?.moveCamera(CameraUpdateFactory.newLatLng(seattle))
    }
}
