package pro.sky.java.course2.constants;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.Employees;
import pro.sky.java.course2.service.EmployeesServiceImpl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class EmployeesServiceTestConstants {
    public static final String FIRSTNAME = "Ivan";
    public static final String LASTNAME = "Drago";
    public static final int DEPARTMENT = 777;
    public static final int SALARY = 1000000;
    public static int EMPTY_PARAMETER;

    public static final Employees employeeMinSalary = new Employees("Valya", "Pupkina", 7, 5000);
    public static final Employees employeeMaxSalary = new Employees("Vasya", "Pupkin", 7, 7000);
    public static final Map<Integer, List<Employees>> GET_EMPLOYEES = Map.of(
            8, List.of(new Employees("Ivan", "Ivanov", 8, 8000)),
            7, List.of(new Employees("Vasya", "Pupkin", 7, 7000),
                    new Employees("Valya", "Pupkina", 7, 5000)),
            777, List.of(new Employees("Ivan", "Drago", 777, 1000000))
    );

    public static final Collection<Employees> DEPART_EMPLOYEES = List.of(
            new Employees("Vasya", "Pupkin", 7, 7000),
            new Employees("Valya", "Pupkina", 7, 5000)
    );
    public static final Collection<Employees> EMPLOYEES = List.of(
            new Employees("Ivan", "Ivanov", 8, 8000),
            new Employees("Vasya", "Pupkin", 7, 7000),
            new Employees("Valya", "Pupkina", 7, 5000),
            new Employees("Ivan", "Drago", 777, 1000000)
    );
}
