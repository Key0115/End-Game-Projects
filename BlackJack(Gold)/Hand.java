import java.util.ArrayList;
public class Hand extends Pile {
    private boolean finished;//decide is it twist or stuck
    public Hand(String deckName) {
        super(deckName);
    }
    public boolean getFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }



    public void LookingHand() { // This is checking the hand that player have
        for (Card card : this.cardList) {
            System.out.print(card.getNum() + " : " + card.getSuit()+"   ");
            // To print the property of the each card inside the cardList
        }
    }

    public int CountingScore() { // counting scores of the player
        int score = 0;
        ArrayList <Card> Ace = new ArrayList<>();
        for (Card card : this.cardList) {
            if(card.getNum().equalsIgnoreCase("Ace") ){
                Ace.add(card);
            }
            else{
                score += card.getPoint();
            }
            /*for(int i = 0;i<Ace.size();i++){
                if(score + 11 > 21){
                    score++;
                }
                else{
                    score +=11;
                }
            }
            */
        }
        for(int i = 0;i<Ace.size();i++){
            if(score + 11 > 21){
                score++;
            }
            else{
                score +=11;
            }
        }
        return score;
    }
}