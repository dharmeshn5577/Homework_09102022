import java.util.Scanner;

public class FindInputCategory {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Input any value: ");
            char input = scanner.next().charAt(0);


            if ((input>='a'&& input<='z') || (input >='A'&& input<='Z')){
                System.out.println("Input " + input + " is an ALPHABET.");
            } else if(input>='0'&& input<='9') {
                System.out.println("Input " + input + " is a NUMBER.");
            }else{
                System.out.println("Input " + input + " is a SYMBOL.");
            }
        }
    }

