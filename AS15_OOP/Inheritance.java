
/**
 * Joey Koumjian
 * Inheritance.java
 * 7/26/22
 */
public class Inheritance
{
    public static void main(String [] args){
        System.out.println("\f");
        
        //*--------------- Prob 1 --------------------------
        // create an object of type animal and print it out
        Animal critter = new Animal();
        System.out.println("critter = " + critter);
        
        // listen to the critter speak
        critter.speak();
        // set the number of legs of critter to 18
        critter.setLegs(18);
        
        // print the contents of critter
        System.out.println("critter = " + critter);
   
        // create an object of type pet and print it out
        Pet buffy = new Pet();
        System.out.println("buffy = " + buffy);
        
        // set the number of legs of buffy to 8
        buffy.setLegs(8);
        
        // set the number of fleas on buffy to 2
        buffy.setFleas(2);
        
        // print the contents of buffy
        System.out.println("buffy = " + buffy);
   
        // can you assign an Animal object to a Pet variable ?
        //  try setting buffy = critter.  does it work? no
        //  after your test, comment out the line you wrote
        //buffy = critter;
        
        // can you assign a Pet object to an Animal variable? yes
        //  try setting critter = buffy
        critter = buffy;
        // since critter now refers to a Pet can you set the number
        // of fleas on critter? no
        //critter.setFleas(6);
        
        //----------------End Prob 1 ------------------------*/
        //*--------------- Prob 2 --------------------------
        //  Define a Dog class that inherits from Pet (#fleas = 8)
        //   override the speak method so it sounds like a dog
        //  Create a dog object, print the contents of your dog        
        //  and listen to it speak
        Dog scooter = new Dog();
        System.out.println("Scooter = " + scooter);
        scooter.speak();
        
        //----------------End Prob 2 ------------------------*/
        //*--------------- Prob 3 --------------------------
        //  Define a Cat class that inherits from Pet (#fleas = 4)
        //   override the speak method so it sounds like a cat
        //  Create a cat object, print the contents of your cat        
        //  and listen to it speak
        Cat Mike = new Cat();
        System.out.println("Mike = " + Mike);
        Mike.speak();
        
        //----------------End Prob 3 ------------------------*/
        //*--------------- Prob 4 --------------------------
        //  Define a Human class that inherits from Animal (#legs = 2)
        //   override the speak method so it sounds like a human
        //  Create a Human object, print the contents of your human        
        //  and listen to it speak
        Human Joey = new Human();
        System.out.println("Joey = " + Joey);
        Joey.speak();
        

        //----------------End Prob 4 ------------------------*/
        //*--------------- Prob 5 --------------------------
        // create an array of 5 Animal objects called zoo
        // Since a Human, Pet, Cat or Dog object IS An Animal
        // they can all be assinged to an Animal array index.
        Animal [] zoo = new Animal[5];
        Animal [] zoo2 = {critter,buffy,scooter,Mike,Joey};
        
        // assign one Animal, one Human, one Pet, one Cat, and one Dog
        //  to the zoo array
        zoo[0] = critter;
        zoo[1] = buffy;
        zoo[2] = scooter;
        zoo[3] = Mike;
        zoo[4] = Joey;
        
        // Write a for loop that visits each animal and listens 
        //  to it speak
        System.out.println("The zoo animals are talking! Listen: ");
        for (int i = 0 ; i < zoo.length ; i++) {
            zoo[i].speak();
        }
        
        //----------------End Prob 5 ------------------------*/
       
        
    }
}

//console problem 1
//
// critter = Animal: legs = 0
// Undifferentiated Animal Noise
// critter = Animal: legs = 18
// buffy = Pet: legs = 4, fleas = 0
// buffy = Pet: legs = 8, fleas = 2

//console problem 2
//
// Scooter = Dog: legs = 4, fleas = 0
// Woof

//console problem 3
//
// Mike = Cat: legs = 4, fleas = 0
// Meow

//console problem 4
//
// Joey = Human: legs = 2, fleas = 0
// Hello!

// //console problem 5
//
// The zoo animals are talking! Listen: 
// Undifferentiated Pet Noise
// Undifferentiated Pet Noise
// Woof
// Meow
// Hello!