class Class (name: String, age: Int) {
    val name : String
    val age : Int

    init {
        this.name = name
        this.age = age
    }

    fun printOut() {
        println("${this.name} is ${this.age} years old")
    }
}

class Class2 {
    val name: String
    val age: Int

    constructor(name : String, age: Int) {
        this.name = name
        this.age = age
    }

    fun printOut() {
        println("${this.name} is ${this.age} years old")
    }
}

fun main(args: Array<String>) {
    val c1 = Class("Kevin", 23)
    val c2 = Class2("Anthony", 20)

    c1.printOut()
    c2.printOut()
}