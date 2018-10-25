package HomeWork3_3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(100);//создать случайное число, проверить является ли последняя цифра семеркой
        System.out.println("Число " + x);
        if (x%10 == 7)
            System.out.println("Последняя цифра является семеркой");
        else
            System.out.println("Последняя цифра не является семеркой");
    }
}
