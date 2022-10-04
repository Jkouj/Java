//Name: 



public class NinetyNineBottles
{
    public static void main (String [] args){
        System.out.println("\f");  // flush the buffer (erase the screen)
        beerSong(3);
        
    }  
    public static void beerSong(int n){
        if (n > 0) {
            System.out.println(n+" bottles of beer on the wall, "+n+" bottles of beer, ya’ take one down, ya’ pass it around, "+(n-1)+" bottles of beer on the wall.");
            beerSong(n-1);
        }
        else if (n == 0) {
            System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall! ");
        }
    }
}
/*
 * 3 bottles of beer on the wall, 3 bottles of beer, ya’ take one down, ya’ pass it around, 2 bottles of beer on the wall.
 * 2 bottles of beer on the wall, 2 bottles of beer, ya’ take one down, ya’ pass it around, 1 bottles of beer on the wall.
 * 1 bottles of beer on the wall, 1 bottles of beer, ya’ take one down, ya’ pass it around, 0 bottles of beer on the wall.
 * No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall! 
 */