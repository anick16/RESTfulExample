package com.hcl.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.hcl.pojo.Customer;

@Path("/customer")
public class CustomerService {

	@GET
	public List<Customer> getCustomers() {
		Customer customer;
		List <Customer> customerList = new ArrayList<Customer>();
		customer= new Customer("1", "Alex", "1234567890", "alex@abc.com" );
		customerList.add(customer);
		customer= new Customer("2", "Matt", "1234567890", "matt@abc.com" );
		customerList.add(customer);
		return customerList;
 
	}
	
	@GET
	@Path("/{customerId}")
	public Customer getCustomer(@PathParam("customerId") String customerId) {
 
		Customer customer= new Customer(customerId, "Alex", "1234567890", "alex@abc.com" );

		return customer;
 
	}
}
