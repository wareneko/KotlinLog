package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("a", 1, "b")      // Humanのインスタンス化、

        human.say()
        human.think()

        val human2 = Human("c", 2, "d")

        human2.say()
        human2.think()
     }
}

