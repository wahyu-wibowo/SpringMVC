package org.wahyu.springmvc.entity;
 
import java.io.Serializable;
import java.util.Date;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
 
@Entity
@Table(name = "Customers")
public class Customer implements Serializable {
 
    private static final long serialVersionUID = -2576670215015463101L;
 
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;
    private String customerType;
    private Date joinDate;
    
    /*public Customer(String customerId, String customerName, String customerAddress,
            String customerEmail, String customerPhone, String customerType, Date joinDate) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.customerType = customerType;
        this.joinDate = joinDate;
    }*/
 
    @Id
    @Column(name = "Customer_ID", length = 20)
    public String getCustomerId() {
        return customerId;
    }
 
    public void setCustomerId(String id) {
        this.customerId = id;
    }
    
    @Column(name = "Customer_Name", length = 255, nullable = false)
    public String getCustomerName() {
        return customerName;
    }
 
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
 
    @Column(name = "Customer_Address", length = 255, nullable = false)
    public String getCustomerAddress() {
        return customerAddress;
    }
 
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
 
    @Column(name = "Customer_Email", length = 128, nullable = false)
    public String getCustomerEmail() {
        return customerEmail;
    }
 
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
 
    @Column(name = "Customer_Phone", length = 128, nullable = false)
    public String getCustomerPhone() {
        return customerPhone;
    }
 
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
    
    @Column(name = "Customer_Type", length = 20, nullable = false)
    public String getCustomerType() {
        return customerType;
    }
 
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
  
    @Column(name = "Join_Date", nullable = false)
    public Date getJoinDate() {
        return joinDate;
    }
 
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
    
}