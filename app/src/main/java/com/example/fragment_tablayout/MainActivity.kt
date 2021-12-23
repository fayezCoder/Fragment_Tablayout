package com.example.fragment_tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private var tabLayout:TabLayout?=null
    private var viewpager:ViewPager2?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectViews()
        prepareTabs()
    }
    private fun connectViews(){

        tabLayout = findViewById(R.id.tabLayoutView)
        viewpager = findViewById(R.id.viewPagerView)
    }
     private fun prepareTabs(){
     val fAdapter:FragmentAdapter= FragmentAdapter(supportFragmentManager,lifecycle)
        fAdapter.addFragment(FirstFragment(),"الرئيسية")
        fAdapter.addFragment(SecondFragment(),"التنبيهات")
         fAdapter.addFragment(ThirdFragment() , "الاعدادات")
         fAdapter.addFragment(FouthFragment() , "الملف الشخصي")

         //هنا تقدر تضيف اي Tab بدون ان تعرف شي
         viewpager?.adapter = fAdapter
         TabLayoutMediator(tabLayout!!,viewpager!!){ tab,position ->
             tab.text = fAdapter.fragmentTitles[position]

         }.attach()

     }

}



