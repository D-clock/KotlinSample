package lesson1

/**
 * Created by Clock on 2017/6/18.
 */

class KotlinStatic {
    companion object Test {
        var kotlinInt: Int = 0
        fun getInstance(): KotlinStatic {
            return KotlinStatic()
        }
    }
}

fun main(args: Array<String>) {
    //定义可变变量
    var id: Int = 1
    var name: String = "D_clock爱吃葱花"
    //定义不可变变量
    val useVal: Int = 1000

    //类型推导
    var tmpId = 1
    var tmpName = "D_clock爱吃葱花"

    var x = (1 shl 2) and 0x000FF000
    var y = 0x000FF000
    var z = y.inv() //z是y取反获得的

    var useChar: Char = 'c'

    var useString: String = "I am a boy"
    var firstChar: Char = useString[0] //相当于Java的String.charAt(0)
    println("useString: $firstChar")

    var nickname: String = "D_clock爱吃葱花"
    println("my nickname is $nickname")//输出昵称
    println("nickname length: ${nickname.length}")//输出昵称的长度

    useArray()
    useIf()
    useWhen(15)
    useFor()
    useWhile()
    useJump()

}

fun useJump() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val numbers2 = arrayOf(1, 3, 5, 7, 9)
    //设置testLab标签名
    testLab@ for (num in numbers) {
        println("num: $num")
        for (num2 in numbers2) {
            if (num == 3) {
                break@testLab//直接中断标签指定的整个循环
            }
        }
    }

}

fun useWhile() {
    var counter = 10
    while (counter > 0) {
        counter--
        println("counter: $counter")
    }

    do {
        counter++
        println("counter: $counter")
    } while (counter < 10)
}

fun useFor() {
    val students: Array<String> = arrayOf("Clock", "D_clock", "技术视界")

    for (student in students) {//输出学生名字
        println("student: $student")
    }
    for ((index, student) in students.withIndex()) {//输出学生的下标和名字
        println("the element at $index is $student")
    }
}

fun useWhen(input: Int) {
    var result = when (input) {
    //判断input是否为1
        1 -> println("input == 1")
    //判断input是否为2
        2 -> {
            println("input == 2")
        }
    //input是否在10到20的范围内
        in 10..20 -> println("input number in the range")
    //input是否不在20到30的范围内
        !in 20..30 -> println("input number outside the range")
        else -> { //When作为表达式使用时，最后一定要以else
            println("input: $input")
        }
    }
    println("result: $result")
}

fun useIf() {
    //使用If表达式判断a、b的大小
    var a = 5
    var b = 3
    var result = if (a > b) {
        println("a > b")
        true //返回结果
    } else {
        println("a <= b")
        false
    }
    println("result: $result")
}

fun useArray() {
    //创建一个普通的String数组
    val students: Array<String> = arrayOf("Clock", "D_clock", "技术视界")
    val studentNums = arrayOf(1, 2, 3)
    //创建一个int数组，避免封箱装箱操作
    val intArray = intArrayOf(1, 2, 3)
    //创一个长度为10，元素内容皆为null的数组
    val emptyArray = arrayOfNulls<String>(10)
    //使用闭包初始化一个Array<String>，数组内容为["0", "1", "4", "9", "16"]
    val asc = Array(5, { i -> (i * i).toString() })
}

//参数变长
fun displayActors(vararg name: String) {
    println("actors: " + name);
}

//有返回参数的函数
fun getName(): String {
    return "Kotlin"
}

//无返回参数的函数
fun displayName(name: String) {
    println("name: $name")
}

fun useBasic() {
    //使用各种基础类型定定义变量
    var useByte: Byte = 10
    var useShort: Short = 100
    var useInt: Int = 0
    var useLong: Long = 10000L
    var useDouble: Double = 0.0001
    var useFloat: Float = 0.01f
    var useChar: Char = 'a'
    var useBoolean: Boolean = true
    var useString: String = "Kotlin"
}