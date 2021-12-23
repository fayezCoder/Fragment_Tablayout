package com.example.fragment_tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter


class FragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter
    (fragmentManager,lifecycle){

    val fragmentList:ArrayList<Fragment> = ArrayList()
    val fragmentTitles:ArrayList<String> =ArrayList()

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
       // return fragmentList.get(position)
         return fragmentList.get(position)

    }
    fun addFragment(fragment: Fragment, title:String){

        fragmentList.add(fragment)
        fragmentTitles.add(title)
    }

    // override fun getItemId(position: Int): Long {
    //   return fragmentList[position].hashCode().toLong()
    //}
}