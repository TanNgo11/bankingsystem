/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.ICustomerDAO;
import java.util.List;
import mapper.CustomerMapper;
import mapper.EmployeeMapper;
import model.CustomerModel;
import model.EmployeeModel;

/**
 *
 * @author TAN
 */
public class CustomerDAO extends AbstractDAO<CustomerModel> implements ICustomerDAO{

    @Override
    public CustomerModel findByCustomerId(String customerId) {
        String sql = "select * from customer where customer_id = ?";

        List<CustomerModel> models = query(sql, new CustomerMapper(), customerId);

        return models.isEmpty() ? null : models.get(0);
    }

    @Override
    public Long save(CustomerModel customer) {
        StringBuffer sql = new StringBuffer();

        sql.append("insert into customer(customer_id, ssn, name,dob,street,city,province) ");
        sql.append(" values(?,?,?,?,?,?,?)");
        

        return insert(sql.toString(), customer.getCustomerId(), customer.getSsn(), customer.getName(), customer.getDob(), customer.getStreet(), customer.getCity(), customer.getProvince());

     
    }

    @Override
    public String findLastCustomerId() {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT * FROM customer ORDER BY customer_id DESC LIMIT ?");

        List<CustomerModel> models = query(sql.toString(), new CustomerMapper(), 1);
        return models.isEmpty() ? null : models.get(0).getCustomerId();
    }

  
    
}
