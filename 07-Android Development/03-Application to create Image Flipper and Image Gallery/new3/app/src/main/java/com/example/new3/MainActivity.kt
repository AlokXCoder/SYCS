package com.example.new3

import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private lateinit var imageView: ImageView
    private lateinit var button: Button
    private val pickImage = 100
    private var imageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new3b)

        title = "KotlinApp"

        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.buttonLoadPicture)

        button.setOnClickListener {
            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallery, pickImage)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == pickImage) {
            // Set the selected image to the ImageView
            imageUri = data?.data
            if (imageUri != null) {
                imageView.setImageURI(imageUri)
            }
        }
    }
}