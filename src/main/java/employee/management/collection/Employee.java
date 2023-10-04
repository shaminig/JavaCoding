package employee.management.collection;

public class Employee {
    private int eNo;
    private String eName;
    private int salary;

    Employee(int eNo, String eName, int salary) {
        this.eNo = eNo;
        this.eName = eName;
        this.salary = salary;
    }

    public int getENo() {
        return eNo;
    }

    public String getEName() {
        return eName;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return eNo + " " + eName + " " + salary;
    }
}
