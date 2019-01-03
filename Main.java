package tuma.homework.biathlonwinners;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileIO();
        try {
            f.readFile();

        }catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}
