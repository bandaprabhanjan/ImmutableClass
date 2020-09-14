package com.practice.employee.management;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class EmployeeApplication {

	public static void main(String[] args) {
		EmployeeBean employee1 = new EmployeeBean(1001, "Prabhanjan", new BigDecimal(50000), getDob("22/06/1990"));
		EmployeeBean employee2 = new EmployeeBean(1002, "Raj", new BigDecimal(40000), getDob("22/06/1993"));
		Map<EmployeeBean, String> map = new ConcurrentHashMap<EmployeeBean, String>();
		map.put(employee1, "IT");
		map.put(employee2, "Finance");
		employee1.getDob().setTime(8988878787L);
		Set<Entry<EmployeeBean, String>> entrySet = map.entrySet();
		for (Entry<EmployeeBean, String> entry : entrySet) {
			System.out.println(entry);
		}

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
