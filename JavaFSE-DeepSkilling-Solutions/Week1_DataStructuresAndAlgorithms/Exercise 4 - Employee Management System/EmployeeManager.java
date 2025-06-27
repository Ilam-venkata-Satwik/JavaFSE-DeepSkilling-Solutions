public class EmployeeManager {
    Employee[] employees = new Employee[10];
    int count = 0;

    public void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count++] = e;
        }
    }

    public void searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Found: " + employees[i].name);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                return;
            }
        }
    }

    public void displayAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].name + " - " + employees[i].position);
        }
    }
}