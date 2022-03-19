package com.rival.imageviewbyglide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.IV_image)
        Glide
            .with(this)
            .load("https://r1.ilikewallpaper.net/iphone-11-wallpapers/download/79683/The-beast-in-the-jungle-iphone-11-wallpaper-ilikewallpaper_com_640.jpg")
            .into(imageView)
    }
}