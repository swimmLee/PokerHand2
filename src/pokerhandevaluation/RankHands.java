
package pokerhandevaluation;

/**
 * @author lee heberer
 */
public class RankHands {
    private int[][] my;
    private String message;
    
    
    public RankHands(int[][] myHand){
        this.my = myHand;
    }
    
    /**
     * Tests card array to make Royal Flush.
     * @return string "Royal Flush" if test is true. "" otherwise.
     */
    public String isRoyalFlush(){
        if((my[0][0]==13 && my[1][0]==12 && my[2][0]==11 
                && my[3][0]==10 && my[4][0]==9)
                && (my[0][1]==my[1][1] && my[1][1]==my[2][1] && my[2][1]==my[3][1] 
                && my[3][1]==my[4][1])){
            message = "Royal Flush";
            return message;
        }
        return message = "";
    }
    
    /**
     * Tests card array to make Straight Flush.
     * @return string "Straight Flush" if test true, "" otherwise.
     */
    public String isStraightFlush(){
        for(int j=0; j<9; j++){
            if((my[0][0]==13-j && my[1][0]==12-j && my[2][0]==11-j
                    && my[3][0]==10-j && my[4][0]==9-j)
                    && (my[0][1]==my[1][1] && my[1][1]==my[2][1] && my[2][1]==my[3][1] 
                    && my[3][1]==my[4][1])){
                message = "Straight Flush";
                return message;
            }
        }
        return message = "";
    }
    
    /**
     * Tests card array to make Four of a Kind.
     * @return string "Four of a Kind" if test is true, "" otherwise.
     */
    public String isFourOfAKind(){
        for(int j=0; j<13; j++){
            if((my[0][0]==13-j && my[1][0]==13-j 
                    && my[2][0]==13-j && my[3][0]==13-j)
                    || (my[1][0]==13-j && my[2][0]==13-j
                    && my[3][0]==13-j && my[4][0]==13-j)){
                message = "Four of a Kind";
                return message;
            }
        }
        return message = "";
    }
    
    /**
     * Tests card array to make Full House.
     * @return string "Full House" if test is true, "" otherwise.
     */
    public String isFullHouse(){
        for(int j=0; j<13; j++){
            if(((my[0][0]==13-j && my[1][0]==13-j && my[2][0]==13-j)
                    && (my[3][0]==my[4][0]))
                    ||
                    ((my[0][0]==my[1][0])
                    && (my[2][0]==13-j && my[3][0]==13-j && my[4][0]==13-j))){
                message = "Full House";
                return message;
            }
        }
        return message = "";
    }
    
    /**
     * Test card array to make Flush.
     * @return string "Flush" if test is true, "" otherwise.
     */
    public String isFlush(){
        if(my[0][1]==my[1][1] && my[1][1]==my[2][1] && my[2][1]==my[3][1] 
                    && my[3][1]==my[4][1]){
            message = "Flush";
            return message;
        }
        return message = "";
    }
    
    /**
     * Test card array to make Straight.
     * @return string "Straight" if test is true, "" otherwise.
     */
    public String isStraight(){
        for(int j=0; j<9; j++){
            if((my[0][0]==13-j && my[1][0]==12-j && my[2][0]==11-j
                    && my[3][0]==10-j && my[4][0]==9-j)){
                message = "Straight";
                return message;
            }
        }
        return message = "";
    }
    
    /**
     * Test card array to make Three of a Kind.
     * @return string "Three of a Kind" if test is true, "" otherwise.
     */
    public String isThreeOfAKind(){
        for(int j=0; j<13; j++){
            if((my[0][0]==13-j && my[1][0]==13-j && my[2][0]==13-j)
                    || (my[1][0]==13-j && my[2][0]==13-j && my[3][0]==13-j)
                    || (my[2][0]==13-j && my[3][0]==13-j && my[4][0]==13-j)){
                message = "Three of a Kind";
                return message;
            }
        }
        return message = "";
    }
    
    /**
     * Tests card array to make Two Pair.
     * @return string "Two Pair" if test is true, "" otherwise.
     */
    public String isTwoPair(){
        if((my[0][0]==my[1][0] && my[2][0]==my[3][0])
                || (my[0][0]==my[1][0] && my[3][0] == my[4][0])
                || (my[1][0]==my[2][0] && my[3][0]==my[4][0])){
            message = "Two Pair";
            return message;
        }
        return message = "";
    }
    
    /**
     * Test card array to make One Pair.
     * @return string "One Pair" if test is true, "" otherwise.
     */
    public String isOnePair(){
        if(my[0][0]==my[1][0] || my[1][0]==my[2][0]
              || my[2][0]==my[3][0] || my[3][0]==my[4][0]){
            message = "One Pair";
            return message;
        }
    return message = "";  
    }
    
    /**
     * Finds High Card in card array.
     * @return string "High Card" of for any hand.
     */
    public String isHighCard(){
        message = "High Card";
        return message;
    }
    
    /**
     * Method Tests sorted card array from most restrictive
     * case to less restrictive case and returns the name of
     * highest hand possible.
     * @return string for highest hand.
     */
    public String getNameOfHand(){
        if(this.isRoyalFlush().equals("Royal Flush"))
            message = "Royal Flush";
        else if(this.isStraightFlush().equals("Straight Flush"))
            message = "Straight Flush";
        else if(this.isFourOfAKind().equals("Four of a Kind"))
            message = "Four of a Kind";
        else if(this.isFullHouse().equals("Full House"))
            message = "Full House";
        else if(this.isFlush().equals("Flush"))
            message = "Flush";
        else if(this.isStraight().equals("Straight"))
            message = "Straight";
        else if(this.isThreeOfAKind().equals("Three of a Kind"))
            message = "Three of a Kind";
        else if(this.isTwoPair().equals("Two Pair"))
            message = "Two Pair";
        else if(this.isOnePair().equals("One Pair"))
            message = "One Pair";
        else if(this.isHighCard().equals("High Card"))
            message = "High Card";
        return message;
    }
}
