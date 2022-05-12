public class Warlock extends Character{
    Warlock(String name){
        super(name);
    }



    //Attacking Skills
    public void Poison (Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Poison (Damage 66)");
        int damagePoints = 40;
        int manaCost = 35;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };

    public void attackOverheating (Character enemyCharacter){
        System.out.println(super.characterName + "attacks " + enemyCharacter.characterName + " with Attack Overheating (Damage 66)");
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