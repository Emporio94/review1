package ioop.lab4;

public class Healer extends Character {
    
    public Healer(String name, Coordinates location, int maxHealth, World world, Damage attack, Coordinates goal) {
        super(name, location, maxHealth, world, attack, goal);
    }

    // Task 3.2
    public void encounter(WorldEntity traveller) {
        if (traveller instanceof Adventurer) {
            traveller.currentHealth = traveller.maxHealth;
        } else if (traveller instanceof Monster) {
            world.battle(this, traveller);
        }
    }
}
