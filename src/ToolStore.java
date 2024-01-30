public class ToolStore extends Location{

    public ToolStore(Player player) {
        super(player);
    }

    @Override
    public boolean onLocation() {
        System.out.println("Mağazaya hoşgeldiniz!");
        boolean showMenu=true;
     while (showMenu){
         System.out.println("Silah satın almak -1");
         System.out.println("Zırh satın almak -2");
         System.out.println("Mağazadan çıkış -3");
         System.out.print("Seçiminiz :");
         int selection = input.nextInt();
         while(selection<1 || selection>3){

             System.out.println("geçersiz seçim yaptınız lütfen tekrar tuşlayın :");
             selection=input.nextInt();

         }
         switch (selection){
             case 1 :
                 printWeapon();

                 break;
             case 2 :
                 printArmor();
                 break;
             case 3 :
                 System.out.println("-----------------------");
                 System.out.println("Tekrar bekleriz:)");
                 System.out.println("-----------------------");
                 showMenu = false;
                 break;
         }




    }
     return true;
    }

    public  void printWeapon(){
        System.out.println("Silahlar");
        for(Veapons w: Veapons.veapon()){

            System.out.println(w.getName()+"<Hasar :    "+ w.getDamage() +"   Fiyat :    "+ w.getPrice() +"   Silah id :"+w.getId());
        }
        System.out.println("Çıkış - 0");

            System.out.print("Lütfen satın almak istediğiniz silahın id kodunu yazınız : ");
            int secilmis=input.nextInt();
            while (secilmis<0||secilmis>Veapons.veapon().length){
                System.out.println("hatalı tuşlama yaptınız lütfen tekrar tuşlayın :");
                secilmis=input.nextInt();
            }if (secilmis != 0 ){
            Veapons selectedVeapon=Veapons.getveaponobjbyid(secilmis);

            if (selectedVeapon.getPrice() > this.getPlayer().getMoney()){
                System.out.println("bu ürünü almak için paranız yeterli değildir!");
            }else {
                System.out.println("ürünü başarılı bir şekilde satın aldınız ");
                System.out.print("Aldığınız silah : " + selectedVeapon.getName());

                int balance =this.getPlayer().getMoney()-selectedVeapon.getPrice();
                this.getPlayer().getInventory().setVeapons(selectedVeapon);

                this.getPlayer().getInventory().getVeapons().getName();
                System.out.println("silahınız:   "+ this.getPlayer().getInventory().getVeapons().getName());

                this.getPlayer().setMoney(balance);
                System.out.println("kalan paranız : "+ this.getPlayer().getMoney());
            }
        }


     }

    public void printArmor(){

        System.out.println("Zırhlar");
        System.out.println("------------------------------------------------");
        for (Armors a : Armors.armors()){
            System.out.println("Zırh ismi : "+ a.getArmorName() + "Zırh id : " + a.getId()+ "Zırhın engelleme gücü : "+ a.getBlock()+" Zırhın fiyatı :  " + a.getPrice());
            System.out.println("------------------------------------------------");
        }
        System.out.println("Çıkış - 0");
        int selectidno ;
        System.out.print("Lütfen almak istediğiniz zırhın id sini yazınız :   ");
        selectidno = input.nextInt();
        while (selectidno < 0 || selectidno>3){
            System.out.println("Geçersiz tuşlama yaptınız lütfen geçerli bir değer giriniz :");
            selectidno = input.nextInt();
        }
        if (selectidno!=0){
            Armors secilmiszirh = Armors.getarmorbjbyid(selectidno);
            if (getPlayer().getMoney()< secilmiszirh.getPrice()){
                System.out.println("bu ürünü almak için paranız yetersizdir !!!");


            }else {
                System.out.println("Ürünü başarılı bir şekilde satın aldınız :)");
                System.out.println("Satın aldığınız silah " + secilmiszirh.getArmorName());
                int balance = getPlayer().getMoney()-secilmiszirh.getPrice();
                getPlayer().setMoney(balance);
                getPlayer().getInventory().setArmors(secilmiszirh);
                System.out.println("Kalan bakiyeniz : "+ getPlayer().getMoney());
            }
        }



    }
}