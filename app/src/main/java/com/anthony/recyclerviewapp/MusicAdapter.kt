package com.anthony.recyclerviewapp

import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import androidx.recyclerview.widget.RecyclerView.
import com.anthony.recyclerviewapp.databinding.MusicItemBinding


class MusicAdapter(val songs: List<MusicModel>) : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    class MusicViewHolder(val binding: MusicItemBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(song: MusicModel){
            binding.songTittle.text = song.songName
            binding.artist.text = song.artistName

            if (song.isPlaying){
                binding.isPlaying.setImageDrawable()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ??? {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ???, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}