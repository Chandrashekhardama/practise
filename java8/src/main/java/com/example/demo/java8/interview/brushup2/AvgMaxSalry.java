package com.example.demo.java8.interview.brushup2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	String name;
	String department;
	Integer slary;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the slary
	 */
	public Integer getSlary() {
		return slary;
	}

	/**
	 * @param slary the slary to set
	 */
	public void setSlary(Integer slary) {
		this.slary = slary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", slary=" + slary + "]";
	}

	public Employee(String name, String department, Integer slary) {
		super();
		this.name = name;
		this.department = department;
		this.slary = slary;
	}

}

public class AvgMaxSalry {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("cd", "DEV", 10000), new Employee("md", "DEV", 500),
				new Employee("hd", "QA", 5000), new Employee("hd", "QA", 500), new Employee("jd", "HR", 500),
				new Employee("kd", "HR", 500));

		Map<String, Double> collect = emps.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getSlary)));

		List<Employee> collect2 = emps.stream().filter(w -> w.getSlary() > collect.get(w.getDepartment()))
				.collect(Collectors.toList());
		System.out.println(collect2);
	}

}
