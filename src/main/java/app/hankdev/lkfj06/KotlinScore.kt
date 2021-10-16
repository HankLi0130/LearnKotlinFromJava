package app.hankdev.lkfj06

fun getScore(latter: Char): Int {
    return when (latter) {
        'A' -> {
            println("You got 10!")
            10
        }
        'B' -> {
            println("You got 9!")
            9
        }
        'C' -> {
            println("You got 8!")
            8
        }
        else -> {
            println("You got 7!")
            7
        }
    }
}

fun getScore(latter: Latter): Int {
    return when (latter) {
        Latter.A -> 10
        Latter.B -> 9
        Latter.C -> 8
        Latter.OTHERS -> 7
    }
}

fun getScore(latter1: Latter, latter2: Latter) {
    when (setOf(latter1, latter2)) {
        setOf(Latter.A, Latter.B) -> println("You are awesome!")
        setOf(Latter.C, Latter.OTHERS) -> println("Go for it, don't give up!")
        else -> println("Oh! something wrong...")
    }
}

fun getScore(ascii: Int): Int {
    return when {
        ascii.toChar() == 'A' -> 10     // 65
        ascii.toChar() == 'B' -> 9      // 66
        ascii.toChar() == 'C' -> 8      // 67
        else -> 7
    }
}
