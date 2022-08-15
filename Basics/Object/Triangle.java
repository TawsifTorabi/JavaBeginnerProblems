import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Triangle {
    double a, b, c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void printPerimeter(){
        double perimeter = a+b+c;
        System.out.println("The perimeter: " + perimeter + " Meters");
    }
    void printArea(){
        double s = (a+b+c)/2;
        double e, x, y;
        e = s-a;
        x = s-b;
        y = s-c;
        double area = sqrt((s*e*x*y));
        System.out.println("The area: " + String.format("%.5f", area) + " Sq. Meters");
    }
}

class TriangleTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a :");
        double a = sc.nextDouble();
        System.out.println("Input b :");
        double b = sc.nextDouble();
        System.out.println("Input c :");
        double c = sc.nextDouble();

        Triangle Triangle = new Triangle(a, b, c);
        Triangle.printArea();
        Triangle.printPerimeter();
    }
}
