package main.java;

public class ForLoop {
    public static void startForLoop() {
        // simple for
        for (int i = 6; i > 0; i--) {
            System.out.println(i);
        }

        // embadded for loop
        for (int i = -3; i < 0; i++) {
            System.out.println("i = " + i);
            for (int f = -3; f < 0; f++) {
                System.out.println("f = " + f);
            }
        }
    }
}
