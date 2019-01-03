import org.junit.Test;
import tuma.homework.biathlonwinners.Competitor;
import tuma.homework.biathlonwinners.CompetitorRepository;

import static org.junit.Assert.assertEquals;

public class CompetitorTestFive {
    @Test
    public void testFinalTimeWhenTimeIsDifferentAndOneShotWasMissedOne(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xxxx","xxxxx","xxxxo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getFinalTime(), 1837, 0);
    }
    @Test
    public void testFinalTimeWhenTimeIsDifferentAndOneShotWasMissedTwo(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:37","xxxx","xxxxx","xxxxo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getFinalTime(), 1847, 0);
    }
    @Test
    public void testFinalTimeWhenTimeIsDifferentAndOneShotWasMissedThree(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","31:27","xxxx","xxxxx","xxxxo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getFinalTime(), 1897, 0);
    }
    @Test
    public void testFinalTimeWhenTimeIsDifferentAndOneShotWasMissedFour(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","35:27","xxxx","xxxxx","xxxxo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getFinalTime(), 2137, 0);
    }
    @Test
    public void testFinalTimeWhenTimeIsDifferentAndOneShotWasMissedFive(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","33:37","xxxx","xxxxx","xxxxo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getFinalTime(), 2027, 0);
    }
}
