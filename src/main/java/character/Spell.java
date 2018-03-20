package character;

public class Spell extends NewWizard {

    private String spellName;
    private int spellLevel;

    public String getSpellName(){
        return spellName;
    } //Nom de l'arme utilisé
    public int getSpellLevel(){
        return spellLevel;
    } //Force de l'arme utilisé du guerrier

    public void setSpellName(String pSpellName){
        spellName = pSpellName;
    } //Nom de l'arme utilisé
    public void setSpellLevel(int pSpellLevel){
        spellLevel = pSpellLevel;
    } //Force de l'arme utilisé du guerrier

    public Spell(){
        spellName = "Inconnu";
        spellLevel = 200;
    }

}
