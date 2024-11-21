package collection.compare.ex;

import java.util.ArrayList;
import java.util.List;

public class Player implements Comparable<Player> {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(Card card) {
        if (hand.size() >= 5) {
            return;
        }
        hand.add(card);
        sort();
    }

    private void sort() {
        hand.sort(null);
    }

    public void clear() {
        hand.clear();
    }

    public int getSize() {
        return hand.size();
    }

    public int getScore() {
        int total = 0;
        for (Card card : hand) {
            total += card.getRank();
        }
        return total;
    }
    @Override
    public int compareTo(Player o) {
        return Integer.compare(getScore(), o.getScore()) * -1;
    }

    @Override
    public String toString() {
        return name + "의 카드: " + hand.toString() + ", 합계: " + getScore();
    }
}
