import java.util.Scanner;

//The goal is to create multiple instance of object of a user-defined class

public class Banker{
    public static void main(String[] args) {

        BankAccount[] arrOfAcc = new BankAccount[5];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++){
            System.out.println("Input Name for Account Holder "+ (i+1) +" :");
            String Username = sc.next();

            System.out.println("Input Account Number for Index "+ (i+1) +" :");
            int AccountNumber = sc.nextInt();

            System.out.println("Input balance for Index "+ (i+1) +" :");
            double Balance = sc.nextDouble();

            arrOfAcc[i] = new BankAccount(Username, AccountNumber, Balance);
        }

        for(int i=0; i<5; i++){
            System.out.println("Account Holder "+ (i+1) + ": " + arrOfAcc[i].name);
            System.out.println("Account No.:" + arrOfAcc[i].AccountNum);
            System.out.println("Balance:" + arrOfAcc[i].balance);
            System.out.println("______________________");
        }

    }
}
