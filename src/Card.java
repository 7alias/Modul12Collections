public class Card {

    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }


//    diamonds (♦), clubs (♣), hearts (♥) and spades (♠)

    public boolean equals(Card card) {
        if (this.rank.equals(card.rank) && this.suit.equals(card.suit)) {
            return false;
        }
        return true;
    }

    public int hashCode() {

        return 0;
    }


    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Card{" + "rank= '" + rank + '\'' +
                ", suit= '" + suit + '}';
    }
}
