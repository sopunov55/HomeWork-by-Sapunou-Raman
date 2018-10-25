package HomeWork3_7;

public class Main {
    public static void main(String[] args) {
        int a = 5, b = 5, c = 13, d = 8;
        int e = 15, f = 8;
        if (e * f > a * b + c * d) {
            System.out.println("На участке размером: " + e + " x " + f + " можно разместить 2 дома размерами "
                    + a + " x " + b + " и " + b + " x " + c);
        } else {
            System.out.println("На участке размером: " + e + " x " + f + " нельзя разместить 2 дома размерами "
                    + a + " x " + b + " и " + b + " x " + c);
        }
    }


}
