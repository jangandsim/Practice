package Cardgame;

public class MonsterCard extends Card{
    private int power;
    private int basePower;
    private boolean canAttack;
    
    public MonsterCard(String name, String description, 
            int power, boolean canAttack) {
        super(name, description);
        this.power = power;
        this.canAttack = canAttack;
    }
    
    public MonsterCard(String name, String description, int power) {
        this(name, description, power, false);
    }
    
    @Override
    public boolean equals(Object other) {
        MonsterCard that = (MonsterCard) other;
        return super.equals(other) && power == that.power 
                    && basePower == that.basePower;
        
    }
    
    @Override
    public String toString() {
        return String.format("%s | Power: %d | Can attack: %b", 
                super.toString(), power, canAttack);
    }
    
    
    
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getBasePower() {
        return basePower;
    }
    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
    }
    public boolean getCanAttack() {
        return canAttack;
    }

    @Override
    public void instantEffect(Field owner, Field enemy) {
    }

}
