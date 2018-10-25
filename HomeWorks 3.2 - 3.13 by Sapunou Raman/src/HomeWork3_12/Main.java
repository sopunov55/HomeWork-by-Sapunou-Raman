package HomeWork3_12;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        String z;
        int a = 0;

        int x = r.nextInt(1000000000);

        System.out.println("Имеем число " + x);
        z = String.valueOf(x);
        char[] finish = z.toCharArray();
        for(x = 0; x < finish.length;x++ )
        {
            a++;
            System.out.print(finish[x]);
            if (a % 3 ==0)
            {
                System.out.print(" ");
            }
        }

    }
}