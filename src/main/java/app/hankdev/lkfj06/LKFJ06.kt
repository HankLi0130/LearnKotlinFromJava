package app.hankdev.lkfj06

fun main() {
    // When
    val score1 = getScore('A')
    println("score: $score1")

    // When with enum class
    val score2 = getScore(Latter.A)
    println("score: $score2")

    // When with arbitrary objects
    getScore(Latter.A, Latter.B)

    // When without an argument
    val score4 = getScore(65)
    println("score: $score4")
}