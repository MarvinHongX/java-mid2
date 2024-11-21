package collection.compare.ex;

public class Card implements Comparable<Card> {
    private Suit suit;
    private int rank;
    public static final int MAX_NUM = 13;

    public Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }

    @Override
    public int compareTo(Card o) {
        if (this.rank != o.rank) {
            return Integer.compare(this.rank, o.rank);
        } else {
            return this.suit.compareTo(o.suit);
        }
    }
}
