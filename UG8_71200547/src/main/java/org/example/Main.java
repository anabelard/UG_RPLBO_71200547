package org.example;

public class Main {
    public static void main( String[] args )
    {
        Lina lina = new Lina();
        DragonKnight dragonKnight = new DragonKnight();
        LegionCommander legionCommander = new LegionCommander();

        lina.skill(dragonKnight);
        dragonKnight.skill();
        dragonKnight.attack(lina);
        dragonKnight.attack(lina);
        legionCommander.skill(lina);

        lina.showCharacterInfo();
        System.out.println("");
        lina.skill(legionCommander);

        dragonKnight.showCharacterInfo();
        System.out.println("");

        legionCommander.showCharacterInfo();
    }

}
