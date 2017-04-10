package Cardgame;

public class SpecialDeck extends ObjectDeck{

    public SpecialDeck(Object... deck) {
        super(deck);
    }
    
    @Override
    public Special deal() {
        return ((Special) super.deal());
    }
}