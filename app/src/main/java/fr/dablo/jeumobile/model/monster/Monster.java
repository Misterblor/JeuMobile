package fr.dablo.jeumobile.model.monster;

public class Monster {

    private String name;

    private int hpMax;
    private int currentHp;

    private int manaMax;
    private int currentMana;

    private int lvl;

    private int xpDropped;

    private int strength;
    private int intelligence;
    private int agility;
    private int dexterity;
    private int accuracy;
    private int stamina;

    private int totalStats;

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

    public int getHpInPercent(){
        return (int) (((double)currentHp/hpMax)*100);
    }

    public int getTotalStats() {
        return totalStats;
    }

    public void setTotalStats(int totalStats) {
        this.totalStats = totalStats;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
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
