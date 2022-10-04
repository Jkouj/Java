
/**
 * Joey Koumjian
 * Dog.java
 * 7/26/22
 */
public class Dog extends Pet
{
    private int fleas;
    public Dog(){
        super();
        setFleas(8);
    }
    public String toString(){
        return "Dog: legs = " + getLegs() + ", fleas = " + fleas;
    }
    public void speak(){
        System.out.println("Woof");
    }    
}
