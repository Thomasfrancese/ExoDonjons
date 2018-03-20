package character;

public class Weapon extends NewWarrior {

    private String weaponName;
    private int weaponStrong;

    public String getweaponName() {
        return weaponName;
    } //Nom de l'arme utilisé

    public int getweaponStrong() {
        return weaponStrong;
    } //Force de l'arme utilisé du guerrier

    public void setweaponName(String pweaponName) {
        weaponName = pweaponName;
    } //Nom de l'arme utilisé

    public void setweaponStrong(int pweaponStrong) {
        weaponStrong = pweaponStrong;
    } //Force de l'arme utilisé du guerrier

    public Weapon() {
        weaponName = "Inconnu";
        weaponStrong = 10;
    }

}
