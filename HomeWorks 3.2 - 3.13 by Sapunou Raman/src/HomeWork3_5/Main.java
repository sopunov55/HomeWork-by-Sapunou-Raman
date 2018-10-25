package HomeWork3_5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        StringBuilder rub;

        int x = r.nextInt(50); // имеется число, дописать к нему слово рублей в правильном падеже
        if (x % 10 == 1 && x != 11) {
            System.out.println(x + " рубль. ");
        } else if (x % 10 == 2 || x % 10 == 3 || x % 10 == 4) {
            System.out.println(x + " рубля. ");
        } else {
            System.out.println(x + " рублей. ");
        }


    }
}
