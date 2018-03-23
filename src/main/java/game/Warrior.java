package game;

public class Warrior extends Character {

    private int strong;
    private int shield;


    public int getStrong() {
        return strong;
    } //Force du guerrier

    public int getShield() {
        return shield;
    } //Force du bouclier

    public void setStrong(int pStrong) {
        this.strong = pStrong;
    } //Force du guerrier

    public void setShield(int pShield) {
        this.shield = pShield;
    } //Force du bouclier

    public Warrior() {

        strong = 0;
        shield = 0;

    }

    public Warrior(int pStrong, int pShiel) {

        this.strong = pStrong;
        this.shield = pShiel;
    }

    public String toString(){

        return super.toString() + "\n Ta force: " + strong + "\n Ton bouclier: " + shield;
    }
}