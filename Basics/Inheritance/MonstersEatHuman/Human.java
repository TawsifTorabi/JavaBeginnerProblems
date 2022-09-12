public class Human extends Animal{
    String intelligence;
    String bravery;
    String name;
    int weight;

    public Human(String name, int weight, String intelligence, String bravery) {
        super(intelligence, weight);
        this.intelligence = intelligence;
        this.bravery = bravery;
        this.name = name;
        this.weight = weight;
    }

}
