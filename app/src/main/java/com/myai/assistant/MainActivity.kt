package com.myai.assistant

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.parseColor("#050B1A"))
        }
        val title = TextView(this).apply {
            text = "MY AI"
            textSize = 40f
            setTextColor(Color.parseColor("#00B4FF"))
            gravity = Gravity.CENTER
        }
        val sub = TextView(this).apply {
            text = "Stage 1 working"
            textSize = 16f
            setTextColor(Color.parseColor("#7FD6FF"))
            gravity = Gravity.CENTER
        }
        layout.addView(title)
        layout.addView(sub)
        setContentView(layout)
    }
}
