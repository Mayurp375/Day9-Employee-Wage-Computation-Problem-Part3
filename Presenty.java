package classProblemByAmolMateSir.Day9.EmployeeWage;

import java.util.Random;

public class Presenty {
    static  void check(){
        Random random = new Random();
        int attendance = random.nextInt();
        if(attendance == 1){
            System.out.println("present");
        }else{
            System.out.println("absent");
        }
    }
}
