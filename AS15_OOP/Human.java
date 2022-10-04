
/**
 * Joey Koumjian
 * Human.java
 * 7/26/22
 */
public class Human extends Animal
{
    private int fleas;
    public Human(){
        super();
        setLegs(2);
    }
    public void speak(){
        System.out.println("Hello!");
    }    
    public String toString(){
        return "Human: legs = " + getLegs() + ", fleas = " + fleas;
    }
}
