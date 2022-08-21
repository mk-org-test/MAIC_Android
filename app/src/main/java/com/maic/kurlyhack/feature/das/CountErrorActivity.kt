package com.maic.kurlyhack.feature.das

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.maic.kurlyhack.databinding.ActivityCountErrorBinding
import com.maic.kurlyhack.util.showDrawer

class CountErrorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCountErrorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountErrorBinding.inflate(layoutInflater)

        getData()
        initBtnClickListener()

        setContentView(binding.root)
    }

    private fun getData() {
        binding.tvCountErrorPart.text = intent.getStringExtra("addressBox")
        binding.tvCountErrorItem.text = intent.getStringExtra("Item")
    }

    private fun initBtnClickListener() {
        binding.btnCountTransmit.setOnClickListener {
            // TODO: api 연결
            val count = binding.etCountError.text.toString()
            if(count.isNotEmpty()) {
                Toast.makeText(this, count + "개 전송", Toast.LENGTH_SHORT).show()
                finish()
            }else {
                Toast.makeText(this, "수량을 입력하세요.", Toast.LENGTH_SHORT).show()
            }
        }

        binding.ivCountErrorMenu.setOnClickListener {
            showDrawer(binding.drawerLayout, binding.navView)
        }

        binding.ivCountErrorBack.setOnClickListener {
            finish()
        }
    }
}
