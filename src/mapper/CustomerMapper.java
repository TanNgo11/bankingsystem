/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import model.CustomerModel;

/**
 *
 * @author TAN
 */
public class CustomerMapper implements RowMapper<CustomerModel> {

    @Override
    public CustomerModel mapRow(ResultSet rs) {
        CustomerModel model = new CustomerModel();
        try {

            model.setSsn(rs.getString("ssn"));
            model.setName(rs.getString("name"));
            model.setDob(rs.getDate("dob"));
            model.setStreet(rs.getString("street"));
            model.setCity(rs.getString("city"));
            model.setProvince(rs.getString("province"));
            model.setCustomerId(rs.getString("customer_id"));

        } catch (Exception e) {
        }
        return model;
    }

}
