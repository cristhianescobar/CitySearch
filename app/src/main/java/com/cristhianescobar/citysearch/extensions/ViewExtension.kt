package com.cristhianescobar.citysearch.extensions

import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.Transformation


fun View.collapse() {
    val initialHeight = measuredHeight

    val a = object : Animation() {
        override fun applyTransformation(interpolatedTime: Float, t: Transformation) =
            if (interpolatedTime == 1f) {
                visibility = View.GONE
            } else {
                layoutParams.height =
                    initialHeight - (initialHeight * interpolatedTime).toInt()
                requestLayout()
            }

        override fun willChangeBounds(): Boolean = true
    }
    // 1dp/ms
    a.duration = (initialHeight / context.resources.displayMetrics.density).toInt().toLong()
    startAnimation(a)
}

fun View.expand() {
    measure(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT)
    visibility = View.VISIBLE
    val targetHeight = height

    layoutParams.height = 0
    val a = object : Animation() {
        override fun applyTransformation(interpolatedTime: Float, t: Transformation) {
            layoutParams.height = if (interpolatedTime == 1f)
                WindowManager.LayoutParams.WRAP_CONTENT
            else
                (targetHeight * interpolatedTime).toInt()
            requestLayout()
        }

        override fun willChangeBounds(): Boolean {
            return true
        }
    }

    // 1dp/ms
    a.duration = ((targetHeight) / context.resources.displayMetrics.density).toInt().toLong()
    startAnimation(a)
}