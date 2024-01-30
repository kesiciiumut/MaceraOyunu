public class Inventory {
      private Veapons  veapons;
      private Armors armors;
    public Inventory(){
        this.veapons=new Veapons("Yumruk",-1,0,0);
        this.armors=new Armors("Zırh yok",-1,0,0);

    }

    public Armors getArmors() {
        return armors;
    }

    public void setArmors(Armors armors) {
        this.armors = armors;
    }

    public Veapons getVeapons() {
        return veapons;
    }

    public void setVeapons(Veapons veapons) {
        this.veapons = veapons;
    }}


