import java.util.*;

public class Employees implements utility {
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;
    String showroom_name;   // employee belongs to which showroom

    @Override
    public void get_details() {
        System.out.println("=========== *** EMPLOYEE DETAILS *** ===========");
        System.out.println("ID: " + emp_id);
        System.out.println("Name: " + emp_name);
        System.out.println("Age: " + emp_age);
        System.out.println("Department: " + emp_department);
        System.out.println("Showroom: " + showroom_name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);

        System.out.println("=========== *** ENTER EMPLOYEE DETAILS *** =========== ");
        System.out.print("EMPLOYEE NAME: ");
        emp_name = sc.nextLine();

        System.out.print("EMPLOYEE AGE: ");
        emp_age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("EMPLOYEE DEPARTMENT: ");
        emp_department = sc.nextLine();

        System.out.print("SHOWROOM NAME: ");
        showroom_name = sc.nextLine();
    }
}
