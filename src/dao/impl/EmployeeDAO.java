/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.IEmployeeDAO;
import java.util.Date;
import java.util.List;
import mapper.EmployeeMapper;
import model.EmployeeModel;

/**
 *
 * @author TAN
 */
public class EmployeeDAO extends AbstractDAO<EmployeeModel> implements IEmployeeDAO {

    @Override
    public EmployeeModel findByEmployeeId(String employeeId) {
        String sql = "select * from employee where employee_id = ?";

        List<EmployeeModel> models = query(sql, new EmployeeMapper(), employeeId);

        return models.isEmpty() ? null : models.get(0);
    }

    @Override
    public Long save(EmployeeModel employee) {
        StringBuffer sql = new StringBuffer();
        
        sql.append("insert into employee(employee_id, salary, joining_date, ssn, name,dob,street,city,province) ");
        sql.append(" values(?,?,?,?,?,?,?,?,?)");
        
        
        return insert(sql.toString(), employee.getEmployee_id(), employee.getSalary(), 
                employee.getJoining_date(), employee.getSsn(), employee.getName(), employee.getDob(), employee.getStreet(), employee.getCity(), employee.getProvince());
        
        
    }

    @Override
    public String findLastEmployeeId() {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT * FROM employee ORDER BY employee_id DESC LIMIT ?");
        
        List<EmployeeModel> models = query(sql.toString(), new EmployeeMapper(), 1);
        return models.isEmpty() ? null : models.get(0).getEmployee_id();
        
    }
    
    

}
