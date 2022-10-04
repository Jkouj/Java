
/**
 * Joey Koumjian
 * Cat.java
 * 7/26/22
 */
public class Cat extends Pet
{
    private int fleas;
    public Cat(){
        super();
        setFleas(4);
    }
    public void speak(){
        System.out.println("Meow");
    }    
    public String toString(){
        return "Cat: legs = " + getLegs() + ", fleas = " + fleas;
    }
}
