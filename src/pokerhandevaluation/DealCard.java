
package pokerhandevaluation;

import java.util.Scanner;

/**
 * @author lee heberer
 */
public class DealCard {
    
    Scanner kb = new Scanner(System.in);
    
    public DealCard(){
    }
    
    /**
     * Method asks user to enter card rank two to ace
     * (1-13) and returns that string parsed to integer.
     * @return integer representing card rank.
     */
    public int getRank(){
        System.out.println("Enter the rank number for this card."
                + "\n1)two, 2)three, 9)ten, ..."
                + "10)Jack, 11)Queen, 12)King 13)Ace");
        //String str = kb.nextLine();
        //this.cardRank = Integer.parseInt(kb.nextLine());
        return Integer.parseInt(kb.nextLine());
    }
    
    /**
     * Method asks user to enter card suit club, spade etc.
     * (1-4) and returns string parsed as integer.
     * @return integer representing card suit.
     */
    public int getSuit(){
        System.out.println("Enter the suit for this card."
                + "\n1)Clubs, 2)Spades, 3)Hearts, 4)Diamonds");
        //String str = kb.nextLine();
        //this.cardRank = Integer.parseInt(kb.nextLine());
        return Integer.parseInt(kb.nextLine());
    }
    
    /**
     * Methods used by JUnitTests to get rank for cards
     * mainly as proof of concept.
     * @return int value of card rank (1-13).
     */
    public int getRank0(){ return 12;}
    public int getRank1(){ return 10;}
    public int getRank2(){ return 11;}
    public int getRank3(){ return 8;}
    public int getRank4(){ return 9;}
    
    /**
     * Methods used by JUnitTests to get suit for cards
     * mainly as proof of concept.
     * @return int value of card suit (1-4).
     */
    public int getSuit0(){ return 1;}
    public int getSuit1(){ return 2;}
    public int getSuit2(){ return 3;}
    public int getSuit3(){ return 4;}
    public int getSuit4(){ return 1;}
}
