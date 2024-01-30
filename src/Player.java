import java.util.Scanner;
public class Player {
    private int damage;
    private int money;
    private int originalHealth;
    private int health;
    private String name;
    private String charName;
    private Inventory inventory;

    private Archer archer;
    private Scanner input = new Scanner(System.in);


    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    public void selectCharacter(){
        Samurai samurai= new Samurai();
        Archer archer=new Archer();
        Knight knight=new Knight();

        System.out.println("Lütfen kullanmak istediğiniz karakteri seçiniz :" );
        System.out.println("-----------------------------------------------");
        System.out.println("okçu : hasar : 7 \t sağlık : 18 \t para: 20");
        System.out.println("şovalye : hasar :8  \t sağlık : 24 \t para: 5");
        System.out.println("samuray : hasar : 5 \t sağlık : 21 \t para: 15");
        System.out.println("-----------------------------------------------");
        System.out.println("Okçuyu seçmek için : 1 e basın ");
        System.out.println("Samurayı seçmek için : 2 e basın ");
        System.out.println("Şovalyeyi seçmek için : 3 e basın ");
        int selectChar = input.nextInt();
        switch (selectChar){
            case 1 :initPlayer(new Archer());
            break;
            case 2 : initPlayer(new Samurai());
            break;
            case 3 :initPlayer(new Knight());
            break;
            default:
                System.out.println("Yanlış tuşlama yaptınız !!!");
                return ;
        }



    }

    public int getOriginalHealth() {
        return originalHealth=health;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public void initPlayer(Character character){
        this.setDamage(character.getDamage());
        this.setHealth(character.getHealth());
        this.setOriginalHealth(character.getHealth());
        this.setMoney(character.getMoney());
        this.setCharName(character.setName());

    }
    public void playerInfo(){
        System.out.println("Oyuncu özellikleri :");
        System.out.println("Hasar - "+ this.getTotalDamage() + "  Sağlık - "+this.getHealth()+"  Para - "+this.getMoney() + "  Silah - "+getInventory().getVeapons().getName()+"  Bloklama - "+getInventory().getArmors().getBlock());





    }
    public Player() {
        this.name = name;
        this.inventory=new Inventory();
    }
    public int getTotalDamage(){
        return damage + this.getInventory().getVeapons().getDamage();
    }
        public int getDamage() {
        return damage ;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getMoney(){
        return money ;
    }
    public void setMoney(int money){
        this.money=money ;
    }
    public void setHealth(int health){
        this.health=health;
    }
    public int getHealth(){
        return health;
    }

    public String getName(){
        return name;
    }
    public void setName(String name ){
        this.name=name;
    }
    public String getCharName(){
        return charName;
    }
    public void setCharName(String charName){
        this.charName=charName;
    }
}
