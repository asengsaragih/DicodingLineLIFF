package com.android.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*

class DiceActivity : AppCompatActivity() {

//    ini untuk buat kaya java (private ImageView mDiceImageView)
    lateinit var mDiceImaage: ImageView
    lateinit var mRollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)

        mDiceImaage = findViewById(R.id.result_dice)
        mRollButton = findViewById(R.id.rol_button)

        mRollButton.text = "let's roll"

        mRollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun checkToast() {
        Toast.makeText(applicationContext, "Hello World", Toast.LENGTH_SHORT).show()
    }

    private fun rollDice() {
        val random = Random().nextInt(6) + 1

        val drawableDice = when (random) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        mDiceImaage.setImageResource(drawableDice)
    }
}
