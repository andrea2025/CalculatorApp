package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    var operator = "+"
    var oldNum = ""
    var newOperator = true



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun numValue(view: View) {
        if (newOperator)
            textInput.setText("")
        newOperator = false
        var actualValue = textInput.text.toString()
        println(actualValue + "actual")
        var numBtn = view as Button

        when(numBtn.id) {

            R.id.btnOne -> {
                textInput.setText(actualValue + "1")
            }
            R.id.btnTwo -> {
                textInput.setText(actualValue + "2")
            }
            R.id.btnThree -> {
                textInput.setText(actualValue + "3")
            }
            R.id.btnFour -> {
                textInput.setText(actualValue + "4")
            }
            R.id.btnfive -> {
                textInput.setText(actualValue + "5")
            }
            R.id.btnSix -> {
                textInput.setText(actualValue + "6")
            }
            R.id.btnSeven -> {
                textInput.setText(actualValue + "7")
            }
            
            R.id.btnEight -> {
                textInput.setText(actualValue + "8")
            }
            R.id.btnNine -> {
                textInput.setText(actualValue + "9")
            }
            R.id.btnZero -> {
                textInput.setText(actualValue + "0")
            }
            R.id.btnCancel -> {
                textInput.setText("0")
                textResult.setText(" ")
            }
            R.id.dot -> {
                textInput.setText(actualValue + ".")
            }


        }

    }


    fun operator(view: View) {
        newOperator = true
        oldNum = textInput.text.toString()
        println(oldNum + "old")
        var operatorSelect: Button = view as Button
        when (operatorSelect.id) {
            btnAdd.id -> {(operator + "+")}
            btnSubstract.id -> {
                operator = "-"
            }
            btnMultiply.id -> {
                operator = "*"
            }
            btnDivide.id -> {
                operator = "/"
            }

        }
    }

    fun equalEvent(view: View) {

        var valueOne:String = textInput.text.toString()
        println(valueOne + "value")
        var result = 0.0
        when(operator){
            "+" -> {result = oldNum.toDouble() + valueOne.toDouble()}
            "-" -> {result = oldNum.toDouble() - valueOne.toDouble()}
            "/" -> {result = oldNum.toDouble() / valueOne.toDouble()}
            "*" -> {result = oldNum.toDouble() * valueOne.toDouble()}
        }
        println(result)
        textResult.setText(result.toString())


    }




}

