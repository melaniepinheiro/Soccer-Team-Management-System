import java.util.Scanner;

/**
 * ClubTeam
 * This is a child class.
 * It extends SoccerTeam.
 */
public class ClubTeam extends SoccerTeam {

    private String league;
    private int trophies;

    /**
     * Default constructor
     */
    public ClubTeam() {
        super();
        league = "Unknown League";
        trophies = 0;
    }

    /**
     * Constructor
     */
    public ClubTeam(String name, int rosterSize, double baseBudget, String league, int trophies) {
        super(name, rosterSize, baseBudget);
        this.league = league;
        this.trophies = trophies;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    /**
     * This is the abstract method from the parent.
     */
    @Override
    public String getTeamType() {
        return "Club Team";
    }

    /**
     * Override method 1 (calculation)
     * Club teams also get merch money.
     */
    @Override
    public double calculateEstimatedSeasonRevenue(Scanner sc) {
        double ticketRevenue = super.calculateEstimatedSeasonRevenue(sc);

        System.out.print("Enter merch revenue: ");
        double merch = sc.nextDouble();

        return ticketRevenue + merch;
    }

    /**
     * Override method 2 (changes object data)
     * Club teams can spend money on transfers.
     */
    @Override
    public void updateRoster(Scanner sc) {
        super.updateRoster(sc);

        System.out.print("Enter transfer spending: ");
        double spending = sc.nextDouble();

        // Spending lowers the budget
        setBaseBudget(getBaseBudget() - spending);

        if (getBaseBudget() < 0) {
            setBaseBudget(0);
        }
    }

    /**
     * Override toString (required)
     */
    @Override
    public String toString() {
        return "ClubTeam{" +
                "name='" + getName() + '\'' +
                ", rosterSize=" + getRosterSize() +
                ", baseBudget=" + String.format("%.2f", getBaseBudget()) +
                ", league='" + league + '\'' +
                ", trophies=" + trophies +
                '}';
    }
}
