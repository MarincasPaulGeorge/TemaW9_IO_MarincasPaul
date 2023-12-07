import java.util.Comparator;

public class AthleteComparator implements Comparator<Athlete> {
    public int compare(Athlete o1, Athlete o2) {return o1.isSkiTimeResult();
    }
}
