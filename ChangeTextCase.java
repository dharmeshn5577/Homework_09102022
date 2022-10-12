import java.util.Locale;
import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class ChangeTextCase {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input any alphabet in UPPERCASE : ");
        char alphabetInUppercase = scanner.next().charAt(0);


        if (alphabetInUppercase >='A'&& alphabetInUppercase<='Z'){
            char alphabetInLowercase = Character.toLowerCase(alphabetInUppercase);
            System.out.println("Expected output in lowercase : " + alphabetInLowercase);
        }else{
            System.out.println("Invalid input, only UPPERCASE input is valid.");
        }




    }
}
