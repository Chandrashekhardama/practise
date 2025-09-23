package com.example.demo.java8.interview.brushup;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	String name;
	String dep;
	Integer Salary;

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
	 * @return the dep
	 */
	public String getDep() {
		return dep;
	}

	/**
	 * @param dep the dep to set
	 */
	public void setDep(String dep) {
		this.dep = dep;
	}

	/**
	 * @return the salary
	 */
	public Integer getSalary() {
		return Salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Integer salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dep=" + dep + ", Salary=" + Salary + "]";
	}

	public Employee(String name, String dep, Integer salary) {
		super();
		this.name = name;
		this.dep = dep;
		Salary = salary;
	}

}

public class AvgSalaryMax {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("cd", "IT", 9000), new Employee("gd", "IT", 6000),
				new Employee("bd", "HR", 4000), new Employee("hh", "sales", 50000));

		Map<String, Double> depAvg = list.stream()
				.collect(Collectors.groupingBy(Employee::getDep, Collectors.averagingInt(Employee::getSalary)));

		List<Employee> collect2 = list.stream().filter(e -> e.getSalary() > depAvg.get(e.getDep()))
				.collect(Collectors.toList());

		collect2.forEach(System.out::println);
	}
}
