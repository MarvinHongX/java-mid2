package collection.compare.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();
    Player[] players;
    private final int playerCount;


    public Deck(String[] playerNames) {
        this.playerCount = playerNames.length;

        players = new Player[this.playerCount];

        for (int i = 0; i < this.playerCount; i++) {
            players[i] = new Player(playerNames[i]);
        }
    }


    public void match() {
        clearAll();
        shuffleDeck();
        dealCards();
    }

    private void clearAll(){
        cards.clear();

        for (Player player : players) {
            player.clear();
        }
    }

    private void shuffleDeck() {
        for (Suit suit : Suit.values()) {
            for (int i = 1; i <= Card.MAX_NUM; i++) {
                cards.add(new Card(suit, i));
            }
        }
        shuffle();
    }

    public void showHand() {
        if (cards.isEmpty()) {
            return;
        }
        for (Player player : players) {
            if (player.getSize() < 5) {
                return;
            }
        }

        Arrays.sort(players);
        for (Player player : players) {
            System.out.println(player);
        }

        Player winner = getWinner();
        if (winner != null){
            System.out.println(winner.getName() + " 승리");
        } else {
            System.out.println("무승부");
        }
    }

    private Player getWinner() {
        Player winner = players[0];
        for (int i = 1; i < players.length; i++) {
            if (players[i].compareTo(winner) < 0){
                winner = players[i];
            } else if (players[i].compareTo(winner) == 0){
                winner = null;
                break;
            }
        }
        return winner;
    }

    private void dealCards() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < playerCount; j++) {
                players[j].add(pop());
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    private Card pop() {
        return cards.remove(0);
    }
}
