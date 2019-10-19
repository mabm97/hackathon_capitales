package mx.tec.rest.service;

import mx.tec.rest.model.Employee;
import mx.tec.rest.util.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService{
    @Override
    public List<Employee> findEmployees() {
        String sql = "SELECT * FROM Employees";
        List<Employee> employees = new ArrayList<>();
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                Employee employee = new Employee();
                employee.setFirstName(resultSet.getString("firstName"));
                employee.setLastName(resultSet.getString("lastName"));
                employee.setEmployeeNumber(resultSet.getInt("employeeNumber"));
                employee.setJobTitle(resultSet.getString("jobTitle"));
                employee.setEmail(resultSet.getString("email"));
                employee.setExtension(resultSet.getString("extension"));
                employee.setReportsTo(resultSet.getInt("reportsTo"));
                employee.setOfficeCode(resultSet.getInt("officeCode"));

                employees.add(employee);
            }
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return employees;
    }

    @Override
    public Employee findEmployee(int employeeNumber) {
        return null;
    }

    @Override
    public boolean deleteEmployee(int employeeNumber) {
        String sql = "DELETE FROM Employees WHERE employeeNumber = ?";
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setInt(1, employeeNumber);
            preparedStatement.execute();

            return true;
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean saveEmployee(Employee employee) {
        String sql = "INSERT INTO Employees(employeeNumber, officeCode, firstName, lastName," +
                " jobTitle, extension, email, reportsTo)" +
                " VALUES(?,?,?,?,?,?,?,?)";
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setInt(1, employee.getEmployeeNumber());
            preparedStatement.setInt(2,employee.getOfficeCode());
            preparedStatement.setString(3, employee.getFirstName());
            preparedStatement.setString(4, employee.getLastName());
            preparedStatement.setString(5, employee.getJobTitle());
            preparedStatement.setString(6, employee.getExtension());
            preparedStatement.setString(7, employee.getEmail());
            preparedStatement.setInt(8, employee.getReportsTo());
            preparedStatement.execute();

            return true;
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return false;
    }
}
