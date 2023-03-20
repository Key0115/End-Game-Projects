import java.util.ArrayList;

public class Pile  {
    public  ArrayList<Card> cardList = new ArrayList<>(); // The cardList is my card

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    private String deckName;

    public Pile(String deckName) {
        this.deckName = deckName;
    }

    public ArrayList<Card> getCardList() {
        return cardList;
    }

    public void setCardList(ArrayList<Card> cardList) {
        this.cardList = cardList;
    }

    public Card drawCard(){ //This method is for drawing card
        Card draw = this.cardList.get(0); //get the element from the cardList
        this.removeCard();
        return draw;
    }
    public void removeCard(){
        this.cardList.remove(0);//remove the element from the cardList
    }

    public void addCard(Card card){
        this.cardList.add(card);//adding the card to the cardList
    }





}
