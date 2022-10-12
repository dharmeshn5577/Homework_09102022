import java.util.Scanner;

public class FindLeapYear {

    public static void main(String[] args) {
        System.out.println("Enter the Year: ");

        // Created scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Restricted input to only integer value.
        while (!scanner.hasNextInt()){
            System.out.println("Your input is INVALID, please enter VALID input.");
            scanner.nextLine();
        }

        int year = scanner.nextInt();

        if ((year%4==0) && (year%100 !=0) || (year%400==0)){
            System.out.println("Year " + year + " is a LEAP year");
        }
        else{
            System.out.println("Year " + year + " is not a LEAP year");
        }
    }
}
