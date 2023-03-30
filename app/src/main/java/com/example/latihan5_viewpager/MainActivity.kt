package com.example.latihan5_viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager = findViewById(R.id.viewPager) as ViewPager
        var tableLayout = findViewById(R.id.tablayout) as TabLayout

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(HomeFragment(),"Home")
        fragmentAdapter.addFragment(ChatFragment(),"Chat")
        fragmentAdapter.addFragment(SettingsFragment(),"Setting")

        viewPager.adapter = fragmentAdapter
        tableLayout.setupWithViewPager(viewPager)
    }
}