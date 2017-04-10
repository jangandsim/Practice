
public class Olympics {

	public static void main(String[] args) {
        Athlete[] athletes = new Athlete[4];
		athletes[0] = new SoccerAthlete("Jang Joon Young", 0, true, 0.0, true, true);
		athletes[1] = new TennisAthlete("No Jae Young", 10, false, 0.0, true, true);
		athletes[2] = new JavelinAthlete("Kim SungJin", 10, true, 0.0, true, true);
		athletes[3] = new LolAthlete("Jo Han Bin", 999, true, 999, false, false);
        Spectator[] spectators = new Spectator[4];
        spectators[0] = new Spectator(athletes[0]);
        spectators[1] = new Spectator(athletes[2]);
        spectators[2] = new SuperFan(athletes[1]);
        spectators[3] = new SuperFan(athletes[3]);

        for (Athlete a : athletes) {
            a.play();
        }

        EventManager jo = new EventManager();

        jo.trainAthletes(athletes);
        jo.feedAthletes(athletes);
        jo.inspectAthletes(athletes);
        jo.organizeGames(athletes);

        for (Spectator b : spectators) {
            b.cheerForFavorite();
        }
	}
}