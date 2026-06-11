import java.util.Scanner;

/**
 * SoccerTeam
 * This is the parent class.
 * It is abstract because we want child classes to be more specific.
 */
public abstract class SoccerTeam implements TeamActions {

    // 3 attributes (different data types)
    private String name;
    private int rosterSize;
    private double baseBudget;

    /**
     * Default constructor
     * Makes a basic team if nothing is given.
     */
    public SoccerTeam() {
        name = "Unknown";
        rosterSize = 0;
        baseBudget = 0.0;
    }

    /**
     * Constructor
     * Makes a team with starting values.
     */
    public SoccerTeam(String name, int rosterSize, double baseBudget) {
        this.name = name;
        this.rosterSize = rosterSize;
        this.baseBudget = baseBudget;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRosterSize() {
        return rosterSize;
    }

    public void setRosterSize(int rosterSize) {
        this.rosterSize = rosterSize;
    }

    public double getBaseBudget() {
        return baseBudget;
    }

    public void setBaseBudget(double baseBudget) {
        this.baseBudget = baseBudget;
    }

    /**
     * Abstract method
     * Each child class must say what type of team it is.
     */
    public abstract String getTeamType();

    /**
     * Method 1 (calculation)
     * Uses user input to calculate estimated revenue.
     * This is required in the rubric.
     */
    @Override
    public double calculateEstimatedSeasonRevenue(Scanner sc) {
        System.out.print("Enter average ticket price: ");
        double ticketPrice = sc.nextDouble();

        System.out.print("Enter number of home games: ");
        int homeGames = sc.nextInt();

        // Simple math:
        // I estimate attendance as roster size times 1000.
        double attendancePerGame = rosterSize * 1000.0;

        // Revenue = ticketPrice * homeGames * attendancePerGame
        return ticketPrice * homeGames * attendancePerGame;
    }

    /**
     * Method 2 (changes object data)
     * Uses user input to change the roster size.
     * This is required in the rubric.
     */
    @Override
    public void updateRoster(Scanner sc) {
        System.out.print("How many players to add? (negative removes): ");
        int change = sc.nextInt();

        int newSize = rosterSize + change;

        // Do not allow negative roster size
        if (newSize < 0) {
            newSize = 0;
        }

        rosterSize = newSize;
    }

    /**
     * toString method
     * Prints team info.
     */
    @Override
    public String toString() {
        return "SoccerTeam{" +
                "type='" + getTeamType() + '\'' +
                ", name='" + name + '\'' +
                ", rosterSize=" + rosterSize +
                ", baseBudget=" + String.format("%.2f", baseBudget) +
                '}';
    }
}
