package com.example.practice03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var id = login_id.text
        var pw = login_pw.text

        login_btn.setOnClickListener()
        {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("id_key", id.toString())
            intent.putExtra("pw_key", pw.toString())
            startActivity(intent)
        }
    }
}
