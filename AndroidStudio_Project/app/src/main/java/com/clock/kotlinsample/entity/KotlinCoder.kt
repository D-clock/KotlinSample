package com.clock.kotlinsample.entity

/**
 * Created by Clock on 2017/6/11.
 */
//使用data class声明会自动生成getters、 setters、 equals()、 hashCode()、 toString() 以及 copy()方法
data class KotlinCoder(var name: String, var id: Int)