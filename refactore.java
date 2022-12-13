package classProblemByAmolMateSir.Day9.EmployeeWage;

import java.util.Random;

public class refactore {
    String nameOfComapny;
    int numberOfWorkingDay;
    int workingHourPerMonth;

    public refactore(String nameOfComapny, int numberOfWorkingDay, int workingHourPerMonth) {
        this.nameOfComapny = nameOfComapny;
        this.numberOfWorkingDay = numberOfWorkingDay;
        this.workingHourPerMonth = workingHourPerMonth;
    }

    void check() {
        int ratePerHour = 20;
        int dailyHour = 8;
        int totalHour = 0;
        int day = 0;
        Random random = new Random();
        for (int i = 0; i < numberOfWorkingDay || i < workingHourPerMonth; i++) {
            int attendance = random.nextInt(3);
            switch (attendance) {
                case 1:
                    ratePerHour = 20;
                    dailyHour = 8;
                    System.out.println("present");
                    break;
                case 2:
                    System.out.println("absent");
                    break;
                default:
                    ratePerHour = 20;
                    dailyHour = 4;
                    System.out.println("part time");
            }
            totalHour = totalHour + dailyHour;
            day++;
        }
        int monthly = totalHour * 20;
        System.out.println("for total day or total hours :" + day);
        System.out.println("monthly wage for company : " + nameOfComapny + " is " + monthly);
    }
}
