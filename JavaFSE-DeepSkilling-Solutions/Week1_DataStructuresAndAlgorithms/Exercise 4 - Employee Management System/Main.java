 class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(new Employee(1, "Alice", "HR", 55000));
        manager.addEmployee(new Employee(2, "Bob", "Developer", 75000));
        manager.displayAll();
        manager.searchEmployee(2);
        manager.deleteEmployee(1);
        manager.displayAll();
    }
}