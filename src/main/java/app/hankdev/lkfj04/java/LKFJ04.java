package app.hankdev.lkfj04.java;

import app.hankdev.lkfj04.Person;

public class LKFJ04 {

    public static void main(String[] args) {

        // Kotlin class
        Person person = new Person("Hank Li", true);
        System.out.println(person.getName());
        System.out.println(person.isMarried());
    }
}
