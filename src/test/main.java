/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dao.impl.EmployeeDAO;

/**
 *
 * @author TAN
 */
public class main {

    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        
        System.out.println(dao.findByEmployeeId(1).toString());
        System.out.println(dao.findByEmployeeId(1).getName());
    }
    
}
