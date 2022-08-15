public class MathV1 {
    //Instance variables
    private int var1;
    int var2;
    int var3;

    //User Defined Constructor
    public MathV1(int var1, int var2, int var3){
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }


    void printSeries(){
        //Write code to print even numbers between var1 and var2

        int big1;
        int small1;

        if(var1 > var2){
            big1 = var1;
            small1 = var2;
        }else{
            big1 = var2;
            small1 = var1;
        }
        for (int i = small1; i <= big1; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }

    void power(int a, int b){
        //Write code to print a^b
        int base = a;
        int exponent = b;
        long output = 1;

        while(exponent != 0){
            output =  output * base;
            exponent--;
        }

        System.out.println(output);
    }

    int factorial(){
        //return the factorial of var3;
        int i;
        int fact = 1;
        int num = var3;
        for(i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
    void fibo(){
        //write code to print Fibonacci series from var2 to var3
        int n = var2 - var3;
        int firstTerm = var2;
        int secondTerm = var2 + 1;

        for (int i=1; i<=n; i++) {
            System.out.print(firstTerm + ", ");
            //Calculate next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
