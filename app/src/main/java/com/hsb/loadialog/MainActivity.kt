package com.hsb.loadialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hsb.loadialog.databinding.ActivityMainBinding
import com.hsb.loadingdialogio.Loadialog

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Loadialog(this).showDialog()
    }
}