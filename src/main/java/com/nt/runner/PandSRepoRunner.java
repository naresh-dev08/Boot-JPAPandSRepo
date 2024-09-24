package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.service.ICustomerMgmtService;

@Component
public class PandSRepoRunner implements CommandLineRunner {

	@Autowired
	private ICustomerMgmtService custService;

	@Override
	public void run(String... args) throws Exception {
		
		
		/*//custService.getAlllCustomers(true, "billamt").forEach(System.out::println);
		//custService.getAlllCustomers(true, "cname", "billamt").forEach(System.out::println);
		//custService.getAlllCustomers(true, "billamt", "cname").forEach(System.out::println);
		custService.getAlllCustomers(false, "billamt").forEach(System.out::println);*/
		
		
		/*//Page<Customer> page = custService.getCustomersByPageNo(0, 4);
		Page<Customer> page = custService.getCustomersByPageNo(6, 4);
		System.out.println("Requested page recoreds are ::");
		page.getContent().forEach(System.out::println);
		System.out.println("Total pages count ::"+page.getTotalPages());
		System.out.println("Current page no ::"+page.getNumber());
		System.out.println("Total number of records ::"+page.getTotalElements());
		System.out.println("No of records in the requested page ::"+page.getNumberOfElements());
		System.out.println("Is request page is first page ::"+page.isFirst());
		System.out.println("Is request page is last page ::"+page.isLast());*/
		
		/*	Page<Customer> page = custService.getSortedCustomersByPageNO(2, 3, true, "billamt", "cname");
			page.getContent().forEach(System.out::println);*/
		
		
		custService.showCustomersPageByPage(3);
		
	}
	
	
}
