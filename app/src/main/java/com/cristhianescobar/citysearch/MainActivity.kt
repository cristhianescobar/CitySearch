package com.cristhianescobar.citysearch

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import kotlinx.android.synthetic.main.city_search_activity.*
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.viewModelScope
import com.cristhianescobar.citysearch.extensions.*
import com.cristhianescobar.citysearch.extensions.Debounce.debounce

import com.cristhianescobar.citysearch.ui.citysearch.CitySearchViewModel


class MainActivity : AppCompatActivity(), SearchView.OnQueryTextListener, View.OnClickListener {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var viewModel: CitySearchViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.city_search_activity)

        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment? ?: return
        // Set up Action Bar
        val navController = host.navController

        appBarConfiguration = AppBarConfiguration(navController.graph)

        setSupportActionBar(toolbar)

        toolbar_search.apply {
            setIconifiedByDefault(false) // Do not iconify the widget; expand it by default
            setOnQueryTextListener(this@MainActivity)
            setOnClickListener(this@MainActivity)

        }
        viewModel = ViewModelProviders.of(this).get(CitySearchViewModel::class.java)
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        query?.let {
            toolbar_search.setQuery(query, true)
            viewModel.getSuggestions(searchWord = it)
            hideKeyboard()
        }
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        newText?.let {
            if (newText.length >= 3) {
                viewModel.viewModelScope.debounce(1000) {
                    viewModel.getSuggestions(searchWord = it)
                }
            }

        }
        return true
    }

    fun showSearchBar() {
        toolbar_search.expand()
    }

    fun hideSearchBar() {
        toolbar_search.collapse()
    }

    fun setTitle(title: String) {
        toolbar.title = title
    }

    override fun onClick(v: View?) {
        "onClick".log()
        when (v?.id) {
            R.id.toolbar_search -> {
                Toast.makeText(baseContext, "Display Recent Search", Toast.LENGTH_SHORT).show()
            }
            else -> {
                Toast.makeText(baseContext, "Click Listener NOT handled", Toast.LENGTH_SHORT).show()
            }
        }
    }


}
