
package pokerhandevaluation;

/**
 * @author lee heberer
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main();
    }
    
    public Main(){
        Hand tryHand = new Hand();
        tryHand.setDealHand();
        tryHand.setSortHand();
        int [][] myCards = new int[5][2];
        myCards = tryHand.getCard();
        RankHands nameHand = new RankHands(myCards);
        String str = "";
        str = nameHand.getNameOfHand();
        
        System.out.println("your Hand is: " + str);
        
        return;
    }
}
