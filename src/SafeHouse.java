public class SafeHouse extends Location {




    public SafeHouse(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evinize döndünüz ");
        System.out.println("Canınız artık : " +getPlayer().getHealth());
        getPlayer().setHealth(18);
        return true;
    }
}
