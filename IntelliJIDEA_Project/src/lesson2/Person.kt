package lesson2

/**
 * Created by Clock on 2017/7/18.
 */
class Person constructor(id: Int) {//（构造函数No.0）主构造函数支持初始化id

    var id = id
    var name = ""
    var age = 0

    //（构造函数No.1）直接代理主构造函数
    constructor(name: String, id: Int) : this(id) {
        this.name = name
    }

    //（构造函数No.2）代理了构造函数No.1，间接代理主构造函数
    constructor(name: String, age: Int, id: Int) : this(name, id) {
        this.age = age
    }

}
