/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.Date;
import model.EmployeeModel;

/**
 *
 * @author TAN
 */
public interface IEmployeeDAO extends GenericDAO<EmployeeModel>{
    EmployeeModel findByEmployeeId(String employeeId);
    Long save(EmployeeModel employee);
    String findLastEmployeeId();
}
