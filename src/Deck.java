import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> unDealt;
    private ArrayList<Card> Dealt;

    public Deck(String[] ranks,String[] suits,int[] values){        // Constructor(takes in 3 arrays)(repeats to the num of suits + has all given values and ranks)

        unDealt = new ArrayList<Card>();
        Dealt = new ArrayList<Card>();

        for(int i = 0; i< suits.length;i++){
            for(int j =0; j<ranks.length;j++){
                Card card = new Card(suits[1],ranks[j],values[j]);
                unDealt.add(card);
            }
        }
    }
    public boolean isEmpty(){
        return (0 == unDealt.size());
    }
    public int size(){
        return unDealt.size();
    }
    public void shuffle(){
        while(Dealt.size() >= 1){
            Card temp = Dealt.get(0);
            unDealt.add(temp);
            Dealt.remove(0);
        }
        ArrayList<Card> temp = unDealt;
        for(int k = 51; k>0;k--){
            int rand = (int)(Math.random()*k);
            temp.add(unDealt.get(rand));
            unDealt.remove(rand);

        }
    }
    public Card nextCard(){
        Card temp = unDealt.get(0);
        unDealt.remove(0);
        return temp;
    }
}
