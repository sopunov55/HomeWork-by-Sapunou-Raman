package by.intexsoft;

public class Main
{
    public static void main(String[] args)
    {
        TimeGuesser student = new TimeGuesser(); //ПОДКЛЮЧАЕМ КЛАСС TIMEGUESSER
        /*
        ЕСЛИ ЧАСЫ УКАЖЕМ БОЛЬШЕ 9 ТО СТУДЕНТ ОПАЗДАЕТ, МЕНЬШЕ 9 ПРИДЕТ ТО ПРИДЕТ РАНЬШЕ
        А ЕСЛИ УКАЖЕМ В 9 ТО ПРОЙДЕТ АНАЛОГИЧНАЯ ПРОВЕРКА НА МИНУТЫ.
        */
        student.studentHours = 9; // УКАЗЫВАЕМ ЧАС ПРИБЫТИЯ СТУДЕНТА.
        student.studentMinutes = 30; // УКАЗЫВАЕМ МИНУТЫ ПРИБЫТИЯ СТУДЕНТА

        student.studentArrive(); //ПОДКЛЮЧАЕМ МЕТОД STUDENTARRIVE
    }
}
