package by.intexsoft;

public class TimeGuesser {
    int studentHours;
    int studentMinutes;

    public void studentArrive() {
        if (studentHours > 9)
        {
            System.out.println("Студент пришел позже назначенного времени");
        }
        else if (studentHours < 9)
        {
            System.out.println("Студент пришел раньше назначенного времени ");
        }
        else if (studentHours == 9)
        {
            System.out.print("Студент пришел в назначенный час и ");
            if (studentMinutes < 31)
            {
                System.out.println("минуты");
            }
            else
            {
                System.out.println("опаздал по минутам");
            }
        }

    }
}
