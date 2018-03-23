package game;

import java.util.Scanner;

public class ChoiceWizard {

    public void SelectChoiceWizard(){

        Wizard myWizard = new Wizard();

        Scanner sc = new Scanner(System.in);

        System.out.println("Tu as choisie le magicien !");

        System.out.println("Entre ton nom: ");
        String name = sc.nextLine();
        myWizard.setName(name);
        System.out.println("Ton nom est: " + name);

        System.out.println("Entrer l'url de l'image: ");
        String image = sc.nextLine();
        myWizard.setImage(image);
        System.out.println("IMAGE de : " + image);

        Scanner cs = new Scanner(System.in);
        System.out.println("Choisie le nombre de point de vie: ");
        int life = cs.nextInt();
        myWizard.setLife(life);
        System.out.println("Ta vie est de: " + life);

        System.out.println("Le niveau de ta magie est de ? ");
        int levelMagic = cs.nextInt();
        myWizard.setLevelMagic(levelMagic);
        System.out.println("Yeah !" + levelMagic);

        System.out.println("Entre le nom de ton sort ? ");
        String spellName = sc.nextLine();
        Spell mySpell = new Spell();
        mySpell.setNameSpell(spellName);
        System.out.println("Ton sort" + spellName);

        System.out.println("La puissance de ton sort ? ");
        int spellLevel = sc.nextInt();
        mySpell.setLevelSpell(spellLevel);
        System.out.println("La puissance de ton sort" + spellLevel);

        System.out.println("La puissance de la potion? ");
        int philter = sc.nextInt();
        myWizard.setPhilter(philter);
        System.out.println(philter);

        System.out.println(myWizard.toString() + mySpell.toString());
    }

}
