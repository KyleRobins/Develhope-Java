import java.util.Random;

class Employee {
    String name;
    String surname;
    private String address;

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    public String getEmployeeDetails() {
        return "Name: " + name + "\nSurname: " + surname + "\nAddress: " + address;
    }
}

class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode() {
        Random random = new Random();
        String randomCode1 = "XYZ";
        String randomCode2 = "ZYX";
        return randomCode1 + employee.name + employee.surname + randomCode2;
    }

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }

    public void showBadgeDetails() {
        System.out.println("Total Number of Employees: " + totalNumberOfEmployees);
        System.out.println("Employee Details:\n" + employee.getEmployeeDetails());
        System.out.println("Badge ID Code: " + badgeIdCode);
    }
}

   class Tester {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", "123 Main St");
        Badge badge1 = new Badge(employee1);

        Employee employee2 = new Employee("Alice", "Smith", "456 Oak St");
        Badge badge2 = new Badge(employee2);

        System.out.println("Badge Details for Employee 1:");
        badge1.showBadgeDetails();

        System.out.println("\nBadge Details for Employee 2:");
        badge2.showBadgeDetails();
    }
}
