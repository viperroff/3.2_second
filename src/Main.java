import department.kolmykov.*;
import gun.kolmykov.*;

public class Main {
    public static void main(String[] args) {
        //3.2.1
        Department itDepartment = new Department("IT", null);

        Employee petrov = new Employee("Петров", itDepartment);
        Employee kozlov = new Employee("Козлов", itDepartment);
        Employee sidorov = new Employee("Сидоров", itDepartment);

        itDepartment.setManager(kozlov);

        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);


        //3.2.2

        GunMachine gun1 = new GunMachine();
        System.out.println(gun1.shoot());
        GunMachine gun2 = new GunMachine(300, 30);
        System.out.println(gun2.shootTimes(5));




    }
}