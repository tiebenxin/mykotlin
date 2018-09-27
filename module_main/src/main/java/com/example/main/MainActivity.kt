package com.example.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import com.example.chat.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_login.setOnClickListener { toLogin() }

        bt_chat.setOnClickListener {
            toChat()
        }

    }

    private fun toLogin() {
        ARouter.getInstance()
                .build("/login/login")
                .navigation()
    }

    private fun toChat() {
        ARouter.getInstance()
                .build("/chat/chat")
                .navigation()
    }

}
