import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        G a = new G();
        Scanner UserInput = new Scanner(System.in);

        System.out.println("Calculate a Rectangle Area:");
        System.out.println("Enter Height:");
        int h = UserInput.nextInt();
        System.out.println("Enter Width:");
        int w = UserInput.nextInt();
        a.calcArea(h,w);
    }
}

class G{
    public void calcArea(int h, int w){
        System.out.println("Area is:" + h*w);
    }
}
