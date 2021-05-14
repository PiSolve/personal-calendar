package com.personalised.calendar

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        findViewById<ImageView>(R.id.personal_cal_top_image).setImageResource(R.drawable.prof_guru)
//        var calView = findViewById<CalendarView>(R.id.personal_cal)
//        calView.setOnDateChangeListener{ view, year, month, dayOfMonth ->
            // when the cal date is clicked
//        }

        val dateView = findViewById<Button>(R.id.personal_date)
        val monthView = findViewById<Button>(R.id.personal_month)
        val yearView = findViewById<Button>(R.id.personal_year)

        val calendar: Calendar = Calendar.getInstance(TimeZone.getDefault())
        dateView.text = calendar.get(Calendar.DATE).toString()
        monthView.text = calendar.getDisplayName(Calendar.MONTH,Calendar.LONG,Locale.getDefault())
        yearView.text = calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,Locale.getDefault()).toString()



    }
}