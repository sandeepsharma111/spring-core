package com.learn.spring.dependency;

public class Address {
	private String city;
	private String state;
	private String country;
	private Detail detail;
	private Employee employee;
	public Address(Employee employee){
		this.employee=employee;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}



	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", Detail="+detail+",Employee="+employee.getName()+"]";
	}


	public void setDetail(Detail detail) {
		this.detail = detail;
	}

	public Detail getDetail() {
		return detail;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
