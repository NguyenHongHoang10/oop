public class Deal {
    public static void main(String[] args) {
        int nPlayer = Integer.parseInt(args[0]);
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String [52];
        for(int i=0; i< suits.length; i++)
            for(int j=0; j< ranks.length; j++)
                deck[ranks.length*i + j] = ranks[j] + " of " + suits[i];
        for(int i=0; i<52; i++) {
            int r = i + (int)(Math.random() * (52 - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
        for(int i=0; i<nPlayer*5; i++) {
            System.out.print(deck[i]);
            if(i % 5 == 4) System.out.println();
            else System.out.print(", ");
        }
    }
}
