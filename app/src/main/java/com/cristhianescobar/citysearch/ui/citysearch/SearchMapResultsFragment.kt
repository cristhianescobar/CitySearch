package com.cristhianescobar.citysearch.ui.citysearch

import android.graphics.Bitmap
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController

import com.cristhianescobar.citysearch.R
import com.cristhianescobar.citysearch.api.Result
import com.cristhianescobar.codegen.ws.models.typeahead.Venue
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.*
import kotlinx.android.synthetic.main.fragment_search_map_results.*
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import android.graphics.drawable.Drawable
import com.google.android.gms.maps.model.BitmapDescriptor
import android.graphics.Canvas


const val SEATTLE_LAT = 47.60
const val SEATTLE_LONG = -122.33
val SEATTLE = LatLng(SEATTLE_LAT, SEATTLE_LONG)
const val ZOOM_LEVEL = 13

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [SearchMapResults.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [SearchMapResults.newInstance] factory method to
 * create an instance of this fragment.
 */
class SearchMapResults : Fragment(), OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private lateinit var viewModel: CitySearchViewModel
    private var mMap: GoogleMap? = null
    private var markers = mutableListOf<MarkerOptions>()

    override fun onMarkerClick(m: Marker?): Boolean {
        m?.let {
            if (m.snippet.isNotEmpty()) {
                findNavController().navigate(R.id.venue_details_dest)
                viewModel.setVenueSelected(m.snippet)
            }
        }
        return true
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
        map_add_pins.setOnClickListener {
            findNavController().navigate(R.id.action_search_map_results_dest_to_display_nearby_places_dest)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        (childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment).getMapAsync(this)
        viewModel = activity?.run {
            ViewModelProviders.of(this).get(CitySearchViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

        viewModel.nearByVenues.observe(viewLifecycleOwner, Observer<Result<List<Venue>>> {
            when (it) {
                is Result.Success -> {
                    val venueListMarkers = it.data.map { v ->
                        MarkerOptions().position(
                            LatLng(
                                v.location.lat,
                                v.location.lng
                            )
                        ).snippet(v.id).title(v.name)
                    }
                    mMap?.clear()
                    markers.clear()

                    Handler().postDelayed({
                        val circleDrawable = resources.getDrawable(R.drawable.ic_person_pin)
                        val markerIcon = getMarkerIconFromDrawable(circleDrawable)

                        markers.add(
                            MarkerOptions()
                                .icon(markerIcon)
                                .snippet("")
                                .position(SEATTLE).title(getString(R.string.heart_of_seattle))
                        )
                        markers.addAll(venueListMarkers)
                        markers.forEach { mMap?.addMarker(it) }
                        animateToLocation(SEATTLE)
                    }, 450)

                    Toast.makeText(context, " Pins Added to the list", Toast.LENGTH_SHORT).show()
                }
                is Result.Error -> {
                    Toast.makeText(context, "Error?", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }

    private fun getMarkerIconFromDrawable(drawable: Drawable): BitmapDescriptor {
        val canvas = Canvas()
        val bitmap = Bitmap.createBitmap(
            drawable.intrinsicWidth,
            drawable.intrinsicHeight,
            Bitmap.Config.ARGB_8888
        )
        canvas.setBitmap(bitmap)
        drawable.setBounds(0, 0, drawable.intrinsicWidth, drawable.intrinsicHeight)
        drawable.draw(canvas)
        return BitmapDescriptorFactory.fromBitmap(bitmap)
    }

    private fun animateToLocation(location: LatLng) {
        mMap?.let {
            val camera = CameraPosition.Builder(it.cameraPosition)
                .target(location).zoom(ZOOM_LEVEL.toFloat())
                .build()
            it.animateCamera(CameraUpdateFactory.newCameraPosition(camera))
        }
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
        mMap?.clear()
        mMap?.setOnMarkerClickListener(this)
//        mMap?.mapType = GoogleMap.MAP_TYPE_NORMAL
//        mMap?.animateCamera(CameraUpdateFactory.newLatLngZoom(seattle, 100f))
//        mMap?.addMarker(marker)

    }
}
