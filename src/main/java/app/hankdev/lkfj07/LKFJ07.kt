package app.hankdev.lkfj07

fun main() {

//    val role: Role = User()
    val role: Role = SuperUser()
    smartCast(role)
}

fun smartCast(role: Role) {

    // The smart cast works only if a variable couldn’t have changed after the `is` check.
    // var role1: Role = role

    // Java     role instanceof User
    // Kotlin   role is User

    when (role) {
        is User -> role.doAction()
        is SuperUser -> role.doSuperAction()
        else -> println("No such role...")
    }
}