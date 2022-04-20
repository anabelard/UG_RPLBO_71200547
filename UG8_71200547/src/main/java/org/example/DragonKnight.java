package org.example;

public class DragonKnight extends PhysicalCharacter implements NoTargetSkill {
    private int dragonFormAttack;

    public DragonKnight(){
        super("Dragon Knight", 95, 1800, 50);
    }

    public void skill(){
        if(!this.isDie()){
            this.dragonFormAttack=2;
        }
    }

    public void attack(Character character){
        if(!this.isDie()){
            if(this.dragonFormAttack>0){
                character.health-=(this.damage+90);
                this.dragonFormAttack=this.dragonFormAttack-1;
            }
            else{
                character.health-=this.damage;
            }
            if(character.isDie()){
                character.health=0;
            }
        }
    }
}
