package com.example.myshop

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_product.*




class ProductActivity : AppCompatActivity() {

     private var parentLinearLayout : LinearLayout ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        setSupportActionBar(toolbar)

         parentLinearLayout = findViewById(R.id.parent_linear_layout)

    }
   fun onAddField(v: View) {
       val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
       val rowView = inflater.inflate(R.layout.add_field, null)
       parentLinearLayout?.addView(rowView, parentLinearLayout?.childCount!! - 1)
   }
    fun onDeleteField(v:View){
        parentLinearLayout?.removeView(v.parent as View)
    }


}

