package lesson2

/**
 * Created by Clock on 2017/7/22.
 */
open class Animal {

    var name = "unknown"

    constructor(name: String) {
        this.name = name
    }

    open fun sound() {
        //do sth...
    }
}

class Cat : Animal {

    var food = "unknown"

    constructor(name: String, food: String) : super(name) {//代理实现父类的二级构造函数
        this.food = food
    }

    override fun sound() {
        //do sth...
    }
}