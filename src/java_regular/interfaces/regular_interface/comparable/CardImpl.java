package java_regular.interfaces.regular_interface.comparable;

public class CardImpl implements Card {
    private Card.Rank rank;
    private Card.Suit suit;

    public CardImpl(Card.Rank rank, Card.Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Card.Suit getSuit() {
        return suit;
    }

    public Card.Rank getRank() {
        return rank;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Card) {
            if (((Card)obj).getRank() == this.rank &&
                    ((Card)obj).getSuit() == this.suit) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    public int hashCode() {
        return ((suit.value()-1)*13)+rank.value();
    }

    public int compareTo(Card o) {
        return this.hashCode() - o.hashCode();
    }

    public String toString() {
        return this.rank.text() + " of " + this.suit.text();
    }
}
