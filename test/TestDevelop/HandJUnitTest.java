
package TestDevelop;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import pokerhandevaluation.Hand;

/**
 * @author lhebe
 */
public class HandJUnitTest {
    int[][] card;
    Hand hand1 = new Hand();
    Hand hand2 = new Hand();
    
    public HandJUnitTest() {
    }
    
    @Before
    public void setUpCard(){
        card = new int[5][2];
        card[0][0] = 12;
        card[1][0] = 10;
        card[2][0] = 11;
        card[3][0] = 8;
        card[4][0] = 9;
        card[0][1] = 1;
        card[1][1] = 2;
        card[2][1] = 3;
        card[3][1] = 4;
        card[4][1] = 1;
    }
    
    @Test
    public void setNewCard(){
        for(int i = 0; i<5; i++){
            hand1.setOneCard(i, card[i][0], card[i][1]);
            assertEquals("the ranks are not equal.",hand1.getCardRank(i),card[i][0]);
            assertEquals("the suits are not equal.",hand1.getCardSuit(i),card[i][1]);
        }
        assertArrayEquals("the values are not equal.",hand1.getCard(), card);
    }
    
    @Test
    public void setNewHand2(){
        hand2.setDealHandTest();
        for(int i = 0; i<5; i++){
            assertEquals("the ranks are not equal.",hand2.getCardRank(i),card[i][0]);
            assertEquals("the suits are not equal.",hand2.getCardSuit(i),card[i][1]);
        }
        assertArrayEquals("the values are not equal.",hand2.getCard(), card);
    }
     
    @Test
    public void setNewHand3(){
        hand2.setDealHandTest();
        hand2.setSortHand();
        card[0][0] = 12;
        card[1][0] = 11;
        card[2][0] = 10;
        card[3][0] = 9;
        card[4][0] = 8;
        card[0][1] = 1;
        card[1][1] = 3;
        card[2][1] = 2;
        card[3][1] = 1;
        card[4][1] = 4;
        for(int i = 0; i<5; i++){
            assertEquals("the ranks are not equal.",hand2.getCardRank(i),card[i][0]);
            assertEquals("the suits are not equal.",hand2.getCardSuit(i),card[i][1]);
        }
        assertArrayEquals("the Arrays are not equal.",hand2.getCard(), card);
    }
    
}
