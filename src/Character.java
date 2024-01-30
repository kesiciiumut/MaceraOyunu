public abstract  class Character {
    private int damage;
    private String name;
    private int health;
    private int money;

    public Character(String name, int damage , int money, int health){
        this.damage=damage;
        this.name=name;
        this.money=money;
        this.health=health;
    }

    public Character() {

    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(){
        this.health=health;
    }

    public String setName(){
        this.name = name;
        return null;
    }
}
