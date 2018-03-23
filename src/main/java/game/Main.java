package game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char reponse = 'O';

        while (reponse == 'O') {

            Scanner sc = new Scanner(System.in);
            System.out.println("Select '1' warrior, '2' wizard");
            String choice = sc.nextLine();

            if (choice.equals("1")) {

                System.out.println("Tu as choisie le guerrier !");

                Warrior myWarrior = new Warrior();

                System.out.println("Entre ton nom");
                String name = sc.nextLine();
                myWarrior.setName(name);
                System.out.println("Ton nom est: " + name);

                System.out.println("Entrer l'url de l'image");
                String image = sc.nextLine();
                myWarrior.setImage(image);
                System.out.println("IMAGE de " + image);

                System.out.println("Choisie le nombre de point de vie");
                int life = sc.nextInt();
                myWarrior.setLife(life);
                System.out.println("Ta vie est de: " + life);

                System.out.println("La force de ton guerrier? ");
                int strong = sc.nextInt();
                myWarrior.setStrong(strong);
                System.out.println("Wow ta force est de: " + strong);

                Scanner cs = new Scanner(System.in);
                System.out.println("Entre le nom de ton arme");
                String weapon = cs.nextLine();
                Weapon myWeapon = new Weapon();
                myWeapon.setNameWeapon(weapon);
                System.out.println("Ton arme est: " + weapon);

                System.out.println("La force de ton arme ? ");
                int weaponStrong = cs.nextInt();
                myWeapon.setStrongWeapon(weaponStrong);
                System.out.println("Qu'elle arme puissante ! " + weaponStrong);

                System.out.println("Combien veut tu de point de boulcier?");
                int shield = cs.nextInt();
                myWarrior.setShield(shield);

                System.out.println(myWarrior.toString() + myWeapon.toString());

            } else if (choice.equals("2")) {

                Wizard myWizard = new Wizard();
                System.out.println("Tu as choisie le magicien !");

                System.out.println("Entre ton nom");
                String name = sc.nextLine();
                myWizard.setName(name);
                System.out.println("Ton nom est: " + name);

                System.out.println("Entrer l'url de l'image");
                String image = sc.nextLine();
                myWizard.setImage(image);
                System.out.println("IMAGE de " + image);

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

            } else {
                reponse = ' ';
                while (reponse != 'O' && reponse != 'N') {
                    System.out.println("Error select your character !");
                    System.out.println("Voulez vous reessayer? (O/N)");
                    reponse = sc.nextLine().charAt(0);
                }
            }

            System.out.println("\n Au revoir…");
        }
    }
}