package com.dao;

import org.hibernate.SessionFactory;

import com.dto.Customer;
import com.ts.HibernateTemplate;

public class CustomerDAO {
	private SessionFactory factory = null;

	public Customer getEmpByUserPass(String loginId,String password) {

		return (Customer)HibernateTemplate.getObjectByUserPass(loginId,password);
	}

	public int register(Customer customer) {
		System.out.println(customer); 
		return HibernateTemplate.addObject(customer);
	}

	public Customer getCustpByUserPass(String loginId, String password) {
		return (Customer)HibernateTemplate.getObjectByUserPass(loginId,password);
	}

}