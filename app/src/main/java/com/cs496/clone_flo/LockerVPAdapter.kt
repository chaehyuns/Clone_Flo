package com.cs496.clone_flo

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.cs496.clone_flo.databinding.FragmentLockerMusicfileBinding
import com.cs496.clone_flo.SavedSongFragment

class LockerVPAdapter (fragment : Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int  = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> SavedSongFragment()
            1 -> MusicFileFragment()
            else -> SavedAlbumFragment()
        }
    }
}