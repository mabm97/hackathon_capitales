package mx.tec.rest.service;

import mx.tec.rest.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findEmployees();
    Employee findEmployee(int employeeNumber);
    boolean deleteEmployee(int employeeNumber);
    boolean saveEmployee(Employee employee);
}
