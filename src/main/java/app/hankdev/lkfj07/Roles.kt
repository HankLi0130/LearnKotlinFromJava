package app.hankdev.lkfj07

interface Role {}

class User : Role {
    fun doAction() {
        println("User do something...")
    }
}

class SuperUser : Role {
    fun doSuperAction() {
        println("Super user do something...")
    }
}