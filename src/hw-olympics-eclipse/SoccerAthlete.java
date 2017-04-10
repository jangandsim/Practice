class SoccerAthlete extends Athlete {

    public SoccerAthlete(String name, int serveSpeed,
            boolean canScoreGoal, double javelinDamage, boolean isACheater, boolean trollOrNot) {
    	super(name, serveSpeed,
    	        canScoreGoal, javelinDamage, isACheater, trollOrNot);
    }
    
    @Override
    /**
     * Has the athlete shoot for a goal.
     */
    public void play() {
        System.out.println(String.format("%s shoots and %s!",
            getName(), canScoreGoal ? "scores" : "misses"));
    }

}
