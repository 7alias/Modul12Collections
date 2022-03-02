import java.util.HashSet;

public class Cards {

    public static void main(String[] args) {
        Card cardDiamonds6 = new Card("diamonds","6");
        Card cardHearts6 = new Card("hearts","6");
        Card cardClubs6 = new Card("clubs","6");
        Card cardSpades6 = new Card("spades","6");

        Card cardDiamonds7 = new Card("diamonds","7");
        Card cardHearts7 = new Card("hearts","7");
        Card cardClubs7 = new Card("clubs","7");
        Card cardSpades7 = new Card("spades","7");

        Card cardDiamonds8 = new Card("diamonds","8");
        Card cardHearts8 = new Card("hearts","8");
        Card cardClubs8 = new Card("clubs","8");
        Card cardSpades8 = new Card("spades","8");

        Card cardDiamonds9 = new Card("diamonds","9");
        Card cardHearts9 = new Card("hearts","9");
        Card cardClubs9 = new Card("clubs","9");
        Card cardSpades9 = new Card("spades","9");

        Card cardDiamonds10 = new Card("diamonds","10");
        Card cardHearts10 = new Card("hearts","10");
        Card cardClubs10 = new Card("clubs","10");
        Card cardSpades10 = new Card("spades","10");

        Card cardDiamondsJack = new Card("diamonds","Jack");
        Card cardHeartsJack = new Card("hearts","Jack");
        Card cardClubsJack = new Card("clubs","Jack");
        Card cardSpadesJack = new Card("spades","Jack");

        Card cardDiamondsQueen = new Card("diamonds","Queen");
        Card cardHeartsQueen = new Card("hearts","Queen");
        Card cardClubsQueen = new Card("clubs","Queen");
        Card cardSpadesQueen = new Card("spades","Queen");

        Card cardDiamondsKing = new Card("diamonds","King");
        Card cardHeartsKing = new Card("hearts","King");
        Card cardClubsKing = new Card("clubs","King");
        Card cardSpadesKing = new Card("spades","King");

        Card cardDiamondsAce = new Card("diamonds","Ace");
        Card cardHeartsAce = new Card("hearts","Ace");
        Card cardClubsAce = new Card("clubs","Ace");
        Card cardSpadesAce = new Card("spades","Ace");



        HashSet cardSet = new HashSet();
        cardSet.add(cardDiamonds6);
        cardSet.add(cardHearts6);
        cardSet.add(cardClubs6);
        cardSet.add(cardSpades6);
        cardSet.add(cardDiamonds7);
        cardSet.add(cardHearts7);
        cardSet.add(cardClubs7);
        cardSet.add(cardSpades7);
        cardSet.add(cardDiamonds8);
        cardSet.add(cardHearts8);
        cardSet.add(cardClubs8);
        cardSet.add(cardSpades8);
        cardSet.add(cardDiamonds9);
        cardSet.add(cardHearts9);
        cardSet.add(cardClubs9);
        cardSet.add(cardSpades9);
        cardSet.add(cardDiamonds10);
        cardSet.add(cardHearts10);
        cardSet.add(cardClubs10);
        cardSet.add(cardSpades10);
        cardSet.add(cardDiamondsJack);
        cardSet.add(cardHeartsJack);
        cardSet.add(cardClubsJack);
        cardSet.add(cardSpadesJack);
        cardSet.add(cardDiamondsQueen);
        cardSet.add(cardHeartsQueen);
        cardSet.add(cardClubsQueen);
        cardSet.add(cardSpadesQueen);
        cardSet.add(cardDiamondsKing);
        cardSet.add(cardHeartsKing);
        cardSet.add(cardClubsKing);
        cardSet.add(cardSpadesKing);
        cardSet.add(cardDiamondsAce);
        cardSet.add(cardHeartsAce);
        cardSet.add(cardClubsAce);
        cardSet.add(cardSpadesAce);

        cardSet.add(cardDiamondsAce);
        cardSet.add(cardHeartsAce);
        cardSet.add(cardClubsAce);
        cardSet.add(cardSpadesAce);

        System.out.println(cardSet.size());

    }

}


/*
Создайте класс Card (Карта) с полями «масть» типа String и «ранг» типа String.

Определите в нем методы equals() и hashCode() (подумайте, какие лучше поля включить в оба метода).

Создайте HashSet, заполните его полностью колодой карт от 6 до туза, плюс еще 3-4 повторяющиеся карты.

Убедитесь, что длина Set в итоге после добавления карт = 36.


 */