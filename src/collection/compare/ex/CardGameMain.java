package collection.compare.ex;

public class CardGameMain {
    public static void main(String[] args) {
        String[] playerNames = {"플레이어1", "플레이어2", "플레이어3", "플레이어4"};
        Deck deck = new Deck(playerNames);
        deck.match();
        deck.showHand();
    }
}
