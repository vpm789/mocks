package pro.sky.java.course2;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class Employees {
    private String firstName;
    private String lastName;
    private int department;
    private double salary;

    public Employees(String firstName, String lastName, int department, double salary) {
        this.firstName = StringUtils.capitalize(StringUtils.lowerCase(firstName));
        this.lastName = StringUtils.capitalize(StringUtils.lowerCase(lastName));
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return Objects.equals(firstName, employees.firstName) && Objects.equals(lastName, employees.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
