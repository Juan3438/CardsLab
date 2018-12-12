public class Card {

    private String Rank;    //name of card
    private String Suit;
    private int PointValue;

    public Card(String x, String y,int z){
        Rank = x;
        Suit=y;
        PointValue=z;
    }
    public String getRank(){
        return Rank;
    }
    public String getSuit(){
        return Suit;
    }
    public int getPointValue(){
        return PointValue;
    }
    public boolean equals(Card othercard){
        return (PointValue == othercard.getPointValue());
    }
    public String toString(){
        return Suit;
    }
}
