package Cardgame;

public class PowerCard extends SpellCard{

    public PowerCard() {
        super("Power Card", "Increases power of monster by 100 each turn");
    }

    @Override
    public void turnEffect(Field ownerField, Field enemyField) {
        MonsterCard[] dec = ownerField.getMonsters();
    }

    @Override
    void destroyedEffect(Field ownerField, Field enemyField) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void instantEffect(Field owner, Field enemy) {
        // TODO Auto-generated method stub
        
    }

}
