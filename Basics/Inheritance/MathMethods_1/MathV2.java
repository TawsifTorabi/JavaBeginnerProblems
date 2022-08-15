import java.util.Arrays;

public class MathV2 extends MathV1{
    //Instance variables
    int var1;
    int var2;
    int var3;
    MathV2(int var1, int var2, int var3, int var4, int var5, int var6){
        super(var4, var5, var6);
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;

    }

    void printSeries (){
        //Print odd numbers between var1 and var2 (Here var1 and var2 refer to the parent class’s instance variables)
        super.printSeries();
    }
    void power(int a, int b){
        //Write code to print b^a
        super.power(b, a);
    }
    void secondSmallest(){
        //write a code to print the 2nd smallest number between var1, var2 and var3
        int[] ArrayInt = {var1, var2, var3};
        Arrays.sort(ArrayInt);
        System.out.print(ArrayInt[1]);
    }
}
