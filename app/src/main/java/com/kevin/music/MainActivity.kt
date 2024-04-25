package com.kevin.music

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kevin.music.adapter.RecyclerViewAdapter
import com.kevin.music.data.DataSource
import com.kevin.music.databinding.ActivityMainBinding
import com.kevin.music.model.Album
import java.net.HttpURLConnection

class MainActivity : AppCompatActivity() {

    var albumes: MutableList<Album> = mutableListOf()
    private lateinit var binding: ActivityMainBinding
    lateinit var miRecycler: RecyclerView
    val miAdapter: RecyclerViewAdapter = RecyclerViewAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        CargarRecycler()

    }

    fun CargarRecycler(){
        miRecycler = binding.rcvAlbumes
        miRecycler.setHasFixedSize(true)
        miRecycler.layoutManager = LinearLayoutManager(this)
        miAdapter.RecyclerViewAdapter(DataSource().getAlbumes(),this)
        miRecycler.adapter = miAdapter
    }
}


