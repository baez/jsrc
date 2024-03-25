package projects.inventory.guitarstore;

public class DeckOfCards {
    private static int NUMBER_OF_CARDS = 52;

    private Card[] deck = new Card[NUMBER_OF_CARDS];

    public DeckOfCards()
    {
        String[] faces = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        
        for (int i = 0; i < deck.length;  i++)
        {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);
        }
    }
}
