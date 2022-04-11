package com.smartphone.activities.firstrecycler

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.smartphone.R
import com.smartphone.activities.secondrecycler.SecondPagerActivity
import com.smartphone.models.Smartphone
import com.smartphone.utils.ApplicationConstants


class FirstRecyclerAdapter(mListSmartphone: ArrayList<Smartphone>,
                           view: Context
) :
    RecyclerView.Adapter<FirstRecyclerAdapter.HobbiesView>() {
    private var listSmartphone: ArrayList<Smartphone>? = mListSmartphone
    private var view: Context? = null
    private var viewModel: FirstRecyclerViewModel? = null

    init {
        this.view = view
        this.viewModel = viewModel
    }

    class HobbiesView (v: View) : RecyclerView.ViewHolder(v) {
        var imvPhoto : ImageView?= null
        var tvName : TextView?= null
        var tvModel : TextView?= null
        var tvColor : TextView?= null
        var tvPrice : TextView?= null

        init {
            imvPhoto = v.findViewById(R.id.imv_smartphone)
            tvName = v.findViewById(R.id.tv_smartphone_name)
            tvModel = v.findViewById(R.id.tv_smartphone_model)
            tvColor = v.findViewById(R.id.tv_smartphone_color)
            tvPrice = v.findViewById(R.id.tv_smartphone_price)
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: HobbiesView, position: Int) {
        holder.setIsRecyclable(false)
        val smartphone = listSmartphone!![position]
        holder.tvName?.text = smartphone.name
        holder.tvModel?.text = smartphone.model
        holder.tvColor?.text = smartphone.color
        holder.tvPrice?.text = smartphone.price


        if (smartphone.urls.isNotEmpty()) {
            Glide.with(view!!)
                .load(smartphone.urls[0])
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(holder.imvPhoto!!)
        }

        holder.imvPhoto?.setOnClickListener {
            val intent = Intent(view, SecondPagerActivity::class.java)
            intent.putExtra(ApplicationConstants.SMARTPHONE, smartphone)
            view?.startActivity(intent)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbiesView {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_smartphone, parent, false)
        return HobbiesView(itemView)
    }

    override fun getItemCount(): Int {
        return listSmartphone!!.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

}
