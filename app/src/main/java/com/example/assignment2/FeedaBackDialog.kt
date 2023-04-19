package com.example.assignment2

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.DialogFragment

class FeedaBackDialog:DialogFragment(R.layout.feedback_dialog) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val submit : Button = view.findViewById(R.id.button2)
        val cancel : Button = view.findViewById(R.id.button)
        val comment : EditText = view.findViewById(R.id.edtxtComment)
        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroup)

        cancel.setOnClickListener {
            dismiss()
        }
        submit.setOnClickListener {
            val m1: MainActivity = getActivity() as MainActivity
            val option : Int = radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(option)

            m1.feedback(radioButton.text.toString(),comment.text.toString())
            dismiss()
        }

    }

}