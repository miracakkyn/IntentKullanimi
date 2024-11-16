package com.miracakkoyun.ders1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var gecis=findViewById<Button>(R.id.button)
        var isimInput=findViewById<EditText>(R.id.isimInput)
        //buton ve edittexi tanımlıyoruz

        gecis.setOnClickListener{
            var intent = Intent(applicationContext, ikinciActivity::class.java)
            intent.putExtra("İsim",isimInput.text.toString())
            //butona bastığımızda intetn ile veri gönderiyoruz(putExtra)
            startActivity(intent)
        }


    }
}