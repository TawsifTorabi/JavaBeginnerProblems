public class Monster {
    int weight;
    int Food;
    int scareCount;
    public Monster(int weight){
        this.weight = weight;
    }
    public void eat(){
        this.weight++;
    }
}
