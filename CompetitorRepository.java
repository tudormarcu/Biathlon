package tuma.homework.biathlonwinners;

import java.util.Set;
import java.util.TreeSet;


public class CompetitorRepository extends Competitor{

    Set<Competitor> competitorSet = new TreeSet<Competitor>(new TimeComparator());


    public CompetitorRepository() {
    }

    public void addToRepository(Competitor person) {

        competitorSet.add(person);
    }

    public void printRepository() {
        System.out.println("The final ranking is: "+ "\n");
        System.out.println("");
        for (Competitor set : competitorSet) {
            System.out.println(set);
        }
        System.out.println("");
    }

    public Object getCount() {
        return competitorSet.size();
    }
}



