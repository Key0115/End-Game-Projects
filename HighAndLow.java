import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class HighAndLow {
    public void game() {
        Scanner mysc = new Scanner(System.in);
        Deck myDeck = new Deck(); //Make new deck
        myDeck.cardCreater();
        myDeck.shuffleCards();
        int score = 0; // Initialise the score variable

        boolean valid = false; // this is boolean variable to running game to judge run or not
        while (!valid) {
            Card firstCard = myDeck.getCard();// get the first card from the Deck
            myDeck.removeCard();// without it is not gonna work due to first card will be stuck
            Card secondCard = myDeck.getCard();// get the second card from the Deck
            myDeck.removeCard();//without it is not gonna work due to second card will be stuck
            System.out.println(firstCard.getSuit() + " " + firstCard.getNum());//get the actual value of the first card
            System.out.println("Higher or Lower");
            String guess = mysc.nextLine(); // Asking for user input
            System.out.println(secondCard.getSuit() + " " +secondCard.getNum());//get the actual value of the second card
            if (guess.equalsIgnoreCase("H")) { // To specified "H" is typed or not
                if (firstCard.getPoint() < secondCard.getPoint()) {
                    score++; // count the score
                    System.out.println("Your guess was correct!!!!");
                    System.out.println("Your current point is : " + score);
                } else {
                    valid = true;// To stop the code in this condition
                    System.out.println("Your guess is wrong");
                }
            }else if (guess.equalsIgnoreCase("L")) { // To specified "H" is typed or not
                if (firstCard.getPoint() < secondCard.getPoint()) {
                    score++; // count the score
                    System.out.println("Your guess was correct!!!!");
                    System.out.println("Your current point is : " + score);
                } else {
                    valid = true;// To stop the code in this condition
                    System.out.println("Your guess is wrong");
                }
            } else{
                System.out.println("Invalid, please enter H or L");
            }
        }
    }
}

