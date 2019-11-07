package com.cristhianescobar.citysearch.ui.citysearch

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.cristhianescobar.citysearch.R
import com.cristhianescobar.citysearch.api.domain.Venue
import com.cristhianescobar.citysearch.extensions.getImageUrl
import com.cristhianescobar.citysearch.extensions.getMainImageUrl


import com.cristhianescobar.citysearch.ui.citysearch.VenueFragment.OnListFragmentInteractionListener
import com.cristhianescobar.codegen.ws.models.typeahead.Minivenue
import kotlinx.android.synthetic.main.city_search_fragment.*

import kotlinx.android.synthetic.main.fragment_venue.view.*

/**
 * [RecyclerView.Adapter] that can display a [DummyItem] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class VenueRecyclerViewAdapter(
    private var mValues: List<Venue>,
    private val mListener: OnListFragmentInteractionListener?
) : RecyclerView.Adapter<VenueRecyclerViewAdapter.ViewHolder>() {

    private val mOnClickListener: View.OnClickListener

    init {
        mOnClickListener = View.OnClickListener { v ->
            val item = v.tag as Venue
            // Notify the active callbacks interface (the activity, if the fragment is attached to
            // one) that an item has been selected.
            mListener?.onListFragmentInteraction(item)
        }
    }

    fun addVenues(minivenue: List<Venue>) {
        mValues = minivenue
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_venue, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        Glide.with(holder.mView.context)
            .load(item.imageUrl)
            .into(holder.mIdView)
        holder.mContentView.text = item.name

        with(holder.mView) {
            tag = item
            setOnClickListener(mOnClickListener)
        }
    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mIdView: ImageView = mView.image
        val mContentView: TextView = mView.content

        override fun toString(): String {
            return super.toString() + " '" + mContentView.text + "'"
        }
    }
}
