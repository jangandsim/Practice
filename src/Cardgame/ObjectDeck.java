package Cardgame;

public class ObjectDeck {
    private Object[] deck;
    private int size;
    
    public ObjectDeck(Object... deck) {
        this.deck = deck;
        size = deck.length;
    }
    
    public Object deal() {
        if (size > 0) return deck[--size];
        return null;
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
}
