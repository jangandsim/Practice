package Cardgame;

public class BlueEyesWhiteDragon extends MonsterCard{

    public BlueEyesWhiteDragon() {
        super("Blue Eyes White Dragon", "The best card.", 3000);
    }
    @Override
    public void instantEffect(Field owner, Field enemy) {
        owner.addMonsterCard(this);
        owner.addMonsterCard(this);
    }
}
