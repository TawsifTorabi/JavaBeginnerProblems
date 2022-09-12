public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Jon", 70, "medium", "brave");
        Human human2 = new Human("Sam", 100, "high", "not brave");

        CookieMonster coo = new CookieMonster(100); //weight 100 kg
        coo.scare(human1);
        coo.scare(human2);
        coo.eat();
        System.out.println(coo); //prints weight and scareCount here.

        ScaryMonster doggo = new ScaryMonster(500); //weight is 500 kg initially.
        doggo.eat(human1);
        doggo.eat(human2);
        System.out.println(doggo); //prints weight and scareCount here
    }
}
