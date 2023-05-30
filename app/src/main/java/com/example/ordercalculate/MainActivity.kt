package com.example.ordercalculate

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.ordercalculate.R
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.SnackbarContentLayout

class MainActivity : AppCompatActivity() {
    lateinit var plusBtn: Button
    lateinit var minusBtn:Button
    lateinit var countTxt: TextView
    lateinit var finalSum: TextView
    lateinit var checkOut: Button
    lateinit var finalMsg: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0
        var temp1 = 0
        var temp2 = 0

        plusBtn = findViewById(R.id.plusBtnId)
        minusBtn = findViewById(R.id.minusBtnId)
        countTxt = findViewById(R.id.countTxtId)
        finalSum = findViewById(R.id.sumOfproduct)
        checkOut = findViewById(R.id.checkOutId)
        finalMsg = findViewById(R.id.finalMsg)

        plusBtn.setOnClickListener{
            count++
            countTxt.text = "$count"
            finalSum.text = "$${count * 10}"

        }
        minusBtn.setOnClickListener{
            if (count > 0){
                count--
                countTxt.text = "$count"
                finalSum.text= "$${count * 10}"
            }else{
                count = 0
            }
        }
        checkOut.setOnClickListener{
            finalMsg.text = "Your bill is paid. Thank you for shoping with us"
        }

    }
}