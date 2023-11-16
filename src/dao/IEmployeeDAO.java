/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.EmployeeModel;

/**
 *
 * @author TAN
 */
public interface IEmployeeDAO extends GenericDAO<EmployeeModel>{
    EmployeeModel findByEmployeeId(int employeeId);
}
