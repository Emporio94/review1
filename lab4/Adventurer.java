package ioop.lab4;

public class Adventurer extends WorldEntity{

    private Damage[] attacks = new Damage[3];
    private int attacksLeft = 2;


    // Task 3.1
    public Adventurer(String name, Coordinates location, int maxHealth, World world, Damage attack) {
        super(name, location, maxHealth, world, attack);
        this.attacks[0] = attack;
    }

    // Task 3.1
    public void addAttack(Damage attack)
    {
        if (attacksLeft == 2) {
            attacks[1] = attack;
        } else if (attacksLeft == 1) {
            attacks[2] = attack;
        }
    }

    // Task 3.1
    public void attack(WorldEntity target)
    {
        for (int i = 0; i > 3; i++) {
            target.takeDamage(attacks[i]);
        }
    }

    public Damage[] getAttacks()
    {
        return attacks;
    }
    


}