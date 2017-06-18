package lesson1

/**
 * Created by Clock on 2017/6/18.
 */

class KotlinStatic {
    companion object {
        @JvmStatic
        var kotlinInt: Int = 0

        const val kotlinInt2: Int = 1

        @JvmStatic
        fun getInstance() : KotlinStatic{
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