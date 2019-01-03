import org.junit.Test;
import tuma.homework.biathlonwinners.Competitor;
import tuma.homework.biathlonwinners.CompetitorRepository;

import static org.junit.Assert.assertEquals;

public class CompetitorTestFour {
    @Test
    public void testFinalTimeWhenOneShotWasMissed() {
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11, "Umar Jorgson", "SK", "30:27", "xxxx", "xxxxx", "xxxxo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getFinalTime(), 1837, 0);
    }

    @Test
    public void testFinalTimeWhenTwoShotsWereMissed() {
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11, "Umar Jorgson", "SK", "30:27", "xxxox", "xxxxx", "xxoxx");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getFinalTime(), 1847, 0);
    }

    @Test
    public void testFinalTimeWhenThreeShotsWereMissed() {
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11, "Umar Jorgson", "SK", "30:27", "xxoox", "xxxxx", "xxoxo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getFinalTime(), 1867, 0);
    }

    @Test
    public void testFinalTimeWhenFourShotsWereMissed() {
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11, "Umar Jorgson", "SK", "30:27", "xxoox", "xxoxx", "xxoxo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getFinalTime(), 1877, 0);
    }

    @Test
    public void testFinalTimeWhenFiveShotsWereMissed() {
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11, "Umar Jorgson", "SK", "30:27", "xooox", "xxoxx", "xxoxo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getFinalTime(), 1887, 0);
    }
}
