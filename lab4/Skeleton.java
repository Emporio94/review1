package ioop.lab4;

public class Skeleton extends Monster{

    protected boolean encountered = false;
    public Skeleton(String name, Coordinates location, int maxHealth, World world, Damage attack, int speed) {
        super(name, location, maxHealth, world, attack, speed);
        this.awake = true;
    }

    // Task 2.3
    public void encounter(WorldEntity traveller)
    {
        if (encountered == false) {
            encountered = true;
            attack(traveller);
        } else {
            super.encounter(traveller);
        }
    }

    
}
