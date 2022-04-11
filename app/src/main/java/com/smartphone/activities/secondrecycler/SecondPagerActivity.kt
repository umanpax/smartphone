package com.smartphone.activities.secondrecycler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.smartphone.R
import com.smartphone.models.Smartphone
import com.smartphone.utils.ApplicationConstants
import com.smartphone.utils.CustomPhotoSwipeViewPager

class SecondPagerActivity : AppCompatActivity() {

    private lateinit var photoViewerAdapter: SecondPagerAdapter
    private lateinit var viewPager: CustomPhotoSwipeViewPager
    private lateinit var smartphone: Smartphone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_recycler)
        getSmartPhone()
        initViews()
        initPager()
    }

    private fun initViews() {
        viewPager = findViewById(R.id.viewpager_photo_viewer)
    }

    private fun getSmartPhone() {
        if (intent.hasExtra(ApplicationConstants.SMARTPHONE)) {
            smartphone = intent.extras!!.get(ApplicationConstants.SMARTPHONE) as Smartphone
        }
    }

    private fun initPager() {
        viewPager = findViewById(R.id.viewpager_photo_viewer)
        photoViewerAdapter = SecondPagerAdapter(this, smartphone.urls.toMutableList() as ArrayList<String>)
        viewPager.adapter = photoViewerAdapter
        viewPager.currentItem = 0
    }

}