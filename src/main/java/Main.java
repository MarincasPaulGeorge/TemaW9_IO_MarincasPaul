import java.util.Set;
import java.util.TreeSet;

public class Main {

AthleteComparator athleteComparator = new AthleteComparator();
Set<Athlete> athleteSet = new TreeSet<>(athleteComparator);
Athlete athlete1 = new Athlete(11, "Umar Jorgson", "SK", 30 );


    athleteSet.add(athlete1);

    for(Athlete athlete : athleteSet) {
        System.out.println(athlete);
    }
}
