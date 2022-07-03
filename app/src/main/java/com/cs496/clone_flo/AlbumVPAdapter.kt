package com.cs496.clone_flo

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.cs496.clone_flo.DetailFragment
import com.cs496.clone_flo.SongFragment
import com.cs496.clone_flo.VideoFragment

class AlbumVPAdapter(fragment:Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> SongFragment()
            1 -> DetailFragment()
            else -> VideoFragment()
        }
    }
}