package AdventureTime;

import java.util.Random;
import java.util.Scanner;

public class AdventureTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Prompt the user to create their player
        Player player = createPlayer(scanner);

        // Create the Scene object
        Scene scene = new Scene();

        // Start the game with the starting scene
        scene.startingScene(player, scanner);

        // Implement the game flow and transitions between scenes
        // For example, based on player choices
    }

    // Remove the "private" keyword to make this method accessible
    static Player createPlayer(Scanner scanner) {
        System.out.println("Create your player:");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Health Points (HP): ");
        int hp = scanner.nextInt();

        System.out.print("Enter Strength: ");
        int strength = scanner.nextInt();

        System.out.print("Enter Wisdom: ");
        int wisdom = scanner.nextInt();

        System.out.print("Enter Magic: ");
        int magic = scanner.nextInt();

        System.out.print("Enter Experience Level: ");
        int experienceLevel = scanner.nextInt();


        System.out.println("In a land before modern ages, there was a warrior from the land of Terrax...");
        System.out.println("During his stint before his retirement ceremony, the emperor beckoned his presence.");
        System.out.println("You are a great leader among your people, and there have been rumors that there are those in high seats who wish your head.");
        System.out.println("Because of this, you must be careful on how you arrive at the Emperor's door.");
        System.out.println("How should you leave your camp with your 5 closest soldiers by your side to travel?");
        System.out.println("1. Leave your team and take your dragon; they will slow you down. ETA 2 days");
        System.out.println("2. Travel with your team using Unicorns and horses. ETA 4 days");
        System.out.println("3. Travel taking Sabortooth tigers. ETA 3 to 5 days");
        System.out.println("4. Travel via ship with Captain Jordan James Peterson. ETA 6 days");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The emperor sees you, joyed by your presence.");
                System.out.println("You offer your services, telling them you will be on the front with your dragon.");
                System.out.println("During the battle, the opposing wizards cast a spell turning your dragon into a donkey, and you fell to your death.");
                System.out.println("When your children hear of your name, they are brought great disrespect by the royal family, and your wife is no longer welcome in the lands.");
                System.out.println("Game over.");
                break;
            case 2:
                System.out.println("The emperor is pleased to see you.");
                System.out.println("The emperor tells you to leave your party, talk to your top generals to discuss the land's highest security.");
                System.out.println("The High Lord of the land informs you that Orgers, Noms, and Gorilla homospain class of creatures are en route.");
                System.out.println("What is your next move?");
                System.out.println("1. Offer your services, telling them you will be on the front with your dragon");
                System.out.println("2. Offer your services, telling them you will be on the backend with your dragon");
                System.out.println("3. Offer your services, telling them you will be on the side and allow your dragon to battle without you");
                System.out.println("4. Decline to offer services and explain to them this was supposed to be a retirement party, not a suicide party, and remind them about the last samurai");
                int serviceChoice = scanner.nextInt();
                if (serviceChoice == 1 || serviceChoice == 2 || serviceChoice == 3) {
                    System.out.println("You are dead.");
                    System.out.println("Game over.");
                } else if (serviceChoice == 4) {
                    System.out.println("You decline to offer services and explain that this was supposed to be a retirement party, not a suicide party.");
                    System.out.println("You remind them about the last samurai.");
                    System.out.println("Congratulations! You survive and have a happy ending.");
                }
                break;
            case 3:
                System.out.println("The emperor is pleased to see you.");
                System.out.println("The emperor tells you to leave your party, talk to your top generals to discuss the land's highest security.");
                System.out.println("The High Lord of the land informs you that Orgers, Noms, and Gorilla homospain class of creatures are en route.");
                System.out.println("What is your next move?");
                System.out.println("1. Offer your services, telling them you will be on the front with your dragon");
                System.out.println("2. Offer your services, telling them you will be on the backend with your dragon");
                System.out.println("3. Offer your services, telling them you will be on the side and allow your dragon to battle without you");
                System.out.println("4. Decline to offer services and explain to them this was supposed to be a retirement party, not a suicide party, and remind them about the last samurai");
                int serviceChoice2 = scanner.nextInt();
                if (serviceChoice2 == 1 || serviceChoice2 == 2 || serviceChoice2 == 3) {
                    System.out.println("You are dead.");
                    System.out.println("Game over.");
                } else if (serviceChoice2 == 4) {
                    System.out.println("You decline to offer services and explain that this was supposed to be a retirement party, not a suicide party.");
                    System.out.println("You remind them about the last samurai.");
                    System.out.println("Congratulations! You survive and have a happy ending.");
                }
                break;
            case 4:
                System.out.println("The emperor is mad you are late.");
                System.out.println("Game over.");
                break;
        }
        scanner.close();
            // Create and return the player object with the provided values
        return new Player(name, hp, strength, wisdom, magic, experienceLevel);
    }
}
