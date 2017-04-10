package Cardgame;

public class DestroySpell extends TrapCard{

    public DestroySpell() {
        super("Destroy Spell", "Destroy the enemy's first spell card.");
    }

    @Override
    public void instantEffect(Field owner, Field enemy) {
        enemy.addSpellCard(null);
        
    }
    
}
