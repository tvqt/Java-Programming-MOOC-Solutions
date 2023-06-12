
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            System.out.println("Team:");
            String team = scan.nextLine();
            int games = 0;
            int wins = 0;
            int losses = 0;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);
                if (homeTeam.equals(team) || visitingTeam.equals(team)) {
                    games++;
                    if (homeTeam.equals(team) && homePoints > visitingPoints) {
                        wins++;
                    } else if (visitingTeam.equals(team) && visitingPoints > homePoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
