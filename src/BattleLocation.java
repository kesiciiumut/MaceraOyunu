import java.util.Random;

public  abstract class BattleLocation extends Location {

    private Obstacle obstacle;
    private String name;
    private String prize;
    private int maxObstacle;

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    @Override

    public boolean onLocation() {
        int obstacleNumber=randomObstacleNumber();
        System.out.println("Bulunduğunuz bölge : "+ this.getName());
        System.out.println("Dikkatli olun burada "+obstacleNumber+" "+obstacle.getName()+" yaşıyor");
        System.out.println("Savaş -> 1");
        System.out.println("Kaç -> 2");
        int selectcase= input.nextInt();
        switch (selectcase){
            case 1 :
                System.out.println("Savaş");
                if (combat(obstacleNumber)){
                    System.out.println("Sağ bir şekilde çıktınız  !!");

                    return true;
                }
                if (this.getPlayer().getHealth()<0){

                    return false;
                }
                break;
            case 2 :
                System.out.println("Başarılı bir şekilde kaçtınız");

                break;



        }
        return true;
    }
    public boolean combat(int obsnumber){
        for(int i =1;i<=obsnumber;i++){
            getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            playerstats();
            obstacleStats(i);
            while (this.getPlayer().getHealth()>0 && this.getObstacle().getHealth()>0){
                System.out.println("Vurmak -> 1 ");
                int selectCombat =input.nextInt();

                switch (selectCombat){
                    case 1 :
                        this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getTotalDamage());
                        System.out.println( this.getObstacle().getName()+" Canı : "+this.getObstacle().getHealth());
                        if(this.getObstacle().getHealth()> 0){
                            System.out.println( this.getObstacle().getName()+" Size vurdu !");
                            int obstacleDamage = this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmors().getBlock();
                            if (obstacleDamage<0){
                                obstacleDamage=0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth()-obstacleDamage);
                            System.out.println("Canınız : "+ this.getPlayer().getHealth());


                            break;

                        }



                }



            }

        }


        return false;
    }

    public void playerstats(){
        System.out.println("--------------------------------");
        System.out.println("Oyuncunun değerleri :");
        System.out.println("Sağlık  : " + this.getPlayer().getHealth());
        System.out.println("Hasar : "+this.getPlayer().getTotalDamage());
        System.out.println("Para : "+this.getPlayer().getMoney());
        System.out.println("Silah : "+this.getPlayer().getInventory().getVeapons().getName());
        System.out.println("Zırh : "+this.getPlayer().getInventory().getArmors().getArmorName());
        System.out.println("Bloklama : "+this.getPlayer().getInventory().getArmors().getBlock());




    }
    public void obstacleStats(int i){
        System.out.println("--------------------------------");
        System.out.println(i+". "+"Canavarın değerleri :");
        System.out.println("Sağlık : "+this.getObstacle().getHealth());
        System.out.println("Hasar : "+ this.getObstacle().getDamage());
        System.out.println("Ödül : "+ this.getObstacle().getPrize());


    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public int randomObstacleNumber(){
        Random random= new Random();
        return random.nextInt(this.getMaxObstacle())+1;
    }

    public BattleLocation(Player player,String name, Obstacle obstacle, String prize,int maxObstacle) {
        super(player,name);
    this.prize =prize;
    this.obstacle=obstacle;
    this.maxObstacle=maxObstacle;
    }



}
