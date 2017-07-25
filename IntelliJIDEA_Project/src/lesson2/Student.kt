package lesson2

/**
 * Created by Clock on 2017/7/23.
 */
class Student {

    var test: Int
        get() = this.test
        set(value) {
            this.test = value
        }

    var test2: String?
        get() = this.test2
        set(value) {
            this.test2 = test2
        }
    val test3: Any?
        get() = 1

    var id = -1
    var name = "unknown"
    var age: Int
        get() = 1
        set(value) {
            age = value
        }
    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            stringRepresentation = value
        }
}