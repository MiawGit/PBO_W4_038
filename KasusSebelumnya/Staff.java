package KasusSebelumnya;

public class Staff extends Employee {
    private String role;

    public Staff(String name, double baseSalary, int hireYear, String role) {
        super(name, baseSalary, hireYear);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String getDetails() {
        return "Staff [" + super.getDetails() + ", Posisi: " + role + "]";
    }
}