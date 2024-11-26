package department.kolmykov;


public class Employee {
    String name;
    Department department;

    public Employee(String name, Department department) {
        this.name = name;
        setDepartment(department);
    }

    public void setDepartment(Department department) {
        this.department = department;
        if (department != null) {
            department.addEmployee(this);
        }
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        if (department == null) {
            return name + " не привязан к отделу.";
        } else if (department.manager == this) {
            return name + " начальник отдела " + department.getName();
        } else {
            return name + " работает в отделе " + department.getName() +
                    ", начальник которого " + department.manager.getName();
        }
    }
}