import java.util.Scanner;

/**
 * Name: Melanie Pinheiro
 * Course: COP3330C
 * Date: February 7, 2026
 *
 * Program goal:
 * This program shows inheritance and polymorphism using soccer teams.
 *
 * Inputs:
 * The user types ticket prices, games, merch, sponsorship, roster changes, etc.
 *
 * Outputs:
 * The program prints team info, revenue results, and updated team info.
 */
public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Make at least 5 objects (both child types)
        SoccerTeam[] teams = new SoccerTeam[5];

        teams[0] = new ClubTeam("Orlando City", 26, 2500000, "MLS", 0);
        teams[1] = new ClubTeam("Inter Miami", 28, 5000000, "MLS", 2);
        teams[2] = new NationalTeam("USA Men", 23, 3000000, "United States", 0);
        teams[3] = new NationalTeam("Brazil", 23, 4500000, "Brazil", 5);
        teams[4] = new ClubTeam("FC Barcelona", 25, 12000000, "La Liga", 27);

        // Print all teams
        System.out.println("=== Team List ===");
        for (SoccerTeam t : teams) {
            System.out.println(t);
        }

        // Run both overridden methods for each object
        System.out.println("\n=== Do Methods For Each Team ===");

        for (SoccerTeam t : teams) {
            System.out.println("\n--------------------------");
            System.out.println("Team: " + t.getName());
            System.out.println("Type: " + t.getTeamType());

            // Method 1 (calculation)
            System.out.println("\nRevenue method:");
            double revenue = t.calculateEstimatedSeasonRevenue(sc);
            System.out.println("Result: " + String.format("%.2f", revenue));

            // Method 2 (changes object)
            System.out.println("\nRoster update method:");
            t.updateRoster(sc);

            System.out.println("Updated: " + t);
        }

        sc.close();
        System.out.println("\nDone.");
    }
}

