package projects.inventory.guitarstore;

public class Card {
    private String face; // "Ace", "King", ... 2
    private String suit; // "Hearts", "Diamonds", ...

    public  Card(String face, String suit)
    {
        this.face = face;
        this.suit = suit;
    }
    
    public String getFace()
    {
        return this.face;
    }

    public String getSuit()
    {
        return this.suit;
    }
}
