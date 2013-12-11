/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author 5002394184
 */
public enum Cards {
    HA ("Ace of Hearts", 1),
    H2 ("Two of Hearts", 2),
    H3 ("Three of Hearts", 3),
    H4 ("Four of Hearts", 4),
    H5 ("Five of Hearts", 5),
    H6 ("Six of Hearts", 6),
    H7 ("Seven of Hearts", 7),
    H8 ("Eight of Hearts", 8),
    H9 ("Nine of Hearts", 9),
    H10 ("Ten of Hearts", 10),
    HJ ("Jack of Hearts", 11),
    HQ ("Queen of Hearts", 12),
    HK ("King of Hearts", 13),
    SA ("Ace of Spades", 14),
    S2 ("Two of Spades", 15),
    S3 ("Three of Spades", 16),
    S4 ("Four of Spades", 17),
    S5 ("Five of Spades", 18),
    S6 ("Six of Spades", 19),
    S7 ("Seven of Spades", 20),
    S8 ("Eight of Spades", 21),
    S9 ("Nine of Spades", 22),
    S10 ("Ten of Spades", 23),
    SJ ("Jack of Spades", 24),
    SQ ("Queen of Spades", 25),
    SK ("King of Spades", 26),
    DA ("Ace of Diamonds", 27),
    D2 ("Two of Diamonds", 28),
    D3 ("Three of Diamonds", 29),
    D4 ("Four of Diamonds", 30),
    D5 ("Five of Diamonds", 31),
    D6 ("Six of Diamonds", 32),
    D7 ("Seven of Diamonds", 33),
    D8 ("Eight of Diamonds", 34),
    D9 ("Nine of Diamonds", 35),
    D10 ("Ten of Diamonds", 36),
    DJ ("Jack of Diamonds", 37),
    DQ ("Queen of Diamonds", 38),
    DK ("King of Diamonds", 39),
    CA ("Ace of Clubs", 40),
    C2 ("Two of Clubs", 41),
    C3 ("Three of Clubs", 42),
    C4 ("Four of Clubs", 43),
    C5 ("Five of Clubs", 44),
    C6 ("Six of Clubs", 45),
    C7 ("Seven of Clubs", 46),
    C8 ("Eight of Clubs", 47),
    C9 ("Nine of Clubs", 48),
    C10 ("Ten of Clubs", 49),
    CJ ("Jack of Clubs", 50),
    CQ ("Queen of Clubs", 51),
    CK ("King of Clubs", 52);
    
    private final String cardName;
    private final int cardNum;
    
    /**
     *
     * @param cardName
     * @param cardNum
     */
    
    Cards(String cardName, int cardNum){
        this.cardName = cardName;
        this.cardNum = cardNum;
    }
    
    public int getCardNum(Cards c){
        return c.cardNum;
    }
}
