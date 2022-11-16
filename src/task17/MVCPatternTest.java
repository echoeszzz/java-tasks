package task17;

import java.util.ArrayList;

public class MVCPatternTest {

    private static Employee retrieveEmployeeFromDatabase() {
        return new Employee("Ivan", "Programmer", 100000.);
    }

    public static void main(String... args) {
        Employee model = retrieveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeSalary(200000.);

        System.out.println("\nAfter updating:");
        controller.updateView();
    }
}
