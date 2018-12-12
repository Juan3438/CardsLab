import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> unDealt;
    private ArrayList<Card> Dealt;

    public Deck(String[] ranks,String[] suits,int[] values){                  // Constructor(takes in 3 arrays)(repeats to the num of suits + has all given values and ranks)
        for(int i = 0; i< suits.length;i++){
            for(int j =0; j<ranks.length;j++){
                
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

    }

}
