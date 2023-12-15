package AdventureTime;

public class Player {
    private String name;
    private int healthPoints;
    private int strength;
    private int wisdom;
    private int magic;
    private int experienceLevel;

    public Player(String name, int healthPoints, int strength, int wisdom, int magic, int experienceLevel) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.wisdom = wisdom;
        this.magic = magic;
        this.experienceLevel = experienceLevel;
    }

    // Getter and setter methods for player properties go here

    // Example getter method for name
    public String getName() {
        return name;
    }

    // Example setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Other getter and setter methods for player properties
}