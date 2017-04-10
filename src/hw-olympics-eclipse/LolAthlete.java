
public class LolAthlete extends Athlete {
   
	public LolAthlete(String name, int serveSpeed,
            boolean canScoreGoal, double javelinDamage, boolean isACheater, boolean trollOrNot) {
    	super(name, serveSpeed,
    	        canScoreGoal, javelinDamage, isACheater, trollOrNot);
    }
    
    @Override
    public void play() {
    	System.out.println(String.format("%s played and %s!", getName(), trollOrNot ? "trolled" : "carried"));
    }
}
