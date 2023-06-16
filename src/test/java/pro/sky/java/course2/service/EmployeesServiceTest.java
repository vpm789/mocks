package pro.sky.java.course2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.Employees;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static pro.sky.java.course2.constants.EmployeesServiceTestConstants.*;

public class EmployeesServiceTest {

    private final EmployeesServiceImpl out = new EmployeesServiceImpl();

    @Test
    public void shouldReturnErrorWhenAddIsIncorrect() {
        Employees employee = new Employees("Vasya", "Pupkin", 7, 7000);
        out.employees.put("Vasya" + "Pupkin", employee);
        out.addEmployee(FIRSTNAME, LASTNAME, DEPARTMENT, SALARY);
        assertTrue(out.employees.containsKey(FIRSTNAME + LASTNAME));
    }

    @Test
    public void shouldReturnErrorWhenDeleteIsIncorrect() {
        out.addEmployee(FIRSTNAME, LASTNAME, DEPARTMENT, SALARY);
        out.deleteEmployee(FIRSTNAME, LASTNAME);
        assertFalse(out.employees.containsKey(FIRSTNAME+LASTNAME));
    }

    @Test
    public void shouldReturnErrorWhenFindIsIncorrect() {
        out.addEmployee(FIRSTNAME, LASTNAME, DEPARTMENT, SALARY);
        Employees findedEmpl = out.findEmployee(FIRSTNAME, LASTNAME);
        assertEquals(new Employees(FIRSTNAME, LASTNAME, DEPARTMENT, SALARY),findedEmpl);
    }
}
