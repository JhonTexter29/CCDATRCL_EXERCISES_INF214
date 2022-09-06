public class Weapon {

    //Attributes
    int Damage, Weight;
    String Name, Rarity, Description;

    // Constructor
    public Weapon(String WeapName, int dmg, int wght, String rart, String Descrpt) {
        Name = WeapName;
        Damage = dmg;
        Weight = wght;
        Rarity = rart;
        Description = Descrpt;
    }

    //Method 
    public void weaponDescription() {
        System.out.print("\n");
        System.out.println("Weapon Name: " +Name);
        System.out.println("Attack: " +Damage);
        System.out.println("Weight: " +Weight);
        System.out.println("Rarity: " +Rarity);
        System.out.println("Description: " +Description);
    }
}
