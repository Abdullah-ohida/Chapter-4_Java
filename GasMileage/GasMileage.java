import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float milePerGallon = 0;
        System.out.print("Enter mile value : ");
        int mileValue = scanner.nextInt();
        System.out.print("Enter gallon value : ");
        int gallonValue = scanner.nextInt();

        milePerGallon = mileValue / gallonValue;
        System.out.print("Mile per gallon for mile-value: " + mileValue + " and gallon: " + gallonValue + " is " + milePerGallon + "Mpg \n");

        System.out.print("Enter 1 to continue or -1 to exit this operation: ");
        int userInput = scanner.nextInt();
        while (userInput != -1){

            System.out.print("Enter mile value : ");
            mileValue = scanner.nextInt();
            System.out.print("Enter gallon value : ");
            gallonValue = scanner.nextInt();

            milePerGallon = mileValue / gallonValue;
            System.out.print("Mile per gallon for mile-value: " + mileValue + " and gallon: " + gallonValue + " is " + milePerGallon + "Mpg \n");

            System.out.print("Enter 1 to continue or -1 to exit this operation: ");
            userInput = scanner.nextInt();



        }
    }
}

