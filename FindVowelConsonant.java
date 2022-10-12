import java.util.Scanner;

public class FindVowelConsonant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any alphabet: ");
        char alphabet = scanner.next().charAt(0);

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
            System.out.println("Input letter " + alphabet + " is Vowel.");
        } else {
            System.out.println("Input letter " + alphabet + " is Consonant.");
        }
    }
}
