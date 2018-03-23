package game;

public class Wizard extends Character {

    private int levelMagic;
    private int philter;

    public int getLevelMagic() {
        return levelMagic;
    } //Force du guerrier

    public int getPhilter() {
        return philter;
    } //Nom du bouclier

    public void setLevelMagic(int pLevelMagic) {
        levelMagic = pLevelMagic;
    } //Force du guerrier

    public void setPhilter(int pPhilter) {
        philter = pPhilter;
    } //Nom du bouclier

    public Wizard() {

        levelMagic = 0;
        philter = 0;

    }

    public Wizard(int pLevelMagic, int pPhilter) {

        levelMagic = pLevelMagic;
        philter = pPhilter;
    }

    public String toString() {

        return super.toString() + "\n Ta force: " + getLevelMagic() + "\n Ton bouclier: " + getPhilter();
    }

}