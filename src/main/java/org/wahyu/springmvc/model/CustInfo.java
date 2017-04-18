package org.wahyu.springmvc.model;

import java.util.Date;

 
public class CustInfo {
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;
    private String customerType;
    private Date joinDate;
    
    public CustInfo(String customerId, String customerName, String customerAddress,
            String customerEmail, String customerPhone, String customerType, Date joinDate) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.customerType = customerType;
        this.joinDate = joinDate;
    }
 
    public String getCustomerId() {
        return customerId;
    }
 
    public void setCustomerId(String id) {
        this.customerId = id;
    }
    
    public String getCustomerName() {
        return customerName;
    }
 
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
 
    public String getCustomerAddress() {
        return customerAddress;
    }
 
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
 
    public String getCustomerEmail() {
        return customerEmail;
    }
 
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
 
    public String getCustomerPhone() {
        return customerPhone;
    }
 
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
    
    public String getCustomerType() {
        return customerType;
    }
 
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
  
    public Date getJoinDate() {
        return joinDate;
    }
 
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
    
}