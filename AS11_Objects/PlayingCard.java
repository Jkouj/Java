
/**
 * Write a description of class PlayingCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayingCard
{
    // 1) define instance variables here, make them private
    private char suit;
    private int rank;
    
    // 2) define the no-arg constructor here
    public PlayingCard(){
        suit = 'C';
        rank = 1;
        
    }
    
    // 3) define the explicit (parameter) constructor here
    public PlayingCard(char suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }
    
    // 4) define the get and set methods here 
    //     (getSuit, getValue, setSuit, setValue)
    public char getSuit(){
        return suit;
    }
    
    public int getRank(){
        return rank;
    }
    
    public void setSuit(char suit){
        this.suit = suit;
    }
    
    public void setRank(int rank){
        this.rank = rank;
    }
    // 5) define the print method here
    public void print(){
        String word;
        if (this.rank == 1){
            word = "Ace";
        }
        else if (this.rank == 11){
            word = "Jack";
        }
        else if (this.rank == 12){
            word = "Queen";
        }
        else if (this.rank == 13){
            word = "King";
        }
        else{
            word = String.valueOf(this.rank);
        }
        if (this.getSuit() == 'C'){
            System.out.println(word + " of Clubs");
        }
        else if (this.getSuit() == 'D'){
            System.out.println(word + " of Diamonds");
        }
        else if (this.getSuit() == 'S'){
            System.out.println(word + " of Spades");
        }
        else{
            System.out.println(word + " of Hearts");
        }
        System.out.println();
    }
}
