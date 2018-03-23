package game;

import java.util.Scanner;

public class ChoiceWarrior {

    public void SelectChoiceWarrior(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Tu as choisie le guerrier !");

        Warrior myWarrior = new Warrior();

        System.out.println("Entre ton nom: ");
        String name = sc.nextLine();
        myWarrior.setName(name);
        System.out.println("Ton nom est: " + name);

        System.out.println("Entrer l'url de l'image");
        String image = sc.nextLine();
        myWarrior.setImage(image);
        System.out.println("IMAGE de: " + image);

        System.out.println("Choisie le nombre de point de vie: ");
        int life = sc.nextInt();
        myWarrior.setLife(life);
        System.out.println("Ta vie est de: " + life);

        System.out.println("La force de ton guerrier? ");
        int strong = sc.nextInt();
        myWarrior.setStrong(strong);
        System.out.println("Wow ta force est de: " + strong);

        Scanner cs = new Scanner(System.in);
        System.out.println("Entre le nom de ton arme: ");
        String weapon = cs.nextLine();
        Weapon myWeapon = new Weapon();
        myWeapon.setNameWeapon(weapon);
        System.out.println("Ton arme est: " + weapon);

        System.out.println("La force de ton arme ? ");
        int weaponStrong = cs.nextInt();
        myWeapon.setStrongWeapon(weaponStrong);
        System.out.println("Qu'elle arme puissante ! " + weaponStrong);

        System.out.println("Combien veut tu de point de boulcier? ");
        int shield = cs.nextInt();
        myWarrior.setShield(shield);

        System.out.println(myWarrior.toString() + myWeapon.toString());
    }
}

