package com.example.myapplication

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import java.sql.Time
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class BookingActivity : AppCompatActivity() {
    private lateinit var edtDatepicker: EditText
    private lateinit var edtTimePicker: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)

        edtDatepicker = findViewById(R.id.edtDay)
        edtTimePicker = findViewById(R.id.edtTime)

        val myCalendar = Calendar.getInstance()

        val datePicker = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->

            myCalendar.set(Calendar.YEAR, year)
            myCalendar.set(Calendar.MONTH, month)
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            updateLable(myCalendar)

        }

    }

    private fun updateLable(myCalendar: Calendar) {
        val myFormat = "dd-MM-yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale.UK)
        edtDatepicker.setText(sdf.format(myCalendar.time))

    }
}