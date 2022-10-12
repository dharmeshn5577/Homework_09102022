import java.util.Scanner;
    public class StudentResult {

        // 100 Marks per subject, hence total marks is 300
        double totalMarks = 300.0;
        int totalObtainedMarks;
        double percentage;


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            StudentResult studentResult = new StudentResult();

            studentResult.result(scanner);
        }

        public void result(Scanner scanner) {

            double percentageRoundOff;


            System.out.println("Enter Student Details: ");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll No.: ");
            int rollNo = scanner.nextInt();
            System.out.println("Enter Marks Details: ");
            System.out.print("Maths: ");
            int maths = scanner.nextInt();
            System.out.print("English: ");
            int english = scanner.nextInt();
            System.out.print("Science: ");
            int science = scanner.nextInt();

            System.out.print("Total Obtained Marks: ");
            totalObtainedMarks = maths + english + science;
            System.out.println(totalObtainedMarks);

            percentage = (totalObtainedMarks / totalMarks) * 100;

            //Round off the percentage to 2 decimal
            percentageRoundOff = (double) (Math.round(percentage * 100.0) / 100.0);
            System.out.print("% Obtained: ");
            {
                System.out.println(percentageRoundOff + "%");
            }

            if (maths < 35 || english < 35 || science < 35) {
                System.out.println("Result: FAIL");
            } else {
                System.out.println("Result: PASS");
                if (percentageRoundOff >= 80) {
                    System.out.println("Grade: A+");
                } else if (percentageRoundOff >= 79) {
                    System.out.println("Grade: A");
                } else if (percentageRoundOff >= 59) {
                    System.out.println("Grade: B");
                } else {
                    System.out.println("Garde: C");
                }
            }



        }
    }








