public class MainMath {
    public static void main(String[] args) {
        MathV2 math = new MathV2(3, 5, 25, 64, 34, 3);

        math.power(2,3);

        System.out.println("Factorial Operation Result is : " + math.factorial());

        math.printSeries();

        math.fibo();
        System.out.println();

        System.out.print("secondSmallest Operation Result is : ");
        math.secondSmallest();
    }
}
