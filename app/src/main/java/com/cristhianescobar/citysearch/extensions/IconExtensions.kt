package com.cristhianescobar.citysearch.extensions

import android.util.Log
import com.cristhianescobar.codegen.ws.models.typeahead.Category
import com.cristhianescobar.codegen.ws.models.typeahead.Icon

fun Icon.getImageUrl(): String {
    val url = prefix + "bg_44" + suffix
    Log.d("url", url)
    return url
}

fun List<Category>.getMainImageUrl(): String {
    return find { it.isPrimary }?.icon?.getImageUrl().orEmpty()
}

