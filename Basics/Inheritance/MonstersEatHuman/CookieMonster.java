public class CookieMonster extends Monster{
    public CookieMonster(int weight) {
        super(weight);
    }
    public void eat(){
        this.weight++;
    }
    public void scare(Human h){
        if(h.bravery.matches("not brave")){
            System.out.println("Human Screams.....");
            this.scareCount++;
        }
    }
}
