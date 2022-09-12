public class ScaryMonster extends Monster{
    public ScaryMonster(int weight) {
        super(weight);
    }
    public void eat(Animal e){
        this.weight++;
    }

    public void scare(Human h){
        if(h.isIntelligent() == true){
            System.out.println(h.name + " is scared!");
            this.scareCount++;
        }
    }
}
