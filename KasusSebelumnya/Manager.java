package KasusSebelumnya;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, int hireYear, double bonus) {
        super(name, baseSalary, hireYear);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus; 
    }

    @Override
    public String getDetails() {
        return "Manager [" + super.getDetails() + ", Bonus: " + bonus + ", Total Gaji: " + getSalary() + "]";
    }
}