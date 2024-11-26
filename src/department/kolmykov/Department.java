package department.kolmykov;
import java.util.ArrayList;
import java.util.List;

public class Department {
    String name;
    Employee manager;
    List<Employee> employees;

    public Department(String name, Employee manager) {
        this.name = name;
        setManager(manager);
        this.employees = new ArrayList<>();
    }

    public void setManager(Employee manager) {
        this.manager = manager;
        if (manager != null) {
            manager.setDepartment(this);
        }
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
            employee.setDepartment(this);
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}