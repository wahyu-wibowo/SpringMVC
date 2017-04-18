package org.wahyu.springmvc.entity;
 
import java.io.Serializable;
import java.util.Date;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
 
@Entity
@Table(name = "Orders", //
uniqueConstraints = { @UniqueConstraint(columnNames = "Order_Num") })
public class Order implements Serializable {
 
    private static final long serialVersionUID = -2576670215015463100L;
 
    private String id;
    private Date orderDate;
    private int orderNum;
    private double amount;
    private double discount;
    private String customerId;
 
    @Id
    @Column(name = "ID", length = 50)
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
  
    @Column(name = "Order_Date", nullable = false)
    public Date getOrderDate() {
        return orderDate;
    }
 
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
 
    @Column(name = "Order_Num", nullable = false)
    public int getOrderNum() {
        return orderNum;
    }
 
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
 
    @Column(name = "Amount", nullable = false)
    public double getAmount() {
        return amount;
    }
 
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    @Column(name = "Discount", nullable = false)
    public double getDiscount() {
        return discount;
    }
 
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    @Column(name = "Customer_ID", nullable = false)
    public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
 
}