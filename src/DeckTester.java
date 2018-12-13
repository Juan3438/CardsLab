public class DeckTester {
    public void main(String[] args){

        String[] ranks = new String[] {"Blue", "Red"};
        String[] suits = new String[] {"Spades","Diamonds","hearts"};
        int[] values = new int[] {2,2};

        Deck testDeck = new Deck(ranks,suits,values);

        System.out.println("Your hand:" + testDeck.nextCard().toString());

    }
}

