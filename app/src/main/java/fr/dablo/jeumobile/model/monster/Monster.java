package fr.dablo.jeumobile.model.monster;

public class Monster {

    private String name;

    private int hpMax;
    private int currentHp;

    private int manaMax;
    private int currentMana;

    private int lvl;

    private int xpDropped;

    private int physicDamage;
    private int magicDamage;
    private int physicResistance;
    private int magicResistance;

    public Monster(){

    }

    public void takeDamage(int damage){
        currentHp -= damage;
        if (currentHp < 0){
            currentHp = 0;
        }
    }

    public int getPhysicDamage() {
        return physicDamage;
    }

    public void setPhysicDamage(int physicDamage) {
        this.physicDamage = physicDamage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public int getPhysicResistance() {
        return physicResistance;
    }

    public void setPhysicResistance(int physicResistance) {
        this.physicResistance = physicResistance;
    }

    public int getMagicResistance() {
        return magicResistance;
    }

    public void setMagicResistance(int magicResistance) {
        this.magicResistance = magicResistance;
    }

    public int getXpDropped() {
        return xpDropped;
    }

    public void setXpDropped(int xpDropped) {
        this.xpDropped = xpDropped;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getManaMax() {
        return manaMax;
    }

    public void setManaMax(int manaMax) {
        this.manaMax = manaMax;
    }

    public int getCurrentMana() {
        return currentMana;
    }

    public void setCurrentMana(int currentMana) {
        this.currentMana = currentMana;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
