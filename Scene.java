package AdventureTime;

import java.util.Random;
import java.util.Scanner;

public class Scene {
    private Random random;

    public Scene() {
        random = new Random();
    }

    public void startingScene(Player player, Scanner scanner) {
        // Implement the starting scene logic here
        // For example, asking the player to enter the dark forest and making decisions based on randomness and player attributes
    }

    public void dragonFight(Player player) {
        // Implement the dragon fight scenario here
        // You can use random numbers for dice rolling
        // Update player properties based on the outcome
    }

    public void tigerFight(Player player) {
        // Implement the sabertooth tiger fight scenario here
        // You can use random numbers for dice rolling
        // Update player properties based on the outcome
    }

    public void shipJourney(Player player) {
        // Implement the ship journey scenario here
        // You can provide options for the player and update player properties based on choices and events
    }

    private int rollDice(int min, int max) {
        // Simulate rolling a dice with the specified min and max values
        return random.nextInt(max - min + 1) + min;
    }
}