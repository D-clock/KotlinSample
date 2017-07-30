package lesson2

/**
 * Created by Clock on 2017/7/23.
 */
class Student {

    var name = "D_clock爱吃葱花" //名字属性可变，用var
    val birthday = "1994-10-24" //生日属性不可变，用val
        get() = field
    var age: Int? = 0
        get() = field
        set(value) {
            field = value
        }
    lateinit var ageStr: String //String不是基础类型，可以使用lateinit初始化

}