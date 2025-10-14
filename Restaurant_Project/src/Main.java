import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int choice;

        try {

            System.out.println("Welcome to Condogz, Press enter to order");
            scan.nextLine();

            System.out.println("             Menu            ");
            System.out.println("______________________________");
            System.out.println("1.Burgers          2.Chicken");
            System.out.println("3.Drinks           4.Desserts");

            System.out.println(" ");
            System.out.println("What would you like to view?");
            choice = scan.nextInt();
            scan.nextLine();

            /*                      DRINKS                     */
            if (choice == 3){
                System.out.println("            Drinks          ");
                System.out.println("_____________________________");
                System.out.println("1.Coke          2.Diet Coke\n3.Coke Zero\t\t4.Sprite\n5.Fanta\t\t\t6.Water");
            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
