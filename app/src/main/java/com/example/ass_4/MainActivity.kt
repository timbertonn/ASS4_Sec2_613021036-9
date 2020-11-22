package com.example.ass_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun showDetail(v:View){
        var radioG:RadioGroup = findViewById(R.id.radio_g)
        var selectId:Int = radioG.checkedRadioButtonId
        var radioButton:RadioButton = findViewById(selectId)
        Tx_show.text = "Name: ${Edt_user.text}\nPassword: ${Edt_pass.text}\nGender: ${radioButton.text}\nE-mail: ${Edt_email.text}\nBirthday: ${Birthday.text}"
    }

    fun showDatePickerDialog(v: View){
        val newDateFragment = DatePicker()
        newDateFragment.show(supportFragmentManager, "Date Picker")
    }
    fun reset(v:View){
        Edt_user.text.clear()
        Edt_pass.text.clear()
        Edt_email.text.clear()
        radio_g.clearCheck()
        Birthday.text = "mm/dd/yy"
        Tx_show.text = "Show Information"
    }
}