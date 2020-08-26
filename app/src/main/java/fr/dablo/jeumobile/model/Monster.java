package fr.dablo.jeumobile.model;

public class Monster {

    private String name;

    private int hpMax;
    private int currentHp;

    private int manaMax;
    private int currentMana;

    private int lvl;
    private int currentXp;
    private int xpNeededToNextLvl;

    public Monster(){

    }

    public void takeDamage(int damage){
        currentHp -= damage;
    }
}
