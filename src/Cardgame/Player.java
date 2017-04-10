package Cardgame;

public class Player {
    private CardDeck mainDeck;
    private SpecialDeck specialDeck;
    private Card[] hand;
    private Special nextSpecial;
    private int lifePoints;
    
    /**
     * Constructor that takes in card decks and initial life points for a 
     * player
     * @param mainDeck deck to draw cards from
     * @param specialDeck a special deck for special card
     * @param lifePoints initial life points for the game.
     */
    public Player(CardDeck mainDeck, SpecialDeck specialDeck, int lifePoints) {
        this.mainDeck = mainDeck;
        this.specialDeck = specialDeck;
        this.lifePoints = lifePoints;
        hand = new Card[5];
    }
    /**
     * Constructor without input life points
     * @param mainDeck deck to draw cards from
     * @param specialDeck a special deck for special card
     */
    public Player(CardDeck mainDeck, SpecialDeck specialDeck) {
        this(mainDeck, specialDeck, 5000);
    }
    /**
     * draw a card and put that into hand array
     * @param count number of card to be drawn
     * @return true or false whether the card has successfully drawn
     */
    public boolean draw(int count) {
        while (count > 0) {
            int i = 0;
            while (i < hand.length && hand[i] != null) {
                i++;
            }
            if (mainDeck.isEmpty()){
                return false;
            }else if (i == hand.length) {
                return true;
            } else if(hand[i] == null) {
                hand[i] = mainDeck.deal();
            }
            count--;
        }
        return true;
    }
    /**
     * for drawing special card.
     */
    public void drawSpecialCard() {
        if (nextSpecial == null) {
            nextSpecial = specialDeck.deal();
        }
    }
    /**
     * draw 1 card for each turn if it was not successful, 
     * deduct 500 life points
     */
    public void nextTurnPrep() {
        if (!draw(1)) {
            lifePoints -= 500;
        }
        drawSpecialCard();
    }
    /**
     * Play a card properly chosen from hand to the owner's field 
     * @param whichCard index where in the hand to be played
     * @param myField the field the chosen card will be plyed on
     * @return whether the chosen card has successfully played.
     */
    public boolean playCardFromHand(int whichCard, Field myField) {
        if (whichCard >= 5 || whichCard < 0 || hand[whichCard] == null) {
            return false;
        }
        if (hand[whichCard] instanceof MonsterCard) {
            if (myField.addMonsterCard((MonsterCard) hand[whichCard])) {
                hand[whichCard] = null;
            } else {
                return false;
            }
        } else if (hand[whichCard] instanceof SpellCard) {
            if (myField.addSpellCard((SpellCard) hand[whichCard])) {
                hand[whichCard] = null;
            } else {
                return false;
            }
        } else if (hand[whichCard] instanceof TrapCard) {
            return true;
        }
        return false;
    }
    /**
     * play a special card to the field
     * @param myField the field the chosen card will be plyed on
     * @return whether the chosen card has successfully played.
     */
    public boolean playSpecial(Field myField) {
        if (nextSpecial instanceof MonsterCard) {
            if (myField.addMonsterCard((MonsterCard) nextSpecial)) {
                nextSpecial = null;
            } else {
                return false;
            }
        } else if (nextSpecial instanceof SpellCard) {
            if (myField.addSpellCard((SpellCard) nextSpecial)) {
                nextSpecial = null;
            } else {
                return false;
            }
        } else if (nextSpecial instanceof TrapCard) {
            return true;
        }
        return false;
    }
    /**
     * addition to the total life points of given amount
     * @param change the amount to be added to total life points
     */
    public void changeLifePoints(int change) {
        lifePoints += change;
    }
    /**
     * checker whether the player has lost all life points
     * @return whether or not this player has life points less than or
     * equals to 0
     */
    public boolean isDefeated() {
        return lifePoints <= 0;
    }
    /**
     * getter method for nextSpecial
     * @return the special card stored in nextSpecial
     */
    public Special getNextSpecial() {
        return nextSpecial;
    }
    /**
     * setter method for nextSpecial
     * @param nextSpecial Special card will be set to the nextSpecial
     */
    public void setNextSpecial(Special nextSpecial) {
        this.nextSpecial = nextSpecial;
    }
    /**
     * getter method to return cards in hand
     * @return Array of cards in hand array
     */
    public Card[] getHand() {
        return hand;
    }
    /**
     * setter method to set players hand card 
     * @param hand array that will be set to hand of this player
     */
    public void setHand(Card[] hand) {
        this.hand = hand;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
}
