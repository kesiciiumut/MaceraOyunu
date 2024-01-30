public class Armors {

    int Id;
    int Block;
    int Price;
    String armorName;

    public String getArmorName(){
        return armorName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getBlock() {
        return Block;
    }

    public void setBlock(int block) {
        Block = block;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public Armors(String name , int id , int block , int price){
        this.armorName=name;
        Id=id;
        Block=block;
        Price=price;
    }
        public static Armors[] armors(){
        Armors[] zirhlar = new Armors[3];
        zirhlar[0]=new Armors("Hafif zırh",1,1,15);
        zirhlar[1]=new Armors("Orta zırh",2,3,25);
        zirhlar[2]=new Armors("Ağır zırh",3,5,40);




        return zirhlar;
        }
    public static Armors getarmorbjbyid(int id){
        for(Armors a:Armors.armors()){
            if(a.getId()==id){
                return a;
            }
        }
        return null;
    }







}
