package game;

public class Weapon{

    public String nameWeapon;
    public int strongWeapon;

    public String getNameWeapon(){
        return nameWeapon;
    }

    public int getStrongWeapon(){
        return strongWeapon;
    }

    public void setNameWeapon(String pNameWeapon){

        this.nameWeapon = pNameWeapon;
    }

    public void setStrongWeapon(int pStrongWeapon){

        this.strongWeapon = pStrongWeapon;
    }

    public Weapon(){

        nameWeapon = "";
        strongWeapon = 0;

    }

    public Weapon(String pNameWepaon, int pStrongWeapon){

        this.nameWeapon = pNameWepaon;
        this.strongWeapon = pStrongWeapon;

    }

    public String toString(){

        return "\n Le nom de ton arme: " + getNameWeapon() + "\n La force de ton arme: " + getStrongWeapon();
    }
}