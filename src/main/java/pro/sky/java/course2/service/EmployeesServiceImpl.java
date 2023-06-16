package pro.sky.java.course2.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import pro.sky.java.course2.Employees;
import pro.sky.java.course2.exception.EmployeeAlreadyAddedException;
import pro.sky.java.course2.exception.EmployeeIllegalArgument;
import pro.sky.java.course2.exception.EmployeeNotFoundException;

import java.util.*;

@Service
public class EmployeesServiceImpl implements EmployeesService {
    Map<String, Employees> employees = new HashMap<>();

    @Override
    public void addEmployee(String firstName, String lastName, int department, double salary) {
        if (!StringUtils.isAlpha(firstName) || !StringUtils.isAlpha(lastName)) {
            throw new EmployeeIllegalArgument();
        }
        Employees employee = new Employees(firstName, lastName, department, salary);
        if (employees.containsKey(firstName + lastName)) {
            throw new EmployeeAlreadyAddedException();
        }
        employees.put(firstName + lastName, employee);
    }

    @Override
    public void deleteEmployee(String firstName, String lastName) {
        if (!StringUtils.isAlpha(firstName) || !StringUtils.isAlpha(lastName)) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        if (!employees.containsKey(firstName + lastName)) {
            throw new EmployeeNotFoundException("Employee not found");
        }
        employees.remove(firstName + lastName);
    }

    @Override
    public Employees findEmployee(String firstName, String lastName) {
        if (!StringUtils.isAlpha(firstName) || !StringUtils.isAlpha(lastName)) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        if (!employees.containsKey(firstName + lastName)) {
            throw new EmployeeNotFoundException("Employee not found");
        }
        return employees.get(firstName + lastName);
    }

    @Override
    public Collection<Employees> printEmployee() {
        return employees.values();
    }

}
