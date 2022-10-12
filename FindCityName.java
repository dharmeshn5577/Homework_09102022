import java.util.Scanner;

public class FindCityName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cityName;

        System.out.print("Enter any alphabet from A to F : ");
        cityName = scanner.next();


        switch (cityName) {
            case "a":
            case "A":
                System.out.println("City name starting from letter A is 'Ahmedabad'");
                break;
            case "b":
            case "B":
                System.out.println("City name starting from letter B is 'Banglore'");
                break;
            case "c":
            case "C":
                System.out.println("City name starting from letter C is 'Chennai'");
                break;
            case "d":
            case "D":
                System.out.println("City name starting from letter D is 'Delhi'");
                break;
            case "e":
            case "E":
                System.out.println("City name starting from letter E is 'Ernakulam'");
                break;
            case "f":
            case "F":
                System.out.println("City name starting from letter F is 'Fatehpur'");
                break;
            default:
                System.out.println("Invalid input, please enter alphabet from A to F only.");
        }


    }
}
