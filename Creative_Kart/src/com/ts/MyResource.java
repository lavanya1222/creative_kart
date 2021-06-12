package com.ts;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.CustomerDAO;
import com.dto.Customer;
import com.dto.Product;

@Path("myresource")
public class MyResource {
	
	@Path("registerCust")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void registerCust(Customer customer) {
		System.out.println("Data Recieved in Customer Register : " + customer);
		CustomerDAO customerDAO = new CustomerDAO();
		customerDAO.register(customer);
	}
	
	@Path("getCustByUserPass/{loginId}/{password}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustByUserPass(@PathParam("loginId") String loginId,@PathParam("password") String password) {
		System.out.println("Recieved path params: "+loginId+" "+password); 
		CustomerDAO customerDAO = new CustomerDAO();
		Customer customer = customerDAO.getCustpByUserPass(loginId, password);
		return customer;
	}
	
}