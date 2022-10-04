
/**
 * Write a description of class Pet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pet extends Animal
{
    private int fleas;  // defining an extra instance variable for pets

    public Pet()
    {
        super();     // call the parent class constructor
        setLegs(4);  // use the setLegs method in Animal class
        fleas = 0;   // set our own variable to 0
    }

    public void setFleas(int fleas)
    {
        this.fleas = fleas;
    }
    
    public int getFleas()
    {
        return fleas;
    }
    
    public String toString(){
        return "Pet: legs = " + getLegs() + ", fleas = " + fleas;
    }
    public void speak(){
        System.out.println("Undifferentiated Pet Noise");
    }
}
