package fr.dablo.jeumobile.model.player.classes;

import fr.dablo.jeumobile.model.player.Player;

public class Wizard extends Player {

    private final double ratioAttackDamage = 0.4;
    private final double ratioMagicDamage = 1.75;

    private final double ratioHp = 11;
    private final double ratioMana = 65;

    public Wizard(){

        super();

        setStrength(10);
        setIntelligence(20);
        setAgility(5);
        setDexterity(5);
        setAccuracy(10);
        setStamina(10);

        setAttackDamage((int)(getStrength()*ratioAttackDamage));
        setMagicDamage((int)(getIntelligence()*ratioMagicDamage));

        setHpMax(100+(int)(getStamina()*ratioHp));
        setCurrentHp(getHpMax());

        setManaMax(120+(int)(getIntelligence()*ratioMana));
        setCurrentMana(getManaMax());
    }
}
