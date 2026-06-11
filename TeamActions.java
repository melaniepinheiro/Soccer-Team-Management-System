import java.util.Scanner;

/**
 * TeamActions
 * This is an interface.
 * It forces team classes to have these 2 methods.
 */
public interface TeamActions {

    /**
     * This method does a calculation using user input.
     * @param sc scanner for user input
     * @return a double answer from the math
     */
    double calculateEstimatedSeasonRevenue(Scanner sc);

    /**
     * This method changes the object using user input.
     * @param sc scanner for user input
     */
    void updateRoster(Scanner sc);
}
