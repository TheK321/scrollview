package com.isc.apptapiz

import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AcercaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acercade)

        val info : ImageView = findViewById(R.id.info)
        info.setOnClickListener{
            Toast.makeText(applicationContext,"Aplicación para cambiar fondos de pantalla",Toast.LENGTH_LONG).show()
        }
    }
}
