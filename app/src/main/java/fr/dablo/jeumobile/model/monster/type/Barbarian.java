package fr.dablo.jeumobile.model.monster.type;

import fr.dablo.jeumobile.model.monster.Monster;

public class Barbarian extends Monster {

    public Barbarian(){

        setName("Barbarian");

        setLvl(1 + (int)(Math.random() * ((7 - 1) + 1)));

        setXpDropped(getLvl()*(1 + (int)(Math.random() * ((3 - 1) + 1))));

        setPhysicDamage(getLvl()*(2 + (int)(Math.random() * ((6 - 2) + 1))));
        setMagicDamage(0);
        setPhysicResistance(getLvl()*(3 + (int)(Math.random() * ((10 - 3) + 1))));
        setMagicResistance(getLvl()*(1 + (int)(Math.random() * ((4 - 1) + 1))));

        setHpMax(100 + (int)(Math.random() * ((250 - 100) + 1)));
        setCurrentHp(getHpMax());
    }

}
