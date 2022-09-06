public class Enemy {

    // Enemy Attributes 
    int damage, health, armor;
    boolean hasMagicImmunity;
    String name;

    // Enemy Methods 

    public void enemyDialogue() {
        System.out.print("\n");
        System.out.println("Fear me player for my name is " +name+ " and I deal " +damage+ " damage!");
        System.out.println("I have a health of " +health+ " and my defense of " +armor+ " makes me hard to kill!");
    }
    
}
