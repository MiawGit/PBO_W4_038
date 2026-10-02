package Task3.Case2;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee(
                "Antonio Rossi = ",
                29000000,
                1,
                10,
                1989
        );

        staff[1] = new Employee(
                "Maria Bianchi = ",
                2500000,
                1,
                12,
                1991
        );

        staff[2] = new Employee(
                "Isabel Vidal  = ",
                3000000,
                1,
                11,
                1993
        );

        System.out.println("Sebelum sorting:");

        for (int i = 0; i < staff.length; i++) {
            staff[i].print();
        }

        Sortable.shell_sort(staff);

        System.out.println();
        System.out.println("Setelah sorting:");

        for (int i = 0; i < staff.length; i++) {
            staff[i].print();
        }
    }
}