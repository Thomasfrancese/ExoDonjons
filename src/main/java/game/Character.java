package game;

public class Character {

    protected String name;
    protected String image;
    protected int life;


    public String getName() {
        return name;
    } //Nom du guerrier

    public String getImage() {
        return image;
    } //Image du guerrier

    public int getLife() {
        return life;
    }//Vie du guerrrier

    public void setName(String pName) {
        name = pName;
    } //Nom du guerrier

    public void setImage(String pImage) {
        image = pImage;
    } //Image du guerrier

    public void setLife(int pLife) {
        life = pLife;
    }//Vie du guerrrier

    public Character() {

        System.out.println("Création d'un personnage");
        name = "";
        image = "";
        life = 0;

    }

    public Character(String pName, String pImage, int pLife){
        System.out.println("Création d'un personnage avec paralmètre");
        name = pName;
        image = pImage;
        life = pLife;

    }

    public String toString(){

        return "\n Ton nom: " + getName() + "\n Ton image: " + getImage() + "\n Ta vie: " + getLife();
    }

}
