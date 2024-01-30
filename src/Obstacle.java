public class Obstacle {
    private String name;
    private int id ;
    private int damage;
    private int health;
    private int prize;
    private int originalHealth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {

        this.health = health;

    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }


    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public Obstacle(String name , int id , int damage, int originalHealth, int health, int prize){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.originalHealth=health;
        this.prize=prize;
        this.id=id;


    }



}
