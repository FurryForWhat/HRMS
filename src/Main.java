
import model.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // This is the main entry point of the application.
        // You can initialize your application here, set up the database connection,
        // or start the user interface.
        Position manager = new Position(1, "Manager", "Responsible for overseeing the team and ensuring project success.");
        Position accountantJunior = new Position(2, "accountantJunior", "Responsible for overseeing the team and ensuring project success.");
        Position humanResource = new Position(3, "humanResource", "Responsible for overseeing the team and ensuring project success.");

        Department sales = new Department(1, "Sales");
        Department humanResources = new Department(2, "Human Resources");

        PreExperience kyawPreExp = new PreExperience(1, "1", "ABC Company", "Admin Executive", "2020-01-01", "2022-01-01");
        PreExperience theinMyintPreExp = new PreExperience(2, "2", "XYZ Company", "Junior sale", "2019-01-01", "2021-01-01");
        PreExperience soeLwinPreExp = new PreExperience(3, "3", "LMN Company", " HR Executive", "2018-01-01", "2020-01-01");
        List<PreExperience> preExperiencesList = List.of(kyawPreExp, theinMyintPreExp);

        Employee kyaw = new Employee(1,"Kyaw Kyaw","kyaw@gmail.com","1234567890",
                "09456789012","Yangon", Role.EMPLOYEE,1,1,
                List.of("Health Insurance","Transport Allowance"),8000.00,
                LocalDate.of(2024,12,9),LocalDate.now(), Status.ACTIVE);
        Employee theinMyint = new Employee(2,"Thein Myint","theinMyint@gmail.com","0987654321",
                "09456783141","Mandalay",Role.HR,2,1,
                List.of("Health Insurance","Transport Allowance"),3000.00,
                LocalDate.of(2020,12,9),LocalDate.now(),Status.ACTIVE);
        Employee SoeLwin = new Employee(3,"Soe Lwin","soelwin@gmail.com","1212121212",
                "0983121218","Dawei", Role.ADMIN,3,2,List.of("Health Insurance","Transport Allowance"),
                7000.00,LocalDate.of(2018,3,9),LocalDate.now(),Status.ACTIVE);
        System.out.println("Welcome to the model.Employee Management System!");
        System.out.println(kyaw.toString());
        System.out.println(theinMyint.toString());
        System.out.println(SoeLwin.toString());
    }
}