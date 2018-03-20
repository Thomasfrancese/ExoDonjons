package character;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Vos données, variables, différents traitements…

        char reponse = 'O';

        while (reponse == 'O') {

            Scanner sc = new Scanner(System.in);
            System.out.println("Select 'warrior', 'wizard' or 'show' your character");
            String choice = sc.nextLine();


            if (choice.equals("warrior")) {
                NewWarrior MyWarrior = new NewWarrior();
                MyWarrior.Create();
//
            } else if (choice.equals("wizard")) {
                System.out.println("Your choice is: " + choice);
                NewWizard MyWizard = new NewWizard();
                MyWizard.Create();

            } else if (choice.equals("show")) {
                NewWarrior showCharacter = new NewWarrior();
                showCharacter.showWarrior();

            } else {
                reponse = ' ';
                while (reponse != 'O' && reponse != 'N') {
                    System.out.println("Error select your character !");
                    System.out.println("Voulez vous reessayer? (O/N)");
                    reponse = sc.nextLine().charAt(0);
                }
            }

        }

        System.out.println("Au revoir…");


    }//Fin de la méthode main

}//Fin de votre classe