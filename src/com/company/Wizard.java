public class Wizard extends Character{
    Wizard(String name){
        super(name);
    }

    //Attacking Skills
    public void fireStorm(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage 40)");
        int damagePoints = 40;
        int manaCost = 35;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };

    public void timeBombAttack(Character enemyCharacter){
        System.out.println(super.characterName + " attacks" + enemyCharacter.characterName + " with Time Bomb Attack (Damage 40)");
        int damagePoints = 40;
        int manaCost = 35;
        damageTarget(enemyCharacter, damagePoints, manaCost);

    };


    //Health and Mana Regeneration
    public void healthRejuvenation (){
        System.out.println(super.characterName + " generated 20% Health Points and Mana");
        addHealth_Mana();
    };
}