package org.wahyu.springmvc.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.wahyu.springmvc.dao.CustomerDAO;
import org.wahyu.springmvc.entity.Customer;
import org.wahyu.springmvc.model.CustInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
 
// Transactional for Hibernate
@Transactional
public class CustomerDAOImpl implements CustomerDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
 
    @Override
    public Customer findCustomer(String customerId ){
        Session session = sessionFactory.getCurrentSession();
        Criteria crit = session.createCriteria(Customer.class);
        crit.add(Restrictions.eq("customerId", customerId));
        return (Customer) crit.uniqueResult();
    }

	@Override
	public List<CustInfo> getAllCustomer() {
		String sql = "Select new " + CustInfo.class.getName()
                + "(cust.customerId, cust.customerName, cust.customerAddress , cust.customerEmail, cust.customerPhone, cust.customerType, cust.joinDate) "//
                + " from " + Customer.class.getName() + " cust ";
 
        Session session = this.sessionFactory.getCurrentSession();
 
        Query query = session.createQuery(sql);
 
        return query.list();
	}
 
}
