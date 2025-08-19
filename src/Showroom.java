import java.sql.SQLOutput;
import java.sql.Struct;
import java.util.*;


public class Showroom implements utility {
    String showroom_name;
    String showroom_address;
    int total_employess;
    int total_cars_in_stock;
    String Manager_name;

    @Override
    public void get_details(){
        System.out.println("Showroom name : " + showroom_name);
        System.out.println("Showroom Address: " + showroom_address);
        System.out.println("Manager Name :" +  Manager_name );
        System.out.println("Total employees in showroom : " + total_employess);
        System.out.println("Total cars in stock: " + total_cars_in_stock);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ============ *** ENTER SHOWROOM DETAILS *** =========== ");
        System.out.println();
        System.out.println("SHOWROOM NAME: ");
        showroom_name = sc.nextLine();
        System.out.println("SHOWROOM ADDRESS: ");
        showroom_address = sc.nextLine();
        System.out.println("MANAGER NAME: ");
        Manager_name = sc.nextLine();
        System.out.println("TOTAL NUMBER OF EMPLOYEES: ");
        total_employess = sc.nextInt();
        System.out.println("TOTAL CARS IN STOCK : ");
        total_cars_in_stock = sc.nextInt();

    }
}
