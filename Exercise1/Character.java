public class Character {

    // Attributes
    
    int strength, agility, intelligence;
    String name;

    // Constructor

    public Character (int str, int agi, int intel, String CharName) {
        strength = str;
        agility = agi;
        intelligence = intel;
        name = CharName;
    }
    
    // Methods

    public void sayMyName() {
        System.out.println("\nMy Name is " +name);
    }

    public void sayMyStrength() {
        System.out.println("My Strength is " +strength);
    }

    public void sayMyAgility() {
        System.out.println("My Agility is " +agility);
    }

    public void sayMyIntelligence() {
        System.out.println("My Intelligence is " +intelligence);
    }
    
}
