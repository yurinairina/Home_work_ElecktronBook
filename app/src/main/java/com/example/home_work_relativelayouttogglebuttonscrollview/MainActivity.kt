package com.example.home_work_relativelayouttogglebuttonscrollview

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var textTV: TextView
    private lateinit var loadingBTN: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textTV = findViewById(R.id.textTV)
        loadingBTN = findViewById(R.id.loadingBTN)

        loadingBTN.setOnClickListener {
            val book = loadBook(Database().text)
            for (i in book) {
                textTV.append("$i ")
            }
        }
    }
    private fun loadBook(text: String): List<String> {
        return text.split(" ")
    }
}

//Database().loadBook().forEach {
//             textTV.append("$it ")