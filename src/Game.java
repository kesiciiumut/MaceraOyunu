import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    public void start () {
        System.out.println("Macera oyununa hoşgeldiniz :)");
        Player player = new Player();
        String playerName;
        System.out.print("lütfen karakterinizin ismini yazınız :");
        playerName = input.nextLine();
        System.out.println(playerName + " Adaya hoşgeldiniz!!");
        player.setName(playerName);
        player.selectCharacter();
        Location location = null;
        while (true) {
            player.playerInfo();
            System.out.println(" 0 - Çıkış  -> Oyunu bitirmek !");
            System.out.println(" 1 - Güvenli ev -> Burası sizin eviniz canınızı yenileyebilirsiniz !");
            System.out.println(" 2 - Eşya dükkanı  -> Mağazadan silah ve zırh satın alabilirsiniz !");
            System.out.println(" 3 - Mağara  -> Mağaraya gidip yemek toplayabilirsiniz ama karşınıza vampir çıkabilir!!");
            System.out.println(" 4 - Orman  -> Ormana gidip odun toplayabilirsiniz ama karşınıza zombi çıkabilir");
            System.out.println(" 5 - Nehir  -> Nehire gidip su toplayabilirsiniz ama karşınıza ayı çıkabilir");
            System.out.println("Lütfen gitmek istediğiniz lokasyonu seçiniz : ");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 0 :
                    location=null;
                    break;
                case 1:
                    location = new SafeHouse(player,"u");
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location=new Cave(player);
                break;
                case 4:
                    location=new Forest(player);
                    break;
                case 5:
                    location=new River(player);
                    break;

                    default:
                        System.out.print("Lütfen geçerli bir değer giriniz : ");
            }
            while (selectLoc>5){
                System.out.println("Geçersiz bir değer girdiniz lütfen tekrar deneyiniz: ");
                selectLoc= input.nextInt();
            }
            if(location==null){
                System.out.println("Hayatta kalma mücadelen artık bitti !!");
                break;
            }
            if (!location.onLocation()){
                System.out.println("GAME OVER!!");
                break;
            }
        }
    }
}
