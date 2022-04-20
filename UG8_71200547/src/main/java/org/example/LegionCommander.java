package org.example;

public class LegionCommander extends PhysicalCharacter implements TargetSkill {
    private int kill;

    public LegionCommander(){
        super("Legion Commander", 120, 1200, 30);
    }

    public void attack(Character character){
        if(!this.isDie()){
            character.health-=this.damage;
            if(character.isDie()){
                this.kill+=1;
                this.damage+=10;
            }
            if(character.isDie()){
                character.health=0;
            }
        }
    }

    public boolean skill(Character character){
        if(!this.isDie()){
            while (!character.isDie() && !this.isDie()){
                this.attack(character);
                this.attacked(character.damage);
            }
            return true;
        }
        else {
            return false;
        }
    }
}
