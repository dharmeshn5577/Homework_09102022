import java.util.Scanner;

public class ValueInterchange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Value of A: ");
        int a = scanner.nextInt();
        System.out.print("Value of B: ");
        int b = scanner.nextInt();
        System.out.println("Now");
        System.out.println("New value of A: " + b);
        System.out.print("New value of B: " + a);

    }
}
