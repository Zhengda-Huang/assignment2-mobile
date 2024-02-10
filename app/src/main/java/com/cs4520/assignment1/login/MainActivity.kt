package com.cs4520.assignment1.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cs4520.assignment1.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_temp)
        if (savedInstanceState == null) {
            val loginFragment = LoginFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, loginFragment)
                .commit()
        }
    }
}