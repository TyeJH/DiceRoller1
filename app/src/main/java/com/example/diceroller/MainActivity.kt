package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var diceImage1 : ImageView
    private lateinit var diceImage2 : ImageView
    private lateinit var diceImage3 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)
        diceImage3 = findViewById(R.id.dice_image3)

        val rollBtn: Button = findViewById(R.id.roll_button)
        rollBtn.setOnClickListener { rollDice() }
    }

    private fun rollDice(){
        diceImage1.setImageResource(getRandomImage())
        diceImage2.setImageResource(getRandomImage())
        diceImage3.setImageResource(getRandomImage())
    }

    private fun getRandomImage() : Int {

        return when (Random().nextInt(6)+1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

}
