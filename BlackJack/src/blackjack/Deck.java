/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 5002394184
 */
public class Deck {

    public final int NUM_OF_CARDS = 52;
    public final int NUM_OF_START_CARDS = 2;
    public static List deck;

    public static void makeDeck() {
        deck = new ArrayList<>();
        deck.addAll(Arrays.asList(Cards.values()));
    }

    public static void printDeck() {
        for () {
            
        }
    }
}
