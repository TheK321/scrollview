package com.isc.apptapiz

import android.app.WallpaperManager
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.io.IOException


class MainActivity : AppCompatActivity() {

    var movil = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iv1: ImageView = findViewById(R.id.imagen1)
        val iv2: ImageView = findViewById(R.id.imagen2)
        val iv3: ImageView = findViewById(R.id.imagen3)
        val iv4: ImageView = findViewById(R.id.imagen4)
        val boton: Button = findViewById(R.id.button1)
        val btnAcerca: Button = findViewById(R.id.button2)

        iv1.setOnClickListener{
            chooseImage(R.drawable.imagina)
        };

        iv2.setOnClickListener {
            chooseImage(R.drawable.imaginab)
        };

        iv3.setOnClickListener {
            chooseImage(R.drawable.imaginac)
        }
        iv4.setOnClickListener {
            chooseImage(R.drawable.imaginad)
        }

        boton.setOnClickListener{
            val fondo = BitmapFactory.decodeStream(
                resources.openRawResource(movil)
            )
            try {
                WallpaperManager.getInstance(this).setBitmap(fondo)
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        btnAcerca.setOnClickListener {
            acercaDe()
        }

    }

    fun chooseImage(r: Int){
        val referencia: ImageView= findViewById(R.id.principal)
        referencia.setImageResource(r);
        movil = r;
    }
    fun acercaDe(){

        startActivity(Intent(this, AcercaActivity::class.java))
    }
}