package fr.dablo.jeumobile.model.monster.type;

import fr.dablo.jeumobile.model.monster.Monster;

public class Golem extends Monster {

    private final double ratioPhysicDamage = 0.75;
    private final double ratioMagicDamage = 0.12;

    private final double ratioPhysicResistance = 2.45;
    private final double ratioMagicResistance = 1.12;

    private final double ratioHp = 15.95;

    public Golem(){

        setName("Golem");

        setLvl(1 + (int)(Math.random() * ((7 - 1) + 1)));

        setXpDropped(getLvl() * 5);

        setTotalStats(getLvl()*10);

        setStrength((int) Math.round(0.4*getTotalStats()));
        setIntelligence((int) Math.round(0.5*getTotalStats()));
        setAgility((int) Math.round(0.05*getTotalStats()));
        setDexterity((int) Math.round(0.05*getTotalStats()));
        setAccuracy((int) Math.round(0.05*getTotalStats()));
        setStamina((int) Math.round(0.4*getTotalStats()));

        setPhysicDamage((int)(getStrength()* ratioPhysicDamage));
        setMagicDamage((int)(getIntelligence()*ratioMagicDamage));

        setPhysicResistance((int)(getStrength()* ratioPhysicResistance));
        setMagicResistance((int)(getIntelligence()* ratioMagicResistance));

        setHpMax(100+(int)(getStamina()*ratioHp));
        setCurrentHp(getHpMax());
    }

}
