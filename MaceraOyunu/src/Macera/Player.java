package Macera;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName; // karakterin kısaltılmış hali

    public Player(String name){
        this.name=name;
    }

    public void selectChar(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Karakter: Samuray \t Hasar: 5 \t Saglik: 21 \t Para: 15");
    }

    public int getDamage(){
        return this.damage;
    }
    public void setDamage(int damage){
        this.damage=damage;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
