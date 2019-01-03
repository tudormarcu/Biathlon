import org.junit.Test;
import tuma.homework.biathlonwinners.Competitor;
import tuma.homework.biathlonwinners.CompetitorRepository;

import static org.junit.Assert.assertEquals;

public class CompetitorTestThree {

    @Test
    public void testPenaltyCounterWhenAllFromFirstShootWereMissed(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","ooooo","xxxxx","xxxxx");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getNumberOfPenalties(), 5);
    }
    @Test
    public void testPenaltyCounterWhenAllFromSecondShootWereMissed(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xxxxx","ooooo","xxxxx");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getNumberOfPenalties(), 5);
    }
    @Test
    public void testPenaltyCounterWhenAllFromThirdShootWereMissed(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xxxxx","xxxxx","ooooo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getNumberOfPenalties(), 5);
    }
    @Test
    public void testPenaltyCounterWhenOneShotWasMissedFromEachAttempt(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xxxxo","xxxxo","xxxxo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getNumberOfPenalties(), 3);
    }
    @Test
    public void testPenaltyCounterWhenTwoShotsWereMissedFromEachAttempt(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xxxoo","xxxoo","xxxoo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getNumberOfPenalties(), 6);
    }

    @Test
    public void testPenaltyCounterWhenThreeShotsWereMissedFromEachAttempt(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xxooo","xxooo","xxooo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getNumberOfPenalties(), 9);
    }
    @Test
    public void testPenaltyCounterWhenFourShotsWereMissedFromEachAttempt(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xoooo","xoooo","xoooo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getNumberOfPenalties(), 12);
    }

    @Test
    public void testPenaltyCounterWhenFiveShotsWereMissedFromEachAttempt(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","ooooo","ooooo","ooooo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getNumberOfPenalties(), 15);
    }
}
