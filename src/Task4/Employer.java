package Task4;

public class Employer {
    private String lastName;
    private String firstName;
    private int income;

    public Employer(String lastName, String firstName, int income) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public String getLastName() {
        return lastName;
    }
}

class Manager extends Employer {
    private double averageSum;

    public Manager(String lastName, String firstName, int income, double averageSum) {
        super(lastName, firstName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return super.getIncome() + averageSum;
    }
}

class EmployerTest {
    public static void main(String[] args) {
        Employer[] employers = new Employer[5];
        employers[0] = new Employer("ivan1", "ivanovich", 100);
        employers[1] = new Manager("ivan2", "ivanovich", 10021, 12293.0);
        employers[2] = new Employer("ivan3", "ivanovich", 14324);
        employers[3] = new Manager("ivan4", "ivanovich", 121300, 2713.0);
        employers[4] = new Employer("ivan5", "ivanovich", 1013240);
        for (var employer : employers) {
            System.out.println("employer " + employer.getLastName() + ": " + employer.getIncome());
        }
    }
}