package com.miracakkoyun.ders1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ikinciActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ikinci)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val extras=intent.extras ?:return
        var isimDegisken=extras.getString("İsim")
        //intent ile gönderdiğimiz veriyi extras ile çekiyoruz


        var hosgeldiniz=findViewById<TextView>(R.id.textView3)
        hosgeldiniz.text=hosgeldiniz.text.toString()+"\n"+isimDegisken

        var gecis=findViewById<Button>(R.id.button2)

        gecis.setOnClickListener{
            var intent2=Intent(applicationContext,MainActivity::class.java)
            startActivity(intent2)
        }
    }
}