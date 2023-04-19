package com.example.assignment2

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.DialogFragment
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class DateTimeDialog : DialogFragment(R.layout.datetime_dialog) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val donebtn : Button = view.findViewById(R.id.donebtn)
        val txtView : TextView = view.findViewById(R.id.txtView)

        val formatter = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy")
        val current = LocalDateTime.now().format(formatter)
        txtView.text = current

        donebtn.setOnClickListener {
            dismiss()
        }




    }
}