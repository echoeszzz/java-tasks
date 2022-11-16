package task17;

public class EmployeeController {
    private final Employee model;
    private final EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public String getEmployeeJob() {
        return model.getJob();
    }

    public Double getEmployeeSalary() {
        return model.getSalary();
    }

    public void setEmployeeJob(String newJob) {
        model.setJob(newJob);
    }

    public void setEmployeeSalary(Double newSalary) {
        model.setSalary(newSalary);
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getJob(), model.getSalary());
    }
}
