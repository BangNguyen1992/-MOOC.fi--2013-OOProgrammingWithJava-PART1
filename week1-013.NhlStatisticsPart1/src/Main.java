
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        NHLStatistics.sortByGoals();     // orders the players by points
        NHLStatistics.top(10);
        NHLStatistics.sortByPenalties();  // orders the players by penalty minutes
        NHLStatistics.top(25);
        NHLStatistics.searchByPlayer("Sidney Crosby");  // prints stats of Sidney Crosby
        NHLStatistics.teamStatistics("PHI");  // Statistics of Philadelphia Flyers
        NHLStatistics.sortByPoints();     // orders the players by points
        NHLStatistics.teamStatistics("ANA");  // Statistics of Anaheim Ducks
    }
}
