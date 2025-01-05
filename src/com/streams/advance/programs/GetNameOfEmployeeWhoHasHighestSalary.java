package com.streams.advance.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Data;

public class GetNameOfEmployeeWhoHasHighestSalary {
	/*
	 * Get employee who has highest salary 
	 */
	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee(101, "Ganesh", 750000.78), new Employee(102, "Sanket", 1000.0),
				new Employee(103, "Avishakar", 13000.0), new Employee(104, "Sandip", 450000.0),
				new Employee(105, "Govind", 900000.98));
		Optional<String> first = emp.stream().sorted((e1, e2) -> Double.compare(e2.getSalay(), e1.getSalay()))
				.map(name -> name.getName()).findFirst();
		System.out.println(first.get());
	}

}

@Data
@AllArgsConstructor
class Employee {
	private Integer id;
	private String name;
	private Double salay;
}