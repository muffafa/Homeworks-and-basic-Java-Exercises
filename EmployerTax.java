import java.util.Scanner;

public class EmployerTax{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter employee's name: ");
        String name = in.nextLine();
        System.out.print("Enter the number of hours worked in a week: ");
        double hoursWorked = in.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = in.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = in.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = in.nextDouble();
        
        double fWithholding = federalTax * payRate * hoursWorked;
        double sWithholding = stateTax * payRate * hoursWorked;
        double grossPay = payRate * hoursWorked;
        
        System.out.printf("Employee Name: %s%nHours Worked: %.1f%nPay Rate: $%.2f%n" +
            "Gross Pay: $%.2f%nDeductions:%n  Federal Withholding (%.1f%%): $%.2f%n" +
            "  State Withholding (%.1f%%): $%.2f%n  Total Deduction: $%.2f%n" + 
            "Net Pay: $%.2f%n",
            name,
            hoursWorked,
            payRate,
            grossPay,
            federalTax * 100,
            fWithholding,
            stateTax * 100,
            sWithholding,
            fWithholding + sWithholding,
            grossPay - fWithholding - sWithholding);
    }
}
