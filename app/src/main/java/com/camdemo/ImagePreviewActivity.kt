package com.camdemo

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_image_preview.*
import java.io.File

class ImagePreviewActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_preview)

        Glide.with(this).load(Uri.fromFile(File(intent.getStringExtra("image")))).into(iv_preview)
    }
}