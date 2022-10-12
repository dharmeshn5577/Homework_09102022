import java.util.Scanner;

public class FindNumberCategory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = scanner.nextInt();

        if (number<0){
            System.out.println("Your input " + number + " is a NEGATIVE number.");
        } else if (number==0) {
            System.out.println("Your input is ZERO.");
        }else {
            System.out.println("Your input " + number + " is a POSITIVE number.");
        }
    }
}
