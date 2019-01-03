package tuma.homework.biathlonwinners;


public class Competitor {

    private int athleteNumber;
    private String athleteName;
    private String countryCode;
    private String skiTimeResult;
    private String firstShoot;
    private String secondShoot;
    private String thirdShoot;
    private double tempTime;
    private String allShoots;
    private int numberOfPenalties;
    private int finalTime;
    static final int MINUTE_CONVERSION_CONSTANT = 60;
    static final int TIME_PENALTY = 10;

    public Competitor() {

    }

    public Competitor(int athleteNumber, String athleteName, String countryCode, String skiTimeResult,
                      String firstShoot, String secondShoot, String thirdShoot) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShoot = firstShoot;
        this.secondShoot = secondShoot;
        this.thirdShoot = thirdShoot;
        this.allShoots = firstShoot + secondShoot + thirdShoot;
        this.numberOfPenalties = getNumberOfPenalties();
        this.tempTime = Double.parseDouble(skiTimeResult.replace(":", "."));
        countPenalties();
        computeFinalTime();

    }

    @Override
    public String toString() {
        return
                "Athlete number: " + athleteNumber +
                        ", Athlete name: " + athleteName +
                        ", Country code: " + countryCode +
                        ", Ski time result: " + skiTimeResult + ", Time after penalties: " + finalTime / 60 + ":" + finalTime % 60 +
                        ", FirstShoot: " + firstShoot +
                        ", SecondShoot: " + secondShoot +
                        ", ThirdShoot: " + thirdShoot + "\n";

    }

    public int getNumberOfPenalties() {
        return numberOfPenalties;
    }

    public void setNumberOfPenalties(int numberOfPenalties) {
        this.numberOfPenalties = numberOfPenalties;
    }

    public int getFinalTime() {
        return finalTime;
    }

    public int countPenalties() {
        char o = 'o';
        int count = 0;
        for (int j = 0; j < allShoots.length(); j++) {
            if (allShoots.charAt(j) == o) {
                count++;
            }
            setNumberOfPenalties(count);
        }

        return 0;
    }

    public void computeFinalTime() {
        String[] tokens = skiTimeResult.split(":");
        int minuteTime = Integer.parseInt(tokens[0]);
        int secondTime = Integer.parseInt(tokens[1]);
        this.finalTime = (minuteTime * MINUTE_CONVERSION_CONSTANT + secondTime + numberOfPenalties * TIME_PENALTY);
    }
}


