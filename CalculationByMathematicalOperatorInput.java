import java.util.Scanner;

public class CalculationByMathematicalOperatorInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter your second number : ");
        int number2 = scanner.nextInt();
        System.out.print("Input mathematical symbol(+, -, *, /): ");
        char symbol = scanner.next().charAt(0);


    switch (symbol){

        case '+':
            System.out.println("Addition of Numbers " + number1 + "+" + number2 + " = " + (number1 + number2));
            break;
        case '-':
            System.out.println("Subtraction of Numbers " + number1 + "-" + number2 + " = " + (number1 - number2));
            break;
        case '*':
            System.out.println("Multiplication of Numbers " + number1 + "*" + number2 + " = " + (number1 * number2));
            break;
        case '/':
            System.out.println("Division of Numbers " + number1 + "/" + number2 + " = " + (number1 / number2));
            break;
        default:
            System.out.println("Invalid input, please enter mathematical symbol(+, -, *, /) only.");
    }

    }
}
