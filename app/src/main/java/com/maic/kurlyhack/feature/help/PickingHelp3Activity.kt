package com.maic.kurlyhack.feature.help

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maic.kurlyhack.R
import com.maic.kurlyhack.databinding.ActivityPickingHelp3Binding
import com.maic.kurlyhack.feature.OnSwipeTouchListener

class PickingHelp3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityPickingHelp3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPickingHelp3Binding.inflate(layoutInflater)
        setContentView(R.layout.activity_picking_help3)
    }

    private fun initEventListener() {
        binding.tvPickHelp3.setOnClickListener {
            finish()
            startActivity(Intent(this@PickingHelp3Activity, PickingHelp8Activity::class.java))
        }

        binding.clPickHelp3.setOnTouchListener(object: OnSwipeTouchListener(this@PickingHelp3Activity) {
            override fun onSwipeRight() {
                finish()
                startActivity(Intent(this@PickingHelp3Activity, PickingHelp4Activity::class.java))
            }
            override fun onSwipeLeft() {
                finish()
                startActivity(Intent(this@PickingHelp3Activity, DasHelp2Activity::class.java))
            }
        })
    }
}