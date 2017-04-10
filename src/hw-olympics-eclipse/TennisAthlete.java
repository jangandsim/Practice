class TennisAthlete extends Athlete {

    public TennisAthlete(String name, int serveSpeed,
            boolean canScoreGoal, double javelinDamage, boolean isACheater, boolean trollOrNot) {
    	super(name, serveSpeed,
    	        canScoreGoal, javelinDamage, isACheater, trollOrNot);
    }
    
    @Override
    /**
     * Has the athlete serve a tennis ball.
     */
    public void play() {
        System.out.println(String.format("%s serves the ball at %dmph!",
            getName(), this.serveSpeed));
    }

}
