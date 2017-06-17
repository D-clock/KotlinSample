package com.clock.kotlinsample.lesson

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.clock.kotlinsample.R
import com.clock.kotlinsample.entity.KotlinCoder

class Lesson0Activity : AppCompatActivity(), View.OnClickListener {

    val TAG: String = "Lesson0Activity" //声明一个常量

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson0)

        var kotlinCoder = KotlinCoder("clock", 1)//声明一个变量，类型自动推断，无需用Java的new

        findViewById(R.id.btn_show_kotlin_coder).setOnClickListener {//使用Lambda表达式

            var info = "name: " + kotlinCoder.name + ", id: " + kotlinCoder.id

            toast(info, Toast.LENGTH_SHORT)

        }

        findViewById(R.id.btn_implement_interface).setOnClickListener { onClick(it) }//注册Activity实现的OnClickListener


        var author : String? = "Clock"
        author = null

    }

    /**
     * 声明一个打印Toast的函数
     */
    fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {//对Java API的一个封装
        Toast.makeText(this, message, duration).show()
    }

    override fun onClick(p0: View?) {
        var viewId = p0!!.id

        if (viewId == R.id.btn_implement_interface) {
            toast("Click Me", Toast.LENGTH_SHORT)
        }
    }
}
