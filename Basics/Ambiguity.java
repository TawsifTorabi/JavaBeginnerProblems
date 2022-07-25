public class Ambiguity {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        A a = new A(4, 2);
        a.display();
        a.add();

        A b = new A(2,1);
        b.display();
    }
}

class A{
 
    //Class Instance Variables
    int x;
    int y;

    public A (int x, int y){  
        //If method parameter and instance variable names are same, the problem occur is called Ambiguity
        //To avert this problem, we use this.variable inside a method.
        this.x = x;
        this.y = y;
        System.out.println("This is inside the Constructor");
        System.out.println(x-y);
    }
  
    public void display(){
        System.out.println("This is inside A class");
    }

    public void add(){
        int a = 5;
        int b = 4;
        System.out.println(a+b);
    }

    class B{
        int i, j;
        public B(int i, int j){
                this.i = i;
                this.i = j;
                System.out.println("This is inside the Constructor");
                System.out.println(x-y);
            }
    }
}
