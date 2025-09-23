package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emply {
	String Name;
	String department;
	Integer salary;

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
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
	 * @return the salary
	 */
	public Integer getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Emply(String name, String department, Integer salary) {
		super();
		Name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emply [Name=" + Name + ", department=" + department + ", salary=" + salary + "]";
	}

}

public class HighSalaryMorethenAvg {

	public static void main(String[] args) {
		List<Emply> emps = Arrays.asList(new Emply("cd", "IT", 1000), new Emply("gd", "IT", 90),
				new Emply("hd", "HR", 100), new Emply("td", "Sales", 100), new Emply("wd", "HR", 100));
		Map<String, Double> grpAvg = emps.stream()
				.collect(Collectors.groupingBy(Emply::getDepartment, Collectors.averagingInt(Emply::getSalary)));
		List<Emply> collect = emps.stream().filter(e -> e.getSalary() > grpAvg.get(e.getDepartment()))
				.collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

}
