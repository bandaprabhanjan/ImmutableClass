package com.mutable.contains.mutable.reference;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MutableRefClient {

	public static void main(String[] args) {
		Address address1 = new Address(0001, "koppula", "Shayampet", "warangal", "506164");
		Address address2 = new Address(0002, "rpally", "Regonda", "Jayashankar", "506001");
		List<String> skills1 = Arrays.asList("Java", "Mainframe", "Python");
		List<String> skills2 = Arrays.asList("MachineLearning", "C", "C++");
		Employee employee1 = new Employee(1001, "user1", getDob("22/06/1990"), address1, skills1);
		Employee employee2 = new Employee(1002, "user2", getDob("05/12/1989"), address2, skills2);
		System.out.println("employee1 Details: " + employee1);
		System.out.println("employee2 Details: " + employee2);
		employee1.getAddress().setCity("Hyderabad");
		System.out.println("after modification city" + employee1);
	}

	private static Date getDob(String dob) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		try {
			return dateFormat.parse(dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
