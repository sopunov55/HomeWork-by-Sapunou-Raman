package HomeWork3_8;

public class Main {
    int finishNumber;

    static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Факториал числа: " + x + " = " + calculateFactorial(x));
    }
}
