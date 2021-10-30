package app.hankdev.lkfj08

fun main() {
    val age = 17
    showTitle(age)

    val title = getTitle(age)
    println(title)
}

fun showTitle(age: Int) {
    if (age >= 18) {
        println("adult")
    } else {
        println("minor")
    }
}

fun getTitle(age: Int): String {
    if (age >= 18) {
        return "adult"
    } else {
        return "minor"
    }
}