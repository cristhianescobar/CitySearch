package com.cristhianescobar.citysearch.ui.citysearch

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.cristhianescobar.citysearch.R
import com.cristhianescobar.citysearch.extensions.getMainImageUrl
import com.cristhianescobar.codegen.ws.models.typeahead.Venue

import kotlinx.android.synthetic.main.fragment_venue.view.*

/**
 * [RecyclerView.Adapter] that can display a [DummyItem] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class VenueRecyclerViewAdapter(
    private var mValues: List<Venue>,
    private val mListener: OnPlaceClickedListener?
) : RecyclerView.Adapter<VenueRecyclerViewAdapter.ViewHolder>() {

    private val mOnClickListener: View.OnClickListener

    init {
        mOnClickListener = View.OnClickListener { v ->
            mListener?.onVenueClick(v.tag as Venue)
        }
    }

    fun addVenues(venues: List<Venue>) {
        mValues = venues
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_venue, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mValues[position])
        with(holder.mView) {
            setOnClickListener(mOnClickListener)
        }
    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        fun bind(venue: Venue) {
            Glide.with(mView.context)
                .load(venue.categories.getMainImageUrl())
                .into(mView.image)
            mView.content.text = venue.name
            mView.tag = venue
        }
    }
}
