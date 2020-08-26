package fr.dablo.jeumobile.model.monster.type;

import fr.dablo.jeumobile.model.monster.Monster;

public class Golem extends Monster {

    public Golem(){

        setName("Golem");

        setLvl(1 + (int)(Math.random() * ((7 - 1) + 1)));

        setXpDropped(getLvl()*(1 + (int)(Math.random() * ((3 - 1) + 1))));

        setPhysicDamage(getLvl()*(2 + (int)(Math.random() * ((6 - 2) + 1))));
        setMagicDamage(0);
        setPhysicResistance(getLvl()*(3 + (int)(Math.random() * ((10 - 3) + 1))));
        setMagicResistance(getLvl()*(1 + (int)(Math.random() * ((4 - 1) + 1))));
    }

}
