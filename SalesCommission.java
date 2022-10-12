import java.util.Scanner;

public class SalesCommission {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sales ID: ");
        String salesID = scanner.nextLine();
        System.out.print("Seller's Name: ");
        String sellersName = scanner.next();
        System.out.print("Salary Basic : £");
        double salaryBasic = scanner.nextDouble();
        System.out.print("Sales Amount : £");
        double salesAmount = scanner.nextDouble();
        double commission35 = (salesAmount*35)/100;
        double commission20 = (salesAmount*20)/100;
        double commission10 = (salesAmount*10)/100;
        double commission5 = (salesAmount*5)/100;
        double commission2 = (salesAmount*2)/10;

        if (salesAmount>=50000) {
            System.out.println("Sales Commission Rate is 35% and Commission Amount is £" + commission35);
        } else if (salesAmount>=30000){
            System.out.println("Sales Commission Rate is 20% and Commission Amount is £" + commission20);
        }else if (salesAmount>=20000){
            System.out.println("Sales Commission Rate is 10% and Commission Amount is £" + commission10);
        }else if (salesAmount>=10000) {
            System.out.println("Sales Commission Rate is 5% and Commission Amount is £" + commission5);
        }else {
            System.out.println("Sales Commission Rate is 2% and Commission Amount is £" + commission2);
        }

    }
}
