package KasusSebelumnya;

public class Employee {
    private String name;
    private double baseSalary;
    private int hireYear;

    public Employee(String name, double baseSalary, int hireYear) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return baseSalary;
    }

    public int getHireYear() {
        return hireYear;
    }

    public String getDetails() {
        return "Nama: " + name + ", Gaji Pokok: " + baseSalary + ", Tahun Masuk: " + hireYear;
    }
}