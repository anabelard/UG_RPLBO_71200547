package org.example;

abstract class MagicCharacter extends Character {
    protected int mana;

    public MagicCharacter(String name, int damage, int health, int mana){
        super(name, damage, health);
        this.mana=mana;
    }

    public void showCharacterInfo(){
        super.showCharacterInfo();
        System.out.println("Mana   : "+this.mana);
    }

    public void attacked(int damage){
        super.health=super.health-damage;
        if(super.health<0){
            super.health=0;
        }
    }


}
