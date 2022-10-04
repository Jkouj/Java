
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal
{
    private boolean brain;
    private int legs;

    public Animal()
    {
        brain = true;
        legs = 0;
    }

    public void setLegs(int legs)
    {
        this.legs = legs;
    }
    public int getLegs()
    {
        return legs;
    }
    public String toString(){
        return "Animal: legs = " + getLegs();
    }
    public void speak(){
        System.out.println("Undifferentiated Animal Noise");
    }    
}
