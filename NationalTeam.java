import java.util.Scanner;

/**
 * NationalTeam
 * This is a child class.
 * It extends SoccerTeam.
 */
public class NationalTeam extends SoccerTeam {

    private String country;
    private int worldCupTitles;

    /**
     * Default constructor
     */
    public NationalTeam() {
        super();
        country = "Unknown Country";
        worldCupTitles = 0;
    }

    /**
     * Constructor
     */
    public NationalTeam(String name, int rosterSize, double baseBudget, String country, int worldCupTitles) {
        super(name, rosterSize, baseBudget);
        this.country = country;
        this.worldCupTitles = worldCupTitles;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getWorldCupTitles() {
        return worldCupTitles;
    }

    public void setWorldCupTitles(int worldCupTitles) {
        this.worldCupTitles = worldCupTitles;
    }

    /**
     * This is the abstract method from the parent.
     */
    @Override
    public String getTeamType() {
        return "National Team";
    }

    /**
     * Override method 1 (calculation)
     * National teams focus on sponsorship money.
     */
    @Override
    public double calculateEstimatedSeasonRevenue(Scanner sc) {
        System.out.print("Enter sponsorship per tournament: ");
        double sponsor = sc.nextDouble();

        System.out.print("Enter number of tournaments: ");
        int tournaments = sc.nextInt();

        return sponsor * tournaments;
    }

    /**
     * Override method 2 (changes object data)
     * Also asks for coach name just to show more input.
     */
    @Override
    public void updateRoster(Scanner sc) {
        super.updateRoster(sc);

        sc.nextLine(); // fix newline issue

        System.out.print("Enter coach name: ");
        String coach = sc.nextLine();

        System.out.println("Coach saved: " + coach);
    }

    /**
     * Override toString (required)
     */
    @Override
    public String toString() {
        return "NationalTeam{" +
                "name='" + getName() + '\'' +
                ", rosterSize=" + getRosterSize() +
                ", baseBudget=" + String.format("%.2f", getBaseBudget()) +
                ", country='" + country + '\'' +
                ", worldCupTitles=" + worldCupTitles +
                '}';
    }
}


