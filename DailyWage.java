package classProblemByAmolMateSir.Day9.EmployeeWage;

import java.util.Random;

public class DailyWage extends Presenty {
    static void check() {
        int perHour = 20;
        int dailyHour = 8;
        Random random = new Random();
        int attendance = random.nextInt(3);
        switch (attendance) {
            case 1:
                perHour = 20;
                dailyHour = 8;
                System.out.println("present");
                break;
            case 2:
                System.out.println("absent");
                break;
            default:
                perHour = 20;
                dailyHour = 4;
                System.out.println("part time");
        }
        int dailyWage = perHour * dailyHour;
        System.out.println("daily wage is : " + dailyWage);

    }
}
