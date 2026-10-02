package KasusSebelumnya;

public class TestEmployee {
    public static void main(String[] args) {
        Manager man = new Manager("Antonio Rossi", 29000000, 1989, 5000000);
        Staff stf = new Staff("Maria Bianchi", 2500000, 1991, "IT Support");

        System.out.println("--- Data Karyawan ---");
        System.out.println(man.getDetails());
        System.out.println(stf.getDetails());
        
        System.out.println("\n--- Pengecekan Method Warisan ---");
        System.out.println("Tahun masuk Manager : " + man.getHireYear());
        System.out.println("Tahun masuk Staff   : " + stf.getHireYear());
    }
}