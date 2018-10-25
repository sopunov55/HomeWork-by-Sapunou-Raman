package HomeWork3_2;

public class Main {
    public static void main(String[] args) {
        int s = 37000000; //вывести указанное число в неделях, днях, секундах, минутах
        int sec, m, min, hours, h, days, d,  weeks;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hours = h%24;
        d = (h - hours) / 24;
        days = d%7;
        weeks = (d - days) /7;


        System.out.println(weeks +  " недель " + days + " дней " + hours + " часов " + min + " минут " + sec + "секунд");
    }
}
