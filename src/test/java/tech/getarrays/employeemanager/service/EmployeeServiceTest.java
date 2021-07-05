package tech.getarrays.employeemanager.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.repository.EmployeeRepository;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    @InjectMocks
    EmployeeService employeeService;

    @Mock
    EmployeeRepository employeeRepository;

    @Test
    public void test_findAllEmployees() {

        Employee dto = Mockito.mock(Employee.class);

        Mockito.when(employeeRepository.findAll())
                .thenReturn(Arrays.asList(dto));

        List<Employee> result = employeeService.findAllEmployees();
        assertEquals(1, result.size());
    }

    /*
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void addEmployee() {
    }

    @Test
    public void updateEmployee() {
    }

    @Test
    public void findEmployeeById() {
    }

    @Test
    public void deleteEmployee() {
    }

     */
}