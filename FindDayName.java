import java.util.Scanner;

public class FindDayName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day number: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("In the week day 1 is Monday");
                break;
            case 2:
                System.out.println("In the week day 2 is Tuesday");
                break;
            case 3:
                System.out.println("In the week day 3 is Wednesday");
                break;
            case 4:
                System.out.println("In the week day 4 is Thursday");
                break;
            case 5:
                System.out.println("In the week day 5 is Friday");
                break;
            case 6:
                System.out.println("In the week day 6 is Saturday");
                break;
            case 7:
                System.out.println("In the week day 7 is Sunday");
                break;
            default:
                System.out.println("Invalid input, please enter day number between 1 to 7 only.");
        }
    }
}
