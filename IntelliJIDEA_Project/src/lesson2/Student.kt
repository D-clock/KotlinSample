package lesson2

/**
 * Created by Clock on 2017/7/23.
 */
class Student {

    var id = -1
    var name = "unknown"
    var age : Int
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