package main.java;

public class Main {
    public static void main(String[] args) {
        int a = 77;
        int b = 777;

        // if with one condition
        if (a > b) {
            System.out.println("a more than b");
        } else {
            System.out.println("b more than a");
        }

        // if with several conditions
        int g = 12;
        int h = 17;

        if (h > g) {
            System.out.println("h more than g");
        } else if (g == h) {
            System.out.println("g equal h");
        } else {
            System.out.println("g more than h");
        }
    }
}
