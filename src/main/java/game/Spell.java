package game;

public class Spell {

    String nameSpell;
    int levelSpell;

    public String getNameSpell() {
        return nameSpell;
    }

    public int getLevelSpell() {
        return levelSpell;
    }

    public void setNameSpell(String pNameSpell) {

        this.nameSpell = pNameSpell;
    }

    public void setLevelSpell(int pStrongSpell) {

        this.levelSpell = pStrongSpell;
    }

    public Spell() {

        nameSpell = "";
        levelSpell = 0;

    }

    public Spell(String pNameSpell, int pLevelSpell) {

        this.nameSpell = pNameSpell;
        this.levelSpell = pLevelSpell;

    }

    public String toString() {

        return "\n Le nom de ton sort: " + getNameSpell() + "\n La puissance de ton sort: " + getLevelSpell();
    }
}