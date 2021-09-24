package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var counter: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        counter = findViewById<TextView>(R.id.textView)
        button.setOnClickListener { counter.text = Counter(false).toString() }
        button2.setOnClickListener { counter.text = Counter(true).toString() }
    }
    fun Counter(check: Boolean): Int {
        var c = 0
        if (check == true) {
            var c = counter.text.toString().toInt()

            counter.setTextColor(Color.parseColor("#539987"));
            if ((c + 1) < 0) {
                counter.setY(counter.getY() + (c+1))
            } else {
                counter.setY(counter.getY() - (c+1))
            }
            return c + 1
        } else {
            var c = counter.text.toString().toInt()
            counter.setTextColor(Color.parseColor("#e72d41"));

            if ((c + 1) < 0) {
                counter.setY(counter.getY() - (c+1))
            } else {
                counter.setY(counter.getY() + (c+1))
            }
            return c - 1
        }
    }
}