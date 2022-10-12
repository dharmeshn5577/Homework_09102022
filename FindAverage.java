import java.util.Scanner;

public class FindAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total;
        double average;

        System.out.println("Input any 5 numbers: ");
        System.out.print("Number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Number2: ");
        int number2 = scanner.nextInt();
        System.out.print("Number3: ");
        int number3 = scanner.nextInt();
        System.out.print("Number4: ");
        int number4 = scanner.nextInt();
        System.out.print("Number5: ");
        int number5 = scanner.nextInt();

        total = (number1 + number2 + number3 + number4 + number5);
        average = (total/5);
        System.out.println("Average of Numbers: " + average);
    }
}


