public class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    void printId(){
        System.out.println(this.id);
    }
    void printName(){
        System.out.println(this.name);
    }
    void printCgpa(){
        System.out.println(this.cgpa);
    }
}
