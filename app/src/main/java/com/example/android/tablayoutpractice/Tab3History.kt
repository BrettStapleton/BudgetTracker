package com.example.android.tablayoutpractice

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.tab3_history.*

class Tab3History : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
/*
        val spinner: Spinner = months_spinner

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(

            //here is where the error happens
            //the context is wrong
            spinner.context,

            R.array.months_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }
*/
        return inflater.inflate(R.layout.tab3_history, container, false)
    }
}