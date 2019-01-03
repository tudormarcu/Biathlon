package tuma.homework.biathlonwinners;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {

    public void readFile() throws IOException {
        File f = new File("./Resources/CompetitorsList.csv");

        Scanner input = new Scanner(f);
        input.useDelimiter(",|\n");
        CompetitorRepository repository = new CompetitorRepository();

        while (input.hasNext()) {
            int athleteNumber = input.nextInt();
            String athleteName = input.next();
            String countryCode = input.next();
            String skiTimeResult = input.next();
            String firstShoot = input.next();
            String secondShoot = input.next();
            String thirdShoot = input.next();
            Competitor newCompetitor = new Competitor(athleteNumber, athleteName, countryCode, skiTimeResult, firstShoot, secondShoot, thirdShoot);
            repository.addToRepository(newCompetitor);
        }
        repository.printRepository();
    }

}
