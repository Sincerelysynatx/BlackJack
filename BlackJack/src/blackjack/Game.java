/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
/**
 *
 * @author 5002394184
 */
public class Game {
    
    Player plr;
    Computer cpu;
    public Game(){
        plr = new Player();
        cpu = new Computer();
        Deck.makeDeck();
    }
}
