
package TestDevelop;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import pokerhandevaluation.Hand;
import pokerhandevaluation.RankHands;

/**
 * @author lee heberer
 */
public class NameHandJUnitTest {
    int[][] card;
    RankHands testHands;
    Hand testHand;
    
    public NameHandJUnitTest() {
    }
    
    @Before
    public void setUpHand(){
        card = new int[5][2];
        card[0][0] = 12;
        card[1][0] = 11;
        card[2][0] = 10;
        card[3][0] = 9;
        card[4][0] = 8;
        card[0][1] = 1;
        card[1][1] = 1;
        card[2][1] = 1;
        card[3][1] = 1;
        card[4][1] = 1;
        
        testHands = new RankHands(card);
        testHand = new Hand();
    }
    
    @Test       // 1
    public void setTestRoyalFlush(){
        String str = testHands.isRoyalFlush();
        assertEquals("Cannot find RoyalFlush Equal.", "", str);  //"Royal Flush"
    }
    
    @Test       //2
    public void setTestStraightFlush(){
        String str2 = testHands.isStraightFlush();
        assertEquals("Cannot find StraightFlush Equal.", "Straight Flush", str2); //"Straight Flush"
    }
    
    @Test       //3
    public void setTestFourKind(){
        card[0][0] = 12;
        card[1][0] = 12;
        card[2][0] = 12;
        card[3][0] = 12;
        card[4][0] = 8;
        card[0][1] = 1;
        card[1][1] = 2;
        card[2][1] = 3;
        card[3][1] = 4;
        card[4][1] = 1;
        String str3 = testHands.isFourOfAKind();
        assertEquals("Cannot find Four of a Kind.", "Four of a Kind", str3);  //"Four of a Kind"
    }
    
    @Test       //4
    public void setTestFullHouse(){
        card[0][0] = 12;
        card[1][0] = 12;
        card[2][0] = 12;
        card[3][0] = 8;
        card[4][0] = 8;
        card[0][1] = 1;
        card[1][1] = 2;
        card[2][1] = 3;
        card[3][1] = 4;
        card[4][1] = 1;
        String str4 = testHands.isFullHouse();
        assertEquals("Cannot find Full House.", "Full House", str4);  //"Full House"
        
        card[0][0] = 9;
        card[1][0] = 9;
        card[2][0] = 11;
        card[3][0] = 11;
        card[4][0] = 11;
        card[0][1] = 1;
        card[1][1] = 2;
        card[2][1] = 3;
        card[3][1] = 4;
        card[4][1] = 1;
        str4 = testHands.isFullHouse();
        assertEquals("Cannot find Full House.", "Full House", str4);  //"Full House"
    }
    
    @Test       //5
    public void setTestFlush(){
        card[0][0] = 13;
        card[1][0] = 11;
        card[2][0] = 9;
        card[3][0] = 6;
        card[4][0] = 2;
        card[0][1] = 2;
        card[1][1] = 2;
        card[2][1] = 2;
        card[3][1] = 2;
        card[4][1] = 2;
        String str5 = testHands.isFlush();
        assertEquals("Cannot find Flush Equal.", "Flush", str5); //"Flush"
    }
    
    @Test       //6
    public void setTestUOFourKind(){
        card[0][0] = 12;
        card[1][0] = 12;
        card[2][0] = 8;
        card[3][0] = 12;
        card[4][0] = 12;
        card[0][1] = 1;
        card[1][1] = 2;
        card[2][1] = 3;
        card[3][1] = 4;
        card[4][1] = 3;
        testHand.setCard(card);
        testHand.setSortHand();
        String str6 = testHands.isFourOfAKind();
        assertEquals("Cannot find Four of a Kind.", "Four of a Kind", str6);  //"Four of a Kind"
    }
    
    @Test       //7
    public void setTestUORoyalFlush(){
        card[0][0] = 11;
        card[1][0] = 12;
        card[2][0] = 9;
        card[3][0] = 10;
        card[4][0] = 13;
        card[0][1] = 3;
        card[1][1] = 3;
        card[2][1] = 3;
        card[3][1] = 3;
        card[4][1] = 3;
        testHand.setCard(card);
        testHand.setSortHand();
        String str7 = testHands.isRoyalFlush();
        assertEquals("Cannot find RoyalFlush Equal.", "Royal Flush", str7);  //"Royal Flush"
    }
    
    @Test       // 8
    public void setTestUOStraight(){
        card[0][0] = 11;
        card[1][0] = 12;
        card[2][0] = 9;
        card[3][0] = 10;
        card[4][0] = 13;
        card[0][1] = 3;
        card[1][1] = 4;
        card[2][1] = 2;
        card[3][1] = 1;
        card[4][1] = 3;
        testHand.setCard(card);
        testHand.setSortHand();
        String str8 = testHands.isStraight();
        assertEquals("Cannot find StraightFlush Equal.", "Straight", str8); //"Straight"
    }
    
    @Test       // 9
    public void setTestUOThreeKind(){
        card[0][0] = 11;
        card[1][0] = 12;
        card[2][0] = 9;
        card[3][0] = 11;
        card[4][0] = 11;
        card[0][1] = 1;
        card[1][1] = 2;
        card[2][1] = 4;
        card[3][1] = 4;
        card[4][1] = 3;
        testHand.setCard(card);
        testHand.setSortHand();
        String str9 = testHands.isThreeOfAKind();
        assertEquals("Cannot find Three of a Kind.", "Three of a Kind", str9);  //"Three of a Kind"
    }
    
    @Test       // 10
    public void setTestUOTwoPair(){
        card[0][0] = 12;
        card[1][0] = 12;
        card[2][0] = 9;
        card[3][0] = 11;
        card[4][0] = 11;
        card[0][1] = 1;
        card[1][1] = 2;
        card[2][1] = 4;
        card[3][1] = 4;
        card[4][1] = 3;
        testHand.setCard(card);
        testHand.setSortHand();
        String str10 = testHands.isTwoPair();
        assertEquals("Cannot find Two Pair.", "Two Pair", str10);  //"Two Pair"
    }
    
    @Test       // 11
    public void setTestUOOnePair(){
        card[0][0] = 12;
        card[1][0] = 10;
        card[2][0] = 9;
        card[3][0] = 11;
        card[4][0] = 11;
        card[0][1] = 1;
        card[1][1] = 2;
        card[2][1] = 4;
        card[3][1] = 4;
        card[4][1] = 3;
        testHand.setCard(card);
        testHand.setSortHand();
        String str11 = testHands.isOnePair();
        assertEquals("Cannot find One Pair.", "One Pair", str11);  //"One Pair"
    }
}
