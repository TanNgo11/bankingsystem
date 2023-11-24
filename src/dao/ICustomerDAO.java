/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.CustomerModel;
import model.EmployeeModel;

/**
 *
 * @author TAN
 */
public interface ICustomerDAO extends GenericDAO<CustomerModel>{
    CustomerModel findByCustomerId(String customerId);

    Long save(CustomerModel customer);

    String findLastCustomerId();
    
}
