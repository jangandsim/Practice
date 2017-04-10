package Cardgame;

public class Field {
    private MonsterCard[] monsters;
    private SpellCard[] spells;
    
    public Field() {
        monsters = new MonsterCard[5];
        spells = new SpellCard[5];
    }
    
    public void cardTurnEffects(Field enemyField) {
        
    }
    
    public boolean addMonsterCard(MonsterCard card) {
        for (int i = 0; i < monsters.length; i++) {
            if (monsters[i] == null) {
                monsters[i] = card;
                return true;
            }
        }
        return false;
    }
    
    public boolean addSpellCard(SpellCard card) {
        for (int i = 0; i < spells.length; i++) {
            if (spells[i] == null) {
                spells[i] = card;
            }
        }
        return false;
    }
    
    public MonsterCard[] getMonsters() {
        return monsters;
    }
    public SpellCard[] getSpells() {
        return spells;
    }
}