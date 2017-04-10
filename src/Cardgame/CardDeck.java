package Cardgame;

public class CardDeck extends ObjectDeck{
    
    public CardDeck(Object... deck) {
        super(deck);
    }
    
    @Override
    public Card deal() {
        return ((Card) super.deal());
    }
}
