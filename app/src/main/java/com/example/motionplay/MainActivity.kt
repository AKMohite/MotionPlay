package com.example.motionplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        motion_scene_1_btn.setOnClickListener {
            intent = Intent(this, MotionScene1Activity::class.java)
            startActivity(intent)
        }

        motion_scene_2_btn.setOnClickListener {
            intent = Intent(this, MotionScene2Activity::class.java)
            startActivity(intent)
        }

        motion_scene_3_btn.setOnClickListener {
            intent = Intent(this, MotionScene3Activity::class.java)
            startActivity(intent)
        }
    }
}