package com.example.imageslider

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide

class ImageAdepter(image: Array<Int>) : PagerAdapter() {

    var image=image
    override fun getCount(): Int {
  return image.size
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
  return  view==obj
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var view = LayoutInflater.from(container.context).inflate(com.example.imageslider.R.layout.image_item,container,false)
 var images=view.findViewById<ImageView>(R.id.imageitem)
        Glide.with(container.context).load(image.get(position)).into(images)

        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {

        container.removeView(obj as View)

    }
}