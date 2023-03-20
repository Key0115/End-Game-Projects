public class Card {
    public class Card { // This is a just ONE card not multiple cards
        private String suit;
        private int point;
        private String num;

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public Card(String suit, String num, int points) {
            this.suit = suit;
            this.num = num;
            this.point = points;
        }

        public String getSuit() {
            return suit;
        }

        public void setSuit(String suit) {
            this.suit = suit;
        }

        public int getPoint() {
            return point;
        }

        public void setPoint(int point) {
            this.point = point;
        }




    }
}
