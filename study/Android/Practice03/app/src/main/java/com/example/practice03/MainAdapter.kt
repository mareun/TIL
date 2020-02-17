package com.example.practice03

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MainAdapter (var fragNum : Int, fm : FragmentManager) : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    val firstFrag: Fragment = FirstFragment()
    val secondFrag: Fragment = SecondFragment()

    override fun getItem(position: Int): Fragment {
        //Fragment? -> can't have nullable in overriden method
        return when (position) {
            0 -> firstFrag
            1 -> secondFrag
            else -> throw IllegalStateException("error")
        }
    }

    override fun getCount(): Int = fragNum
}