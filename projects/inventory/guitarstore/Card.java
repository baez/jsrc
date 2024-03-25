package projects.inventory.guitarstore;

public class Card {
    private String face; // "Ace", "King", ...
    private String suit; // "Hearts", "Diamonds", ...

    public  Card(String face, String suit)
    {
        this.face = face;
        this.suit = suit;
    }   
}
