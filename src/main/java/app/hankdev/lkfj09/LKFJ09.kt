package app.hankdev.lkfj09

import java.util.*

fun main() {
//    whileLoop()
//    doWhileLoop()
//    forLoop()
//    forUntilLoop()
//    forDownToLoop()
//    iteratingOverMaps()
//    iteratingOverList()

// `in` usage
//    val a = 101
//    println(a in 0..100)
}

private fun whileLoop() {
    var count = 5

    while (count > 0) {
        println("count is $count")
        count--
    }
}

private fun doWhileLoop() {
    var count = 5

    do {
        println("count is $count")
        count--
    } while (count > 0)
}

private fun forLoop() {
    // Note that ranges in Kotlin are closed or inclusive, meaning the second value is also always a part of the range.
    val range = 0..4

    for (count in range) {
        println("count is $count")
    }
}

private fun forUntilLoop() {

    // for (count in 0..4 - 1)
    for (count in 0 until 4) {
        println("count is $count")
    }
}

private fun forDownToLoop() {
    for (count in 4 downTo 0 step 2) {
        println("count is $count")
    }
}

private fun iteratingOverMaps() {
    // The example shows that the for loop allows you to unpack an element of a collection you’re iterating over.
    val map = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.code)
        map[c] = binary
    }

    for ((letter, binary) in map) {
        println("letter: $letter, binary: $binary")
    }
}

private fun iteratingOverList() {
    val list = arrayListOf("kotlin", "is", "great", "!")

    for ((index, str) in list.withIndex()) {
        println("index:$index, string: $str")
    }
}