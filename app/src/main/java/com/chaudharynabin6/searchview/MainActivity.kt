package com.chaudharynabin6.searchview

import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView

import com.chaudharynabin6.searchview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), SearchView.OnQueryTextListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(
            layoutInflater
        )
        setContentView(binding.root)


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.search_menu,menu)

        val searchMenu = menu.findItem(R.id.search)
        val searchView  = searchMenu.actionView as SearchView
        searchView.apply {

            queryHint = "Type here to search"
            setOnQueryTextListener(this@MainActivity)


        }


        return super.onCreateOptionsMenu(menu)
    }

    override fun onQueryTextSubmit(query: String?): Boolean {

        Log.e("onSubmit ...",query.toString())
        return false
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        Log.e("onChange ...",newText.toString())

        return false
    }
}