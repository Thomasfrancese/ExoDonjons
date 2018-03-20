package character;

import java.util.Scanner;

public class NewWarrior {

    private String name;
    private String image;
    private int life;
    private int strong;
    private int shield;

    public String getName() {
        return name;
    } //Nom du guerrier

    public String getImage() {
        return image;
    } //Image du guerrier

    public int getLife() {
        return life;
    }//Vie du guerrrier

    public int getStrong() {
        return strong;
    } //Force du guerrier


    public int getShield() {
        return shield;
    } //Nom du bouclier

    public void setName(String pName) {
        name = pName;
    } //Nom du guerrier

    public void setImage(String pImage) {
        image = pImage;
    } //Image du guerrier

    public void setLife(int pLife) {
        life = pLife;
    }//Vie du guerrrier

    public void setStrong(int pStrong) {
        strong = pStrong;
    } //Force du guerrier


    public void setShield(int pShield) {
        shield = pShield;
    } //Nom du bouclier


    //    Constructeur par défaut
    public void Create() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Create a Warior !");
        NewWarrior MyWarrior = new NewWarrior();

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
        MyWarrior.setName(name);

        System.out.println("Enter your URL image");
        String image = sc.nextLine();
        System.out.println("IMAGE of " + image);
        MyWarrior.setImage(image);

        System.out.println("Choose your life !");
        int life = sc.nextInt();
        System.out.println("Your life: " + life);
        MyWarrior.setLife(life);

        System.out.println("The strong warrior's is estimated has? ");
        int strong = sc.nextInt();
        System.out.println("Wow your so strong ! " + strong);
        MyWarrior.setStrong(strong);

        Scanner cs = new Scanner(System.in);
        System.out.println("Enter your name weapon");
        String weapon = cs.nextLine();
        Weapon MyWeapon = new Weapon();
        System.out.println("Your weapon is: " + weapon);
        MyWeapon.setweaponName(weapon);

        System.out.println("The strong weapon's ? ");
        int weaponStrong = cs.nextInt();
        System.out.println("Amazin weapon ! power: " + weaponStrong);
        MyWeapon.setweaponStrong(weaponStrong);


        System.out.println("The shield ! how many? ");
        int shield = sc.nextInt();
        System.out.println("You cheat !");
        MyWarrior.setShield(shield);

    }

    public void showWarrior() {
        NewWarrior MyWarrior = new NewWarrior();
        Weapon MyWeapon = new Weapon();
        System.out.println("Name warrior : " + MyWarrior.getName() + " | Image : " + MyWarrior.getImage() + " | Life : " + MyWarrior.getLife() + " | Strong : " + MyWarrior.getStrong() +
                " | Name weapon : " + MyWeapon.getweaponName() + " | Strong weapon : " + MyWeapon.getweaponStrong() + " | Shield : " + MyWarrior.getShield());
    }

}