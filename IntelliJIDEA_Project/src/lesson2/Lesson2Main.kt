package lesson2

/**
 * Created by Clock on 2017/7/16.
 */

fun main(args: Array<String>) {

    var coder = Coder(1, "coder")//创建一个Coder对象

    println("coder id: ${coder.id}")//打印输出coder对象的信息
    println("coder name: ${coder.name}")

    var person = Person("clock", 18, 2)
    println("user id: ${person.id}")
    println("user name: ${person.name}")
    println("user age: ${person.age}")

    /*var student = Student()
    println("student: ${student.id}")*/

    var animal = Animal("Tom")
    var cat = Cat("Tom", "Fish")

    var student = Student()
    student.age = 18 //年龄赋值
    println("student birthday: ${student.birthday}")
    println("student name: ${student.name}")
    println("student age: ${student.age}")

}