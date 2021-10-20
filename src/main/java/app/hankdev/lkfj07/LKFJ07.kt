package app.hankdev.lkfj07

fun main() {

//    val role: Role = User()
    val role: Role = SuperUser()
    smartCast(role)
}

fun smartCast(role: Role) {

    // Java role instanceof User
    // Kotlin role is User

    when (role) {
        is User -> role.doAction()
        is SuperUser -> role.doSuperAction()
        else -> println("No such role...")
    }
}