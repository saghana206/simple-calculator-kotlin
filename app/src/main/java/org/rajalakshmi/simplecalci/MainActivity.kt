package org.rajalakshmi.simplecalci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input1: EditText=findViewById(R.id.input1)
        val input2: EditText=findViewById(R.id.input2)
        val result: EditText=findViewById(R.id.result)

        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val mulop: Button = findViewById(R.id.mulop)
        val divop: Button = findViewById(R.id.divop)
        val modop: Button = findViewById(R.id.modop)

        button2.setOnClickListener{
            var firstno = input1.text.toString().toInt()
            var secondno = input2.text.toString().toInt()

            result.setText((firstno +secondno).toString())

        }
        button3.setOnClickListener{
            var firstno = input1.text.toString().toInt()
            var secondno = input2.text.toString().toInt()

            result.setText((firstno -secondno).toString())

        }
        mulop.setOnClickListener{
            var firstno = input1.text.toString().toInt()
            var secondno = input2.text.toString().toInt()

            result.setText((firstno *secondno).toString())

        }
        divop.setOnClickListener{
            var firstno = input1.text.toString().toInt()
            var secondno = input2.text.toString().toInt()

            result.setText((firstno /secondno).toString())

        }
        modop.setOnClickListener{
            var firstno = input1.text.toString().toInt()
            var secondno = input2.text.toString().toInt()

            result.setText((firstno %secondno).toString())

        }

    }
}