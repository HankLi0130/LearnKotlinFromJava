package app.hankdev.lkfj06.java;

public class JavaScore {

    public static void getScore(char latter) {
        switch (latter) {
            case 'A':
                System.out.println("You got 10!");
                break;
            case 'B':
                System.out.println("You got 9!");
                break;
            case 'C':
                System.out.println("You got 8!");
                break;
            default:
                System.out.println("You got 7!");
        }
    }
}
