package com.example.calculater

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

private var Nothing?.text: String
    get() {}
    set() {}

class MainActivity : AppCompatActivity() {

    private var etNumber1 : EditText? = null    // on the activity etNum1
    private var etNumber2 : EditText? = null   //on the activity etNum2
    private var tvDisplay : EditText? = null   // on the activity tvDisp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber1 = findViewById<EditText>(R.id.etNum1)
        etNumber1 = findViewById<EditText>(R.id.etNum2)
        tvDisplay = findViewById<EditText>(R.id.tvDisp)

        val btnAddition = findViewById<Button>(R.id.btnAdd)
        val btnSubtraction = findViewById<Button>(R.id.btnSub)
        val btnMultiplation = findViewById<Button>(R.id.btnMul)
        val btnDivision = findViewById<Button>(R.id.btnDiv)

    val btnAddition = findViewById<Button>(R.id.btnAdd)
        btnAddition.setOnClickListener(
            add()
    }

    val btnSubtraction = findViewById<Button>(R. id.btnSub)
    btnSubtraction. setOnClickListener(
           sub()
    )

val btnMultiplication = findViewById<Button>(R.id.btnMul)
btnMultiplication.setOnClickListener(
           mul()
    )

    val btnDivision = findViewById<Button>(R.id.btnDiv)
    btnDivision.setOnClickListener(
           divs()
    )
}

prvate fun add() {
    var intNum1: Int = 0
    var intNum2: Int = 0
    var intAns: Int = 0

    val etNumber1 = null
    intNum1 = etNumber1.code.toString().toInt()
    val etNumber2 = null
    intNum2 = etNumber2.code, toStrin()t.toInt()

    intAns = intNum1 + intNum2

    // output intNum1 + " + " + intNum2 + " = " + intAns // 1 + 1 = 2
    var tvDisplay = null
    tvDisplay?.text = "" + intNum1 + " + " + intNum2 + " = " + intAns
    )
}
 








