package com.example.scorseselist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.scorseselist.adapter.MovieAdapter
import com.example.scorseselist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var movieAdapter: MovieAdapter
    private val movieList: MutableList<Movie> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val recyclerViewMovie = binding.recyclerMain
        recyclerViewMovie.layoutManager = GridLayoutManager(this, 3)
        recyclerViewMovie.setHasFixedSize(true)
        movieAdapter = MovieAdapter(this, movieList)
        recyclerViewMovie.adapter = movieAdapter
        getMovie()
    }

    private fun getMovie(){

        val movie1 = Movie(imgMovie = R.drawable.taxidrive)
        movieList.add(movie1)

        val movie2 = Movie(imgMovie = R.drawable.goodfellas)
        movieList.add(movie2)

        val movie3 = Movie(imgMovie = R.drawable.thedeparted)
        movieList.add(movie3)

        val movie4 = Movie(imgMovie = R.drawable.theirishman)
        movieList.add(movie4)

        val movie5 = Movie(imgMovie = R.drawable.thewolfofwallstreet)
        movieList.add(movie5)

    }

}