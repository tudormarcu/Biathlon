import org.junit.Test;
import tuma.homework.biathlonwinners.Competitor;
import tuma.homework.biathlonwinners.CompetitorRepository;

import static org.junit.Assert.assertEquals;

public class CompetitorTestTwo {
    @Test
    public void testPenaltyCounterForOneCompetitor(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xxxox","xxxox","xxoxo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getNumberOfPenalties(), 4);
    }
    @Test
    public void testPenaltyCounterForTwoCompetitors(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xxxox","xxxox","xxoxo");
        Competitor competitor2 = new Competitor(1,"Jimmy Smiles","UK","29:15","xxoox","xooxo","xxxxo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getNumberOfPenalties(), 4);
        repository.addToRepository(competitor2);
        assertEquals(competitor2.getNumberOfPenalties(), 6);
    }
    @Test
    public void testPenaltyCounterForThreeCompetitors(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xxxox","xxxox","xxoxo");
        Competitor competitor2 = new Competitor(1,"Jimmy Smiles","UK","29:15","xxoox","xooxo","xxxxo");
        Competitor competitor3 = new Competitor(7, "Marcu Tudor", "RO","34:15", "xxooo","oooxx","ooxoo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getNumberOfPenalties(), 4);
        repository.addToRepository(competitor2);
        assertEquals(competitor2.getNumberOfPenalties(), 6);
        repository.addToRepository(competitor3);
        assertEquals(competitor3.getNumberOfPenalties(), 10);
    }
    @Test
    public void testPenaltyCounterForFourCompetitors(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xxxox","xxxox","xxoxo");
        Competitor competitor2 = new Competitor(1,"Jimmy Smiles","UK","29:15","xxoox","xooxo","xxxxo");
        Competitor competitor3 = new Competitor(7, "Marcu Tudor", "RO","34:15", "xxooo","oooxx","ooxoo");
        Competitor competitor4 = new Competitor(27,"Piotr Smitzer","CZ","30:10","xxxxx","xxxxx","xxxxx");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getNumberOfPenalties(), 4);
        repository.addToRepository(competitor2);
        assertEquals(competitor2.getNumberOfPenalties(), 6);
        repository.addToRepository(competitor3);
        assertEquals(competitor3.getNumberOfPenalties(), 10);
        repository.addToRepository(competitor4);
        assertEquals(competitor4.getNumberOfPenalties(), 0);
    }

    @Test
    public void testPenaltyCounterForFiveCompetitors(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xxxox","xxxox","xxoxo");
        Competitor competitor2 = new Competitor(1,"Jimmy Smiles","UK","29:15","xxoox","xooxo","xxxxo");
        Competitor competitor3 = new Competitor(7, "Marcu Tudor", "RO","34:15", "xxooo","oooxx","ooxoo");
        Competitor competitor4 = new Competitor(27,"Piotr Smitzer","CZ","30:10","xxxxx","xxxxx","xxxxx");
        Competitor competitor5 = new Competitor(12, "Fodor Levente", "HU","38:12", "xoooo","oooxx","ooxoo");
        repository.addToRepository(competitor1);
        assertEquals(competitor1.getNumberOfPenalties(), 4);
        repository.addToRepository(competitor2);
        assertEquals(competitor2.getNumberOfPenalties(), 6);
        repository.addToRepository(competitor3);
        assertEquals(competitor3.getNumberOfPenalties(), 10);
        repository.addToRepository(competitor4);
        assertEquals(competitor4.getNumberOfPenalties(), 0);
        repository.addToRepository(competitor5);
        assertEquals(competitor5.getNumberOfPenalties(), 11);
    }
}
