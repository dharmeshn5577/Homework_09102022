import java.util.Scanner;

public class FindOddEven {

    public static void main(String[] args) {
       System.out.println("Entre the Number: ");

       // created String variable because our output is String value
       String input;

        // Created scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Restricted input to only integer value
            while (!scanner.hasNextInt()){
            System.out.println("Your input is INVALID, please enter only Numbers.");
            scanner.nextLine();
        }
        int number = scanner.nextInt();

        // used ternary operator for conditional statement
        input = (number%2 == 0) ? "Your input is an EVEN number" : "Your input is an ODD number";
        System.out.println(input);

//        if (number%2 == 0){
//            System.out.println("Your input is an EVEN number");}
//        else{
//            System.out.println("Your input is an ODD number");
//        }
    }
}
