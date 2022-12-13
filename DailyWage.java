package classProblemByAmolMateSir.Day9.EmployeeWage;

import java.util.Random;

public class DailyWage extends Presenty {
    static void check() {
        int perHour = 20;
        int dailyHour = 8;
        Random random = new Random();
        int attendance = random.nextInt();
        if (attendance == 1) {
            perHour = 20;
            dailyHour = 8;
            System.out.println("present");
        } else {
            System.out.println("absent");
        }
        int dailyWage = perHour * dailyHour;
        System.out.println("daily wage is : " + dailyWage);

    }
}
