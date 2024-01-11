package com.example.scorseselist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.scorseselist.adapter.MovieAdapter
import com.example.scorseselist.databinding.ActivityMainBinding
import com.example.scorseselist.databinding.ActivityMoviesBinding

class MoviesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMoviesBinding
    private lateinit var moviesAdapter: MovieAdapter
    private val listMovie: MutableList<Movie> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)
        binding = ActivityMoviesBinding.inflate(layoutInflater)
        setTheme(R.style.Theme_ScorseseList)
        setContentView(binding.root)

        val rvList = binding.recyclerMovies
        rvList.layoutManager = GridLayoutManager(this, 3)
        rvList.setHasFixedSize(true)
        moviesAdapter = MovieAdapter(this, listMovie)
        rvList.adapter = moviesAdapter

        getMovie()

    }



    private fun getMovie(){

        listMovie.add(Movie(R.drawable.killersoftheflowermoon))
        listMovie.add(Movie(R.drawable.silence))
        listMovie.add(Movie(R.drawable.rollingthunder))
        listMovie.add(Movie(R.drawable.shutterisland))


    }

}