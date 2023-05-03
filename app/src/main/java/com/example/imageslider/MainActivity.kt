package com.example.imageslider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.imageslider.R.drawable.*
import com.example.imageslider.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var image= arrayOf(img1, img2, img3, img4, img5, img6)
        super.onCreate(savedInstanceState)
        var binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



   binding.viewitem.adapter = ImageAdepter(image)

    }
}