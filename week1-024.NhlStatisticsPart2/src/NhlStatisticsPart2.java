
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                NHLStatistics.sortByPoints();     // orders the players by points
                NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                NHLStatistics.sortByGoals();     // orders the players by points
                NHLStatistics.top(10);
                // Print the top ten players sorted by goals.
            } else if (command.equals("assists")) {
                NHLStatistics.sortByAssists();    // orders the players by assists
                NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                NHLStatistics.sortByPenalties();  // orders the players by penalty minutes
                NHLStatistics.top(10);
            } else if (command.equals("player")) {
                System.out.println("Type a player's name: ");
                String name = reader.nextLine();
                NHLStatistics.searchByPlayer(name);  
                // Ask the user first which player's statistics are needed and then print them.
            } else if (command.equals("club")) {
                System.out.println("Type a club's abbreviation: ");
                String club = reader.nextLine();
                NHLStatistics.sortByPoints();     // orders the players by points
                NHLStatistics.teamStatistics(club);  
            }

        }
    }
}
