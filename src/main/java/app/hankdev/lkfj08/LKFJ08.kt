package app.hankdev.lkfj08

fun main() {
    val age = 18
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
    return if (age >= 18) {
        println("this is adult branch")
        "adult"
    } else {
        println("this is minor branch")
        "minor"
    }
}

fun getTitleLikeTernary(age: Int): String = if (age >= 18) "adult" else "minor"