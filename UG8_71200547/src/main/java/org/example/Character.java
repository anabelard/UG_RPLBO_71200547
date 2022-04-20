package org.example;

abstract class Character {
    protected int damage;
    protected String name;
    protected int health;

    public Character(String name, int damage, int health){
        this.name=name;
        this.damage=damage;
        this.health=health;
    }

    public void showCharacterInfo(){
        System.out.println("Hero   : "+this.name);
        System.out.println("Health : "+this.health);
        System.out.println("Damage : "+this.damage);
    }

    public boolean isDie(){
        return this.health <= 0;
    }

    public abstract void attacked(int damage);
}
