package app.hankdev.lkfj04.java;

public class Person {

    private String name;

    private boolean isMarried;

    public Person(String name, boolean isMarried) {
        this.name = name;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
