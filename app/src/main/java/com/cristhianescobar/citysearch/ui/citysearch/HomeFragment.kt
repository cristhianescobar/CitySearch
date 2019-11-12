package com.cristhianescobar.citysearch.ui.citysearch

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.cristhianescobar.citysearch.MainActivity
import com.cristhianescobar.citysearch.R
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment : Fragment() {

    private lateinit var viewModel: CitySearchViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(R.layout.home_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide.with(this)
            .load(Constants.places)
            .into(places)

        places.setOnClickListener {
            viewModel.getVenuesNear(query = "Places to see in Seattle")
            findNavController().navigate(R.id.action_home_dest_to_display_nearby_places_dest)
        }

        Glide.with(this)
            .load(Constants.food)
            .into(food)

        food.setOnClickListener {
            viewModel.getVenuesNear(query = "Best Restaurants in Seattle")
            findNavController().navigate(R.id.action_home_dest_to_display_nearby_places_dest)
        }

        Glide.with(this)
            .load(Constants.coffee)
            .into(coffee)

        coffee.setOnClickListener {
            viewModel.getVenuesNear(query = "Best Coffee in Seattle")
            findNavController().navigate(R.id.action_home_dest_to_display_nearby_places_dest)
        }

        Glide.with(this)
            .load(Constants.nightLife)
            .into(nightlife)

        nightlife.setOnClickListener {
            viewModel.getVenuesNear(query = "Night Clubs")
            findNavController().navigate(R.id.action_home_dest_to_display_nearby_places_dest)
        }

        search_fab.setOnClickListener {
            findNavController().navigate(R.id.type_ahead_dest)
        }



    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = activity?.run {
            ViewModelProviders.of(this).get(CitySearchViewModel::class.java)
        } ?: throw Exception("Invalid Activity")
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity).setTitle(getString(R.string.app_name))
    }

    override fun onResume() {
        super.onResume()
        (activity as MainActivity).hideSearchBar()
    }

}
