package com.example.demo.jav8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {
	String name;
	Integer salary;
	String dep;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", salary=" + salary + ", dep=" + dep + "]";
	}

	public Employee(String name, Integer salary, String dep) {
		super();
		this.name = name;
		this.salary = salary;
		this.dep = dep;
	}

}
public class ParticianByExp {
	
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
				new Employee("cd", 90000, "SDE"),
				new Employee("dama", 80000,"SDE"),
				new Employee("he",50000, "HR"),
				new Employee("bd",40000, "QA")
				);
		Map<Boolean, List<Employee>> mapSlaryPart = empList.stream()
													.collect(Collectors.partitioningBy(emp -> emp.getSalary() > 50000));
		System.out.println("Emp having salary>50000:-----");
		mapSlaryPart.get(true).forEach(System.out::println);
		
		System.out.println("Emp having salary<50000:------");
		mapSlaryPart.get(false).forEach(System.out::println);
		
	}

}
