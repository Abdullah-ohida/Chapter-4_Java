
import java.util.Scanner;
public class SalaryCalculator {

    public static void main(String[] args) {
	// write your code here
        Scanner userInput = new Scanner(System.in);

        int counter = 0;
        int employee = 1;
        double payPerHour = 0;
        double hourWorked = 0;
        while (counter < 3){

           int newEmployee =  employee++;
            System.out.print("Enter amount paid per hour employee" + newEmployee + ": ");
            payPerHour = userInput.nextDouble();
               if(payPerHour < 0){
                payPerHour = 0;
            }

            System.out.print("Enter total hour worked in a week employee" + newEmployee + "(in hour, e.g 7) : ");
            hourWorked = userInput.nextInt();
              if(hourWorked < 0){
                hourWorked = 0;
            }
            double overTime;
            double grossPay;
            double newGross;
            double extralHour;
            double newGrossPay;

            if(hourWorked > 40){
                overTime= hourWorked - 40;
                newGross = hourWorked - overTime;

                grossPay = payPerHour * newGross;
                extralHour = overTime * (payPerHour * 1.5);

                newGrossPay = grossPay + extralHour;
                System.out.println("Employee" + newEmployee + " gross pay at " + hourWorked + "hr" + " = $" + newGrossPay);
                System.out.println("Employee" + newEmployee+ " Over Time pay = $" + extralHour + "\n");

            }else{
                grossPay = payPerHour * hourWorked;
                System.out.println("Employee" + newEmployee + " gross pay at " + hourWorked + "hr" + " = $" + grossPay + "\n");
            }

        }
        //user variables

    }
}

