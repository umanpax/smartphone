package com.smartphone.activities.secondrecycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.smartphone.R

class SecondPagerAdapter(context: Context,
                        mListPhotoUrls: ArrayList<String>
) : PagerAdapter() {

    private var listPhotosUrls: ArrayList<String> = ArrayList()
    private var context: Context? = null

    init {
        this.context = context
        this.listPhotosUrls = mListPhotoUrls
    }

    override fun getCount(): Int {
        return listPhotosUrls.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater =
            context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView: View = inflater.inflate(R.layout.item_photo_viewer, container, false)

        val photoUrl = listPhotosUrls[position]
        val imvPhoto: ImageView = itemView.findViewById(R.id.imv_photo_viewer) as ImageView

        if (photoUrl != null) {
            Glide.with(context!!)
                .load(photoUrl)
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(imvPhoto)
        }

        container.addView(itemView)
        return itemView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as ConstraintLayout)
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as ConstraintLayout
    }
}