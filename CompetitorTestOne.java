import org.junit.Test;
import tuma.homework.biathlonwinners.Competitor;
import tuma.homework.biathlonwinners.CompetitorRepository;

import static org.junit.Assert.assertEquals;

public class CompetitorTestOne {

    @Test
    public void testWhenAddOneDataToRepository(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xxxox","xxxxx","xxoxo");
        repository.addToRepository(competitor1);
        assertEquals(repository.getCount(), 1);
    }
    @Test
    public void testWhenAddTwoDataToRepository(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xxxox","xxxxx","xxoxo");
        Competitor competitor2 = new Competitor(1,"Jimmy Smiles","UK","29:15","xxoox","xooxo","xxxxo");
        repository.addToRepository(competitor1);
        repository.addToRepository(competitor2);
        assertEquals(repository.getCount(), 2);
    }
    @Test
    public void testWhenAddThreeDataToRepository(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xxxox","xxxxx","xxoxo");
        Competitor competitor2 = new Competitor(1,"Jimmy Smiles","UK","29:15","xxoox","xooxo","xxxxo");
        Competitor competitor3 = new Competitor(27,"Piotr Smitzer","CZ","30:10","xxxxx","xxxxx","xxxxx");
        repository.addToRepository(competitor1);
        repository.addToRepository(competitor2);
        repository.addToRepository(competitor3);
        assertEquals(repository.getCount(), 3);
    }
    @Test
    public void testWhenAddFourDataToRepository(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xxxox","xxxxx","xxoxo");
        Competitor competitor2 = new Competitor(1,"Jimmy Smiles","UK","29:15","xxoox","xooxo","xxxxo");
        Competitor competitor3 = new Competitor(7, "Marcu Tudor", "RO","34:15", "xxooo","oooxx","ooxoo");
        Competitor competitor4 = new Competitor(27,"Piotr Smitzer","CZ","30:10","xxxxx","xxxxx","xxxxx");
        repository.addToRepository(competitor1);
        repository.addToRepository(competitor2);
        repository.addToRepository(competitor3);
        repository.addToRepository(competitor4);
        assertEquals(repository.getCount(), 4);
    }

    @Test
    public void testWhenAddFiveDataToRepository(){
        CompetitorRepository repository = new CompetitorRepository();
        Competitor competitor1 = new Competitor(11,"Umar Jorgson","SK","30:27","xxxox","xxxxx","xxoxo");
        Competitor competitor2 = new Competitor(1,"Jimmy Smiles","UK","29:15","xxoox","xooxo","xxxxo");
        Competitor competitor3 = new Competitor(7, "Marcu Tudor", "RO","34:15", "xxooo","oooxx","ooxoo");
        Competitor competitor4 = new Competitor(27,"Piotr Smitzer","CZ","30:10","xxxxx","xxxxx","xxxxx");
        Competitor competitor5 = new Competitor(12, "Fodor Levente", "HU","38:12", "xoooo","oooxx","ooxoo");
        repository.addToRepository(competitor1);
        repository.addToRepository(competitor2);
        repository.addToRepository(competitor3);
        repository.addToRepository(competitor4);
        repository.addToRepository(competitor5);
        assertEquals(repository.getCount(), 5);
    }
}