package tuma.homework.biathlonwinners;

import java.util.Comparator;

public class TimeComparator implements Comparator <Competitor> {
    @Override
    public int compare(Competitor c1, Competitor c2) {
        return Double.compare(c1.getFinalTime(), c2.getFinalTime());
    }
}
