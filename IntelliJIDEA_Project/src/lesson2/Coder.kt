package lesson2

/**
 * Created by Clock on 2017/7/16.
 */
class Coder constructor(id: Int, name: String) {
    var id = 0
    var name = "default_coder"

    init {
        println("start init")
        println("id: $id , name: $name")
        println("end init")
    }
}