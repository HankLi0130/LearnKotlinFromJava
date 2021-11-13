package app.hankdev.lkfj09.java;

public class JavaTest09 {
    public static void main(String[] args) {
        //whileLoop();
        //doWhileLoop();
        //forLoop();
    }

    private static void whileLoop() {
        int count = 5;

        while (count > 0) {
            System.out.println("count is " + count);
            count--;
        }
    }

    private static void doWhileLoop() {
        int count = 5;

        do {
            System.out.println("count is " + count);
            count--;
        } while (count > 0);
    }

    private static void forLoop() {
        for (int count = 0; count < 5; count++) {
            System.out.println("count is " + count);
        }
    }
}
