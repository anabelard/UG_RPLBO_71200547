package org.example;

abstract class PhysicalCharacter extends Character {
    private int armor;

    public PhysicalCharacter(String name, int damage, int health, int armor){
        super(name, damage, health);
        this.armor=armor;
    }

    public void showCharacterInfo(){
        super.showCharacterInfo();
        System.out.println("Armor  : "+this.armor);
    }

    public void attacked(int damage){
        this.health=this.health-(damage-this.armor);
        if(super.health<0){
            super.health=0;
        }
    }

}
