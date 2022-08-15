import java.util.Scanner;

public class Circle {
    double ri, ro;

    public void SetRadius(double ri, double ro){
        this.ri = ri;
        this.ro = ro;
    }
    void printArea(){
        double pi = Double.parseDouble("3.1416");
        double riArea = 2*pi*ri;
        double roArea = 2*pi*ro;
        double area = roArea-riArea;
        System.out.println("Area is " + area);
    }

}
class CircleTest{
    public static void main(String[] args) {
        Circle Circle = new Circle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Inner Radius:");
        double ri = sc.nextDouble();

        System.out.println("Input Outer Radius:");
        double ro = sc.nextDouble();

        Circle.SetRadius(ri, ro);
        Circle.printArea();
    }
}
