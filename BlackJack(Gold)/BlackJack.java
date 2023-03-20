import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {
    Scanner mysc = new Scanner(System.in);
    Deck deck = new Deck("Deck 1"); //Make new deck
    ArrayList<Hand> players = new ArrayList<>();
    Hand player1 = new Hand("Player 1 "); //Determine the name of the player1
    Hand player2 = new Hand("Player 2");//Determine the name of the player2

    public void game() {
        this.dealer();
        this.playerSelection();
        this.firstCard();
        boolean currentTurn = false;//Determine the round of the turn
        boolean gameOver = false; //Determine whether finish the game or not
        System.out.println(player1.getDeckName() + " have  " + player1.CountingScore() + " points");
        player1.LookingHand();
        System.out.println("\n");
        System.out.println(player2.getDeckName() + " have " + player2.CountingScore() + " points");
        player2.LookingHand();
        System.out.println("\n");
        while (currentTurn != true && gameOver != true) {
            currentTurn = true;
            for (Hand hand : this.players) {
                if (hand.getFinished() != true){ // This determines the picking hand or not
                    System.out.println(hand.getDeckName() +"'s " + "Turn");
                    System.out.println("Your current score is " + hand.CountingScore()); // This shows the current score of the player
                    hand.LookingHand();
                    System.out.println("\n");
                    if (this.playerDecision() == true) {
                        //System.out.println(deck.drawCard().getSuit() + " : " + deck.drawCard().getNum());
                        hand.addCard(deck.drawCard());// first card for each turns
                        hand.LookingHand();
                        System.out.println("Your current score is " + hand.CountingScore());
                        System.out.println("\n");
                        if (hand.CountingScore() > 21) { // Check if the player's score is over 21
                            hand.LookingHand();
                            hand.setFinished(true);
                            System.out.println("\n");
                            System.out.println(hand.getDeckName() + " has exceeded 21.");
                            gameOver = true;
                            break; // To finish the game when either player exceeds the 21 points
                        } else {
                            currentTurn = false;
                        }
                        currentTurn = false;
                    } else {
                        hand.setFinished(true);
                        System.out.println("Turn end");
                    }
                }

                }

            }
        this.resultsOfTheGame();
        }




    public void resultsOfTheGame() { // This method expresses the score of each player and the winning conditions
        int player1Score = player1.CountingScore(); // This variable is for represent the score of the player1
        int player2Score = player2.CountingScore(); // This variable is for represent the score of the player2
        if (player1Score <= 21 && player2Score > 21 ) {
            System.out.println("Winner :" + player1.getDeckName());
        }else if (player1Score > 21 && player2Score <= 21) {
            System.out.println("Winner : " + player2.getDeckName());
        } else if (player1Score > 21 && player2Score > 21) {
            System.out.println("Nobody win");
        } else if (player1Score == player2Score) {
            System.out.println("Draw");
        } else if (player1Score <= 21 && player2Score <= 21){
            if(player1Score > player2Score){
                System.out.println("Winner : " + player1.getDeckName());
            }
            else{
                System.out.println("Winner : " + player2.getDeckName());
            }
        }
    }

    public boolean playerDecision(){ // This method for the asking player's decision
        boolean validAnswer = false;
        while (!validAnswer) {
            System.out.println("Twist or Stuck");
            String call = this.mysc.nextLine();
            if (call.equalsIgnoreCase("Twist")) {
                return true;
            } else if (call.equalsIgnoreCase("Stuck")) {
                return false;
            } else {
                System.out.println("This is invalid Answer");
                System.out.println("Please select either [Twist] or [Stuck]");
            }
        }
        return false;
    }
    public void dealer(){ //This method represents the creating card and shuffle the card (Dealer's move)
        this.deck.cardCreater();
        this.deck.shuffleCards();
    }
    public void playerSelection(){ // This is the method for the player
        this.players.add(player1);
        this.players.add(player2);
        //Want to add more player
    }

    public void firstCard(){ //This method expresses the first card that each player will get
        for (Hand hand : players){
            hand.addCard(deck.drawCard());
            hand.addCard(deck.drawCard());
        }
    }

}
