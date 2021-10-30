package app.hankdev.lkfj08.java;

public class JavaTest08 {
    public static void main(String[] args) {
        int age = 17;
        showTitle(age);

        String title1 = getTitle(age);
        System.out.println(title1);

        String title2 = getTitleTernary(age);
        System.out.println(title2);
    }

    public static void showTitle(int age) {
        if (age >= 18) {
            System.out.println("adult");
        } else {
            System.out.println("minor");
        }
    }

    public static String getTitle(int age) {
        if (age >= 18) {
            return "adult";
        } else {
            return "minor";
        }
    }

    public static String getTitleTernary(int age) {
        return age >= 18 ? "adult" : "minor";
    }
}
