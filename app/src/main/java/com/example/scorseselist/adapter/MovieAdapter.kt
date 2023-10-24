package com.example.scorseselist.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.scorseselist.Movie
import com.example.scorseselist.databinding.MovieItemBinding

class MovieAdapter(private val context: Context, private val movieList: MutableList<Movie>) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val listItem = MovieItemBinding.inflate(LayoutInflater.from(context))
        return MovieViewHolder(listItem)
    }

    override fun getItemCount() = movieList.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.imgMovie.setBackgroundResource(movieList[position].imgMovie!!)
    }


    inner class MovieViewHolder(binding: MovieItemBinding) : RecyclerView.ViewHolder(binding.root) {

        val imgMovie = binding.containerImg

    }


}