public class main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t);
        //Change the name of the thread
        t.setName("My Thread");
        System.out.println("After name change: " + t);
    }
}
