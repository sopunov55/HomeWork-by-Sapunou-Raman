package HomeWork3_11;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt();
        double y = r.nextDouble();
        if (x % 1 == 0) {
            System.out.println("Число переменной X простое");
        } else {
            System.out.println("Число переменной X сложное");
        }
        if (y % 1 == 0) {
            System.out.println("Число переменной Y простое");
        } else {
            System.out.println("Число переменной Y сложное");
        }
    }
}
