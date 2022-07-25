import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int a = 10;
        Student s1 = new Student(1,"xxx", 2.2);
        Student s2 = new Student(2,"yyy", 2.7);

        //If a user-defined constructor is called, the default constructor will not work.

        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.cgpa);
        s1.printId();

        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(s2.cgpa);

        //The Default Constructor Student s1 initialized the values for id, name, cgpa


        Student[] arrayOfObject = new Student[10];
    }
}
