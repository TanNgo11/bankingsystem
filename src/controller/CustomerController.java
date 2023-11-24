/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.impl.CustomerDAO;
import dao.impl.EmployeeDAO;
import model.CustomerModel;
import model.EmployeeModel;

/**
 *
 * @author TAN
 */
public class CustomerController {

    private final String CUSTOMERID = "Cust";

    private CustomerDAO customerDAO;

    public CustomerController(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public CustomerModel login(String username, String password) {
        CustomerModel model = customerDAO.findByCustomerId(username);
        if (model == null) {
            return null;
        }
        if (!model.getDob().toString().equals(password)) {
            return null;
        }
        return model;

    }

    public String selectLastCustomerId() {
        return customerDAO.findLastCustomerId();
    }

    public Long save(CustomerModel customerModel) {
        return customerDAO.save(customerModel);
    }

    public String generateNewCustomerId(String lastId) {
        int newNumber = Integer.parseInt(lastId.substring(4)) + 1;
        String strNumber = newNumber + "";
        if (newNumber < 10) {
            strNumber = "00" + strNumber;
        } else if (newNumber < 100) {
            strNumber = "0" + strNumber;
        }

        String newId = CUSTOMERID + strNumber + "";
        return newId;
    }

}
