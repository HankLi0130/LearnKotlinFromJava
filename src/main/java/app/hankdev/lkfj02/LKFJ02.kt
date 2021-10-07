package app.hankdev.lkfj02

fun main(args: Array<String>) {
    println("Hello, World!")
    println(hello("HankDev"))
    println("max: ${max(11, 22)}")
}

fun hello(name: String) = "Hello, $name"

fun max(a: Int, b: Int) = if (a > b) a else b