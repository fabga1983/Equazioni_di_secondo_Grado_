package com.example.equazionisecondogrado

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.sqrt

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // findWiewById

        val a = findViewById<TextView>(R.id.editTextNumberSigned2)
        val b = findViewById<TextView>(R.id.editTextNumberSigned3)
        val c = findViewById<TextView>(R.id.editTextNumberSigned)

        val delta = findViewById<TextView>(R.id.textView4)
        val x1 = findViewById<TextView>(R.id.textView5)
        val x2 = findViewById<TextView>(R.id.textView6)
        val button = findViewById<Button>(R.id.button)




        button.setOnClickListener() {

            delta.text = ((b.text.toString().toDouble() * b.text.toString()
                .toDouble() - (4 * a.text.toString().toDouble() * c.text.toString()
                .toDouble())).toString()).toString()
            x1.text = (((-b.text.toString().toDouble() + sqrt(
                delta.text.toString().toDouble()
            )) / (a.text.toString().toDouble() * 2))).toString()
            x2.text = (((-b.text.toString().toDouble() - sqrt(
                delta.text.toString().toDouble()
            )) / (a.text.toString().toDouble() * 2))).toString()
        }

    }}