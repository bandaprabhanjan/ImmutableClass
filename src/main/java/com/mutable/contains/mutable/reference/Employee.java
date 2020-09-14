package com.mutable.contains.mutable.reference;

import java.util.Date;
import java.util.List;

public final class Employee {
	private final int id;
	private final String name;
	private final Date dob;
	private final Address address;
	private final List<String> skills;

	public Employee(int id, String name, Date dob, Address address, List<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + ", skills=" + skills
				+ "]";
	}

	public List<String> getSkills() {
		return skills;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

//Defensive Copy
	public Date getDob() {
		return new Date(dob.getTime());
	}

	public Address getAddress() {
		Address address = new Address();
		address.setId(address.getId());
		address.setAddressLine1(address.getAddressLine1());
		address.setAddressLine2(address.getAddressLine2());
		address.setCity(address.getCity());
		address.setZipcode(address.getZipcode());
		return address;

	}

}