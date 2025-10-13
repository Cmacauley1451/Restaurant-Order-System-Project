import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int choice;

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

        System.out.println("test");
        System.out.println(choice);


    }
}
