public class Employee extends Person{

    private String designation;
    private long salary;
// Default constructor
    public Employee() {
    }

    public Employee(String name, int age, String address, String designation, long salary) {
        super(name, age, address);
        this.designation = designation;
        this.salary = salary;
    }
    // Getter
    public String getDesignation() {
        return designation;
    }
    // Setter
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    // Getter
    public long getSalary() {
        return salary;
    }
    // Setter
    public void setSalary(long salary) {
        this.salary = salary;
    }
}
