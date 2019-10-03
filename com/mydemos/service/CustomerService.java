package com.mydemos.service;

import com.mydemos.customerDao.CustomerDao;
import com.mydemos.pojo.Customer;

public class CustomerService {

	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		Customer customer = new Customer();
		
		customer.setCustName("Amit");
		customer.setCustLastName("Gendu");
		customer.setAddress("Delhi");
		
		dao.saveCustomer(customer);
		
		
	}

}
