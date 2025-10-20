import java.util.*;
import java.io.*;


public class Restaurant {
    Scanner scan = new Scanner(System.in);
    int choice;

    public static void main(String[] args) {
        Restaurant Condogz = new Restaurant();
        Condogz.menu();
    }

    private void menu() {
        try {

            System.out.println("Welcome to Condogz, Press enter to order");
            scan.nextLine();

            System.out.println("             Menu            ");
            System.out.println("______________________________");
            System.out.println("1.Burgers          2.Chicken");
            System.out.println("3.Drinks           4.Desserts");
            System.out.println("5.Quit");

            System.out.println(" ");
            System.out.println("What would you like to view?");

        //          Menu options

        if (scan.hasNextInt()) {
            choice = scan.nextInt();
            scan.nextLine();
            if (choice >= 1 & choice <= 5) { // Double verification of valid input

                if (choice == 1) {
                    System.out.println("Example1");
                } else if (choice == 2) {
                    System.out.println("example2");
                } else if (choice == 3) {
                    chooseDrink();
                } else if (choice == 4) {
                    System.out.println("Example4");
                } else if (choice == 5) {
                    quit();
                } else {
                    System.out.println("Error: Please input a number between 1 and 5");
                    System.out.println("returning to menu in 3 seconds...");
                    Thread.sleep(3000);
                    menu();
                }
            }

            else {
                System.out.println("Error: Invalid Input, Please input a number");
                System.out.println("returning to menu in 3 seconds...");
                Thread.sleep(3000);
                menu();
            }
        }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /*                      DRINKS                     */

    private void chooseDrink() {
        try {
            int drinkChoice;
            System.out.println("            Drinks          ");
            System.out.println("_____________________________");
            System.out.println("1.Coke          2.Diet Coke\n3.Coke Zero\t\t4.Sprite\n5.Fanta\t\t\t6.Water\n7.Back");

            if (scan.hasNextInt()) {
                drinkChoice = scan.nextInt();
                // Checks if drinkChoice is within a valid range (1-7)
                if (drinkChoice >= 1 && drinkChoice <= 7) {
                    //                  Drink Choices
                    if (drinkChoice == 1) {System.out.println("Example1");}
                    else if (drinkChoice == 2) {System.out.println("Example2");}
                    else if (drinkChoice == 3) {System.out.println("Example3");}
                    else if (drinkChoice == 4) {System.out.println("Example4");}
                    else if (drinkChoice == 5) {System.out.println("Example5");}
                    else if (drinkChoice == 6) {System.out.println("Example6");}
                    else if (drinkChoice == 7) {menu();}
                    else System.out.println("Error: invalid input");

                } else {
                    System.out.println("Error: Please enter a number between 1 and 7.");
                    System.out.println("Returning to menu in 3 seconds...");
                    Thread.sleep(3000);
                    chooseDrink();
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a number!");
                scan.next(); // avoids infinite loop
                System.out.println("Returning to menu in 3 seconds...");
                Thread.sleep(3000);
                chooseDrink();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void quit() {
        String quitChoice;
        System.out.println("Are you sure? (Y/N)");
        quitChoice = scan.nextLine();
        quitChoice = quitChoice.toUpperCase();
        if (quitChoice.equals("Y") || quitChoice.equals("N")) {
            if (quitChoice.equals("Y")) System.out.println("Goodbye");
            else menu();

        } else {
            System.out.println("Invalid input, Please provide Y for yes, N for no.");
            quit();
        }
    }

}





