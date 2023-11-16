/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.IEmployeeDAO;
import java.util.List;
import mapper.EmployeeMapper;
import model.EmployeeModel;

/**
 *
 * @author TAN
 */
public class EmployeeDAO extends AbstractDAO<EmployeeModel> implements IEmployeeDAO {

    @Override
    public EmployeeModel findByEmployeeId(int employeeId) {
        String sql = "select * from employee where employee_id = ?";

        List<EmployeeModel> models = query(sql, new EmployeeMapper(), employeeId);

        return models.isEmpty() ? null : models.get(0);
    }
    
    

}
