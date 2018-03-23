package game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char reponse = 'O';

        while (reponse == 'O') {

            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome !");
            System.out.println("Select '1' warrior, '2' wizard");
            String choice = sc.nextLine();

            if (choice.equals("1")) {

                ChoiceWarrior warrior = new ChoiceWarrior();
                warrior.SelectChoiceWarrior();

            } else if (choice.equals("2")) {

                ChoiceWizard wizard = new ChoiceWizard();
                wizard.SelectChoiceWizard();

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