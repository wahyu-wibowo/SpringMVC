package org.wahyu.springmvc.dao;
 
import java.util.List;

import org.wahyu.springmvc.entity.Customer;
import org.wahyu.springmvc.model.CustInfo;
 
public interface CustomerDAO {
 
    
    public Customer findCustomer(String customerId );
    public List<CustInfo> getAllCustomer();
    
}