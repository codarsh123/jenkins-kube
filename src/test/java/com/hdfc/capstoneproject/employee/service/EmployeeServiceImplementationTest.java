/*
 * package com.hdfc.capstoneproject.employee.service;
 * 
 * import static org.junit.jupiter.api.Assertions.assertEquals; import static
 * org.junit.jupiter.api.Assertions.assertNotNull;
 * 
 * import java.time.LocalDate;
 * 
 * import org.junit.jupiter.api.Disabled; import org.junit.jupiter.api.Test;
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest;
 * 
 * import com.hdfc.capstoneproject.employee.dto.EmployeeDTO; import
 * com.hdfc.capstoneproject.employee.entity.Employee; import
 * com.hdfc.capstoneproject.employee.exception.EmployeeNotFoundException;
 * 
 * @SpringBootTest
 * 
 * @Disabled class EmployeeServiceImplementationTest {
 * 
 * @Autowired IEmployeeService service;
 * 
 * @Test void testGetEmployeeById() throws Exception { long employeeId = 1L;
 * Employee employee =new Employee(); employee.setEmployeeId(employeeId);
 * employee.setEmployeeName("Adarsh Verma");
 * employee.setDateOfBirth("qF6OoYwUXTwWuIV2zAHRxw==");
 * 
 * EmployeeDTO employeeDTO= service.getEmployeeById(employeeId);
 * assertNotNull(employeeDTO); assertEquals(employee.getEmployeeId(),
 * employeeDTO.getEmployeeId()); assertEquals(employee.getEmployeeName(),
 * employeeDTO.getEmployeeName()); assertEquals(employee.getDateOfBirth(),
 * employeeDTO.getDateOfBirth()); }
 * 
 * }
 */
