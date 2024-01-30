public class Veapons {
    String name;

    public String getName() {
        return name;    }

    public void setName(String name) {
        this.name = name;
    }

    public Veapons(String name, int id, int damage, int price) {
        this.name = name;
        Id = id;
        Damage = damage;
        Price = price;
    }

    public static Veapons[] veapon(){
        Veapons[] silahlar = new Veapons[3];
        silahlar[0]= new Veapons("tabanca ",1,2,25);
        silahlar[1]=new Veapons("kılıç",2,3,35);
        silahlar[2]=new Veapons("tüfek",3,7,45);




        return silahlar;
    }



    public static Veapons getveaponobjbyid(int id){
        for(Veapons w:Veapons.veapon()){
            if(w.getId()==id){
                return w;
            }
        }
        return null;
    }



    int Id;
    int Damage;
    int Price;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        this.Damage = damage;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
       this.Price = price;
    }
}
