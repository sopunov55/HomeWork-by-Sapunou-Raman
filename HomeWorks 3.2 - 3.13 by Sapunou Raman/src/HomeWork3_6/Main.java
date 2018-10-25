package HomeWork3_6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int day = r.nextInt(31), month = r.nextInt(11) +1, year = r.nextInt(2018);
        System.out.println("День: " + day + "     Месяц: " + + month + "   Год: " + year);
        if (day != 31){
            day++;
        }
        else{
            day = 1;
            if (month != 12){
                month++;
            }
            else{
                month = 1;
                year++;
            }
        }
        System.out.println("Прошло 24 часа...");
        System.out.println("День: " + day + "     Месяц: " + + month + "     Год: " + year);

    }
}
