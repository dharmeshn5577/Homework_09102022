import java.util.Scanner;

public class EmployeePayslip {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Employee ID: ");
        String employeeID = scanner.nextLine();
        System.out.print("Employee Name: ");
        String employeeName = scanner.next();
        System.out.print("Basic Salary: £");
        double basicSalary = scanner.nextDouble();
        double hra = (basicSalary*10)/100;
        System.out.println("HRA: £" + hra);
        double ta = (basicSalary*9)/100;
        System.out.println("TA: £" + ta);
        double da = (basicSalary*8)/100;
        System.out.println("DA: £" + da);
        double pf = (basicSalary*20)/100;
        System.out.println("PF: £" + pf);

        double grossSalary = basicSalary + hra + ta + da - pf;
        double grossSalaryRoundOff = (double) (Math.round(grossSalary * 100.0) / 100.0);
        System.out.println("Gross Salary: £" + grossSalaryRoundOff);

    }
}
