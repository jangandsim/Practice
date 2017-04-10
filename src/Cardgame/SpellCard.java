package Cardgame;

public abstract class SpellCard extends Card{

    public SpellCard(String name, String description) {
        super(name, description);
    }
    
    abstract void turnEffect(Field ownerField, Field enemyField);
    
    abstract void destroyedEffect(Field ownerField, Field enemyField);
    
    
    @Override
    public boolean equals(Object other) {
        return super.equals(other);
    }
    
}
