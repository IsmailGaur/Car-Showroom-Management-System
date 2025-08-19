//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.awt.*;
import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;

interface utility{
    public void get_details();

    public void set_details();
}

public class Main {
//    public static void main(String[] args) {

    static void main_menu(){
        System.out.println();
        System.out.println("==================== *** WELCOME TO CAR SHOWROOM MANAGEMENT SYSTEM *** =====================");
        System.out.println();
        System.out.println(" ==================== *** ENTER YOUR CHOICE *** =====================");
        System.out.println();
        System.out.println("1]. ADD SHOWROOMS \t\t\t 2]. ADD EMPLOYEES \t\t\t 3]. ADD CARS" );
        System.out.println();
        System.out.println("4]. GET SHOWROOMS \t\t\t 5]. GET EMPLOYEES \t\t\t 6]. GET CARS");
        System.out.println();
     }

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employees employee = new Employees[5];
        Cars car = new Cars[5];
        int car_counter = 0;
        int showroom_counter = 0;
        int employees_counbter = 0;
        int choice = 100;

        while(choice != 0){
            main_menu();
            choice  = sc.nextInt();

            while(choice != 9 && choice !=0){
                switch (choice){
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();

                        System.out.println("2]. ADD NEW SHOWROOM");
                        System.out.println("9]. GO BACK TO MAIN MENU ");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employees[employees_counbter] = new Employees();
                        employees[employees_counter].set_details();
                        employees_counter++;
                        System.out.println();

                        System.out.println("2]. ADD NEW EMPLOYEE");
                        System.out.println("9]. GO BACK TO MAIN MENU ");
                        choice = sc.nextInt();
                        break;



                }
            }
        }
     }
}