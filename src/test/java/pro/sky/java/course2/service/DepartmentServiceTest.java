package pro.sky.java.course2.service;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.java.course2.Employees;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
import static pro.sky.java.course2.constants.EmployeesServiceTestConstants.*;

@ExtendWith(MockitoExtension.class)
public class DepartmentServiceTest {

    @Mock
    private EmployeesService employeesServiceMock;
    @InjectMocks
    private DepartmentServiceImpl out;

    @Test
    public void shouldCallDepartmentServiceMethodsWhenPrintEmployee() {
        when(employeesServiceMock.printEmployee()).thenReturn(EMPLOYEES);

        assertEquals(employeeMinSalary, out.getEmployeeMinSalaryDepart(7));
        assertEquals(employeeMaxSalary, out.getEmployeeMaxSalaryDepart(7));
        assertEquals(DEPART_EMPLOYEES, out.getEmployeesDepart(7));
        assertEquals(GET_EMPLOYEES, out.getEmployees());
    }

}
