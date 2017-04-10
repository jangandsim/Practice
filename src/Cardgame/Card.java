package Cardgame;

public abstract class Card implements Special{
    private String name;
    private String description;
    
    public Card(String name, String description) {
        this.name = name;
        this.description = description;
    }
    @Override
    public boolean equals(Object other) {
        Card that = (Card) other;
        return name.equals(that.name) && description.equals(that.description);
    }
    
    public String toString() {
        return String.format("%s: %s", name, description);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
