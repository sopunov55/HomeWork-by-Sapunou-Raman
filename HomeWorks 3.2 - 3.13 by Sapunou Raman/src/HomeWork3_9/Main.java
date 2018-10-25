package HomeWork3_9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] exampleMassiv = new int[10];
        Random rand = new Random();
        for (int z = 0; z < 10; z++) {
            exampleMassiv[z] = rand.nextInt(10);
        }

        System.out.print("Мы имеем массив со случайными 10-ю значениями:  ");
        for (int x = 0; x < exampleMassiv.length; x++) {
            System.out.print("[ " + exampleMassiv[x]);
            System.out.print(" ]");
        }

        for (int i = 0; i < exampleMassiv.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < exampleMassiv.length; j++) {
                if (exampleMassiv[j] < exampleMassiv[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = exampleMassiv[i];
            exampleMassiv[i] = exampleMassiv[minIndex];
            exampleMassiv[minIndex] = temp;
        }


        System.out.println(" ");
        System.out.print("Самое большое число в масиве:  ");
        System.out.print("[ " + exampleMassiv[9]);
        System.out.print(" ]");


    }
}

