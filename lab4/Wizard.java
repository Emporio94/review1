package ioop.lab4;

public class Wizard extends Character{

    public Wizard(String name, Coordinates location, int maxHealth, World world, Damage attack, Coordinates goal) {
        super(name, location, maxHealth, world, attack, goal);
    }

    // Task 3.2
    public void encounter(WorldEntity traveller) {
        if (traveller instanceof Adventurer) {
            ((Adventurer) traveller).addAttack(new Damage(10, DamageType.FIRE));
        } else if (traveller instanceof Monster) {
            world.battle(this, traveller);
        }
    }
}
