package com.anthony.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anthony.recyclerviewapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myMusicAdapter: MusicAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val songs : List<MusicModel> = arrayListOf(
            MusicModel(
                "Abule", "Patoranking", isPlaying = false
            ),
            MusicModel(
                "Don Dada", "Timaya", isPlaying = true
            ),
            MusicModel("GoodMorning Jesus", "Smith", isPlaying = false )
        )
        myMusicAdapter = MusicAdapter(songs)
        binding.recycle
    }
}
