package com.cotoarba.tutorials.strategy;

/**
 * Model class used to illustrate the strategy pattern
 */
public class Employee {

	private final String name;
	private Double salary;

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
