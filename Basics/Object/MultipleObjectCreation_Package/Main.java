import patients.*;
import java.util.Scanner;

public class Main extends Patient {

    //Default Constructor
    public Main(int pid, String pname, String history) {
        super(pid, pname, history);
    }

    public static void main(String[] args){
        //Create Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Number of Patient you want to add:");
        int a = sc.nextInt();   //Input Integer
        int counter = a;        //Set Counter

        //Array of Patient Objects
        Patient []patientsArr = new Patient[a];

        //Create Iteration for each patient data input
        for(int i = 0; i<a; i++){
            counter--; //Decrement of counter by one

            System.out.print("Input Patient " + (i+1) +" ID : ");
            int pid = sc.nextInt();

            System.out.print("Input Patient " + (i+1) +" Name : ");
            String pname = sc.next();

            System.out.print("Patient " + (i+1) +" history : ");
            String history = sc.next();

            System.out.print("Medicines for Patient : ");
            String medicines = sc.next();

            System.out.println("Patient ID - " + pid + " || Name - " + pname);
            System.out.println("Remaining (" + counter + ")");
            System.out.println("_______________________");

            //Create New Patient Object using the inputs
            patientsArr[i] = new Patient(pid, pname, history);
            //Set Medicine using setter method
            patientsArr[i].setMedicines(pid, medicines);
        }

        System.out.println("_______________________");
        System.out.println("Printing All the Datas:");
        System.out.println("_______________________");

        //Print all the values
        for(int i = 0; i<a; i++){

            System.out.println("_______________________");

            //Get name from object instance variable
            System.out.println("Patient Name : " + patientsArr[i].pname);

            //Get Medicines using getter method to access private variables
            System.out.println("Medicines : " + patientsArr[i].getMedicines(patientsArr[i].pid));
            System.out.println("_______________________");

        }
    }
}
