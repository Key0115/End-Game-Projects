import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cardList = new ArrayList<>();//The List of the Card
    private String[] num = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private String[] suit = {"Diamond", "Clove", "Heart", "Spade"};
    private int[] points = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}; //having a same number of length of Array as num because that connected each other

    public ArrayList<Card> getCardList() {
        return cardList;
    }
    public void setCardList(ArrayList<Card> cardList) {
        this.cardList = cardList;
    }
    public Card getCard(){
        return this.cardList.get(0); //get the element from the cardList
    }
    public void removeCard(){
        this.cardList.remove(0);//remove the element from the cardList
    }
    public void addCard(Card card){
        this.cardList.add(card);//adding the card to the cardList
    }
    public void shuffleCards(){
        Collections.shuffle(this.cardList);//Shuffle the card(elements) inside the cardList
    }
    public void cardCreater(){ //Creating a card
        for(int i = 0; i< this.suit.length; i++){
            for(int j = 0; j<this.num.length; j++){
                Card card = new Card(this.suit[i],this.num[j],this.points[j]);
                this.cardList.add(card);
            }
        }
    }


}