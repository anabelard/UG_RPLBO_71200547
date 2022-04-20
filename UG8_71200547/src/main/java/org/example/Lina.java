package org.example;

public class Lina extends MagicCharacter {
    public Lina(){
        super("Lina", 70, 800, 120);
    }

    public boolean skill(Character character){
        if(!this.isDie()){
            character.attacked(600);
            this.mana-=60;
            return true;
        }
        else{
            return false;
        }
    }

    public void attack(Character character){
        if(!this.isDie()){
            character.health-=this.damage;
            if(character.isDie()){
                this.mana+=45;
                character.health=0;
            }
        }
    }
}
