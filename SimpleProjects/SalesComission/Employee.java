public class Employee {
    //Instance Variables
    int workingHours;
    double basicWage;

    //Setter of working hours and basic wage
    void setInfo(int workingHours, double basicWage){
        this.workingHours = workingHours;
        this.basicWage = basicWage;
    }

    //Print Wage
    void printWage(double totalSales){
        //Initiate Commission rate
        int CommissionRate = 1;
        
        //Set ranges of commission
        if(totalSales <= 1.00 && totalSales >=99.99){
            CommissionRate = 5;
        }
        if(totalSales <= 100.00 && totalSales >=299.99){
            CommissionRate = 10;
        }
        if(totalSales >= 300.00){
            CommissionRate = 15;
        }
        
        //Calculate Total Wage
        double TotalWage = ((CommissionRate/100) * totalSales) + (workingHours * basicWage);
        //Print Total Wage
        System.out.println("Total Wage: "+TotalWage);
    }
}
