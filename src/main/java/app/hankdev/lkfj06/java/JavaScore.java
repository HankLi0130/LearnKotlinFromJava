package app.hankdev.lkfj06.java;

public class JavaScore {

    public static void getScore(char latter) {
        switch (latter) {
            case 'a':
                System.out.println("You got 10!");
                break;
            case 'b':
                System.out.println("You got 9!");
                break;
            case 'c':
                System.out.println("You got 8!");
                break;
            default:
                System.out.println("You got 7!");
                break;
        }
    }
}
