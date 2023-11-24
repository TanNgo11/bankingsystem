/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.impl.EmployeeDAO;
import model.EmployeeModel;

/**
 *
 * @author TAN
 */
public class EmployeeController {

    private final String EMPLOYEEID = "Emp";

    private EmployeeDAO employeeDAO;

    public EmployeeController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public EmployeeModel login(String username, String password) {
        EmployeeModel model = employeeDAO.findByEmployeeId(username);
        if (model == null) {
            return null;
        }
        if (!model.getDob().toString().equals(password)) {
            return null;
        }
        return model;

    }

    public String selectLastEmployeeId() {
        return employeeDAO.findLastEmployeeId();
    }

    public Long save(EmployeeModel employeeModel) {
        return employeeDAO.save(employeeModel);
    }

    public String generateNewEmployeeId(String lastId) {
        int newNumber = Integer.parseInt(lastId.substring(3)) + 1;
        String strNumber = newNumber + "";
        if (newNumber < 10) {
            strNumber = "00" + strNumber;
        } else if (newNumber < 100) {
            strNumber = "0" + strNumber;
        }

        String newId = EMPLOYEEID + strNumber + "";
        return newId;
    }

}
