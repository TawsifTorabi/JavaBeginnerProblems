public class Animal {
    String intelligence;
    int weight;

    public Animal(String intelligence, int weight){
        this.intelligence = intelligence;
        this.weight = weight;
    }

    public boolean isIntelligent(){
        if(intelligence == "high")
            return true;
        else
            return false;
    }

    public double expectedHeight(){
        return (weight/2);
    }
}
