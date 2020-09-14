package com.practice.employee.management;

import java.math.BigDecimal;
import java.util.Date;

public final class EmployeeBean {
	private final Integer id;
	private final String name;
	private BigDecimal salary;
	private Date dob;

	public EmployeeBean(Integer id, String name, BigDecimal salary, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", salary=" + salary + ", dob=" + dob + "]";
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public Date getDob() {
		return new Date(dob.getTime());
	}
	

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
