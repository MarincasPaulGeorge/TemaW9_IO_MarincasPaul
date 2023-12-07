public class Athlete {
private int athleteNumber;
private String athleteName;
private String numberCode;
private int skiTimeResult;

public Athlete(){

}

    public Athlete(int athleteNumber, String athleteName, String numberCode, int skiTimeResult) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.numberCode = numberCode;
        this.skiTimeResult = skiTimeResult;
    }

    public int getAthleteNumber() {
        return athleteNumber;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public String getNumberCode() {
        return numberCode;
    }

    public int isSkiTimeResult() {
        return skiTimeResult;
    }

    @Override
    public String toString() {
        return "Athletes{" +
                "athleteNumber=" + athleteNumber +
                ", athleteName='" + athleteName + '\'' +
                ", numberCode='" + numberCode + '\'' +
                ", skiTimeResult=" + skiTimeResult +
                '}';
    }
}
