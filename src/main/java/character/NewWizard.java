package character;

import java.util.Scanner;

public class NewWizard {

    private String name;
    private String image;
    private int life;
    private int levelMagic;
    private int philter;

    public String getName() {
        return name;
    } //Nom du guerrier

    public String getImage() {
        return image;
    } //Image du guerrier

    public int getLife() {
        return life;
    }//Vie du guerrrier

    public int getLevelMagic() {
        return levelMagic;
    } //Force du guerrier

    public int getPhilter() {
        return philter;
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

    public void setLevelMagic(int pLevelMagic) {
        levelMagic = pLevelMagic;
    } //Force du guerrier

    public void setPhilter(int pPhilter) {
        philter = pPhilter;
    } //Nom du bouclier

    public void Create() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Create a Wizard !");
        NewWizard MyWizard = new NewWizard();

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
        MyWizard.setName(name);

        System.out.println("Enter your URL image");
        String image = sc.nextLine();
        System.out.println("IMAGE of " + image);
        MyWizard.setImage(image);

        Scanner cs = new Scanner(System.in);
        System.out.println("You are a wizard ! Your life is: ");
        int life = cs.nextInt();
        System.out.println("Your life is: " + life);
        MyWizard.setLife(life);

        System.out.println("The level magic is estimated has .. ? ");
        int levelMagic = cs.nextInt();
        System.out.println("Yeah !");
        MyWizard.setLevelMagic(levelMagic);


        System.out.println("Enter your name spell");
        String weapon = sc.nextLine();
        System.out.println("Your weapon is: " + weapon);
        Spell MySpell = new Spell();
        MySpell.setSpellName(weapon);



        System.out.println("The strong weapon's and the.. ");
        int weaponStrong = sc.nextInt();
        System.out.println(" the power of your magic: " + weaponStrong);
        MySpell.setSpellLevel(weaponStrong);


        System.out.println("The philter ! ");
        int philter = sc.nextInt();
        System.out.println();
        MyWizard.setPhilter(philter);

        System.out.println("Name wizard : " + MyWizard.getName() + " | Image : " + MyWizard.getImage() + " | Life : " + MyWizard.getLife() + " | Level magic : " + MyWizard.getLevelMagic() +
                " | Name spell : " + MySpell.getSpellName() + " | Level spell : " + MySpell.getSpellLevel() + " | Philter : " + MyWizard.getPhilter());

    }


}