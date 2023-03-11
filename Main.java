import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deck myDeck = new Deck();//Make a new deck
        System.out.println("Higher or Lower");
        myDeck.cardCreater();
        myDeck.shuffleCards();
        ArrayList<Card> pick5Cards = new ArrayList<>();//List for the pick5Cards
        for (int i = 1; i <= 5; i++) {
            pick5Cards.add(myDeck.getCard());//adding the element of the card to the pick5Cards List
            myDeck.removeCard();// Without removing it is not gonna work due to it will stack
        }

        for (Card card : pick5Cards) {
            System.out.println("Card : " + card.getSuit() +" " +card.getNum()+ " ");//card.getSuit() &card.getNum() is for getting ACTUAL things via getter from the Card class
        }
    }
}