package com.learn.spring.dependency;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

	private String name;
	private String org;
	private int salary;

	private Address address;

	public Employee(Address address){
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", org=" + org + ", salary=" + salary + ", address=" + address + "]";
	}
	/*@PostConstruct
	void postContruct(){
		System.out.println("Post Construct");
	}
	@PreDestroy
	void preDestroy(){
		System.out.println("Pre Destroy");
	}
*/

	public void setAddress(Address address) {
		this.address = address;
	}
}
