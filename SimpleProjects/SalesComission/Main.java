import java.util.Scanner;

public class MainEmployee{
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner sc = new Scanner(System.in);
        //Create Employee Object
        Employee employee = new Employee();

        //Take Inputs
        System.out.println("Input Working Hours: ");
        int workingHours = sc.nextInt();
        System.out.println("Input Basic Wage: ");
        double basicWage = sc.nextDouble();
        System.out.println("Input Total Sales: ");
        double totalSales = sc.nextDouble();

        //Set Info
        employee.setInfo(workingHours, basicWage);
        
        //Print Wages
        employee.printWage(totalSales);

    }
}
