//Call the java package
 import java.util.*;
 
 //Public class
 public class git {
 
 //This makes stuff work. It's magical
     public static void main(String[] args){
 
     	//Do NOT mess with this integer. It will go wonky and make you cry
         int[] deck = new int[52];
         //Suits
         String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
         //Ranks of cards
         String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
         //Array boom!
         List<String> pickedCards = new ArrayList<String>();
 
         //Loops for days
         for(int i = 0; i< deck.length; i ++)
             deck[i] = i;
 
         //shuffle it up
        for(int i = 0; i < deck.length; i++){
 
             //Randomization
             int index = (int)(Math.random() * deck.length);
             int temp = deck[i];
             deck[i] = deck[index];
             deck[index] = temp;
         }
 
         //Four cards
         for(int i = 0; i < 4; i++){
             String suit = suits[deck[i] / 13];
             String rank = ranks[deck[i] % 13];
             System.out.println(rank + " of " + suit);
             pickedCards.add(rank);
         }
 
         //Suits
         int Ace, Jack, Queen, King;
 
         //These cards are worth this many. So many.
         int[] points = {Ace = 1, Jack = 11, Queen = 12, King = 13};
 
         //Adding time!
         int sum = 0;
         int jack = 11;
         int queen = 12;
         int king = 13;
         int ace = 1;
         Iterator<String> iterator = pickedCards.iterator();
         while(iterator.hasNext()) {
 
             String rank = iterator.next();
             System.out.println(rank);
             if(rank.equalsIgnoreCase("Jack")){
             sum = sum+jack;
         }
         else if(rank.equalsIgnoreCase("Queen")){
             sum = sum+queen;
         }
         else if(rank.equalsIgnoreCase("King")){
            sum = sum+king;
         }
         else if(rank.equalsIgnoreCase("Ace")){
             sum = sum+ace;
         } 
         else {
             sum = sum+Integer.parseInt(rank);
 
            
         }
     }
     System.out.println("Sum of picked cards is : "+sum);
 
     int count = 0;
 if (sum==24)
 
     count++;
     System.out.println("The number of times the cards sum is 24 is: " + count);
 
         }   	
 }