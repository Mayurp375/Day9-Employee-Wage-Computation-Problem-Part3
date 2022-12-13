package classProblemByAmolMateSir.Day9.EmployeeWage;

import java.util.Random;

public class DailyWage extends Presenty {
    static void check() {
        int perHour = 20;
        int dailyHour = 8;
        int totalHour =0;
        Random random = new Random();
        for (int i = 0; i <= 20; i++) {
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
           totalHour = totalHour + dailyHour;
        }
        int monthly = totalHour * 20;
        System.out.println("monthly wage is : " + monthly);
    }
}
