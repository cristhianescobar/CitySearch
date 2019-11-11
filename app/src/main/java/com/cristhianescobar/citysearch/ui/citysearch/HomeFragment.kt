package com.cristhianescobar.citysearch.ui.citysearch

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.cristhianescobar.citysearch.MainActivity
import com.cristhianescobar.citysearch.R
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment : Fragment() {
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

        Glide.with(this)
            .load(Constants.food)
            .into(food)

        Glide.with(this)
            .load(Constants.coffee)
            .into(coffee)

        Glide.with(this)
            .load(Constants.nightLife)
            .into(nightlife)

        search_fab.setOnClickListener {
            findNavController().navigate(R.id.type_ahead_dest)
        }

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
