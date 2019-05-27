package com.cdac.spring.DI;

public class Employee {

	private Integer empId;
	private String name;
	
	
	
	public Integer getEmpId() {
		return empId;
	}



	public void setEmpId(Integer empId) {
		this.empId = empId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Employee(Integer empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}



	public Employee() {
	
	}



	@Override
	public String toString() {
		return "Employee [empId = " + empId + ", name = "  + name + "]";
	}

	
	
	
	
}
