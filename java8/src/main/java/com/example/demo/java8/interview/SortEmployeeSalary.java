package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employe {
	String name;
	Integer salary;

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

	@Override
	public String toString() {
		return "Employe [name=" + name + ", salary=" + salary + "]";
	}

	public Employe(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class SortEmployeeSalary {

	public static void main(String[] args) {
		List<Employe> emps = Arrays.asList(new Employe("Dama", 5000), new Employe("Chandu", 6000),
				new Employe("Shekahr", 4000));

		List<Employe> collect = emps.stream()
										.sorted(Comparator.comparingInt(e -> e.getSalary()))
										.collect(Collectors.toList());
		collect.forEach(System.out::println);
	}
}
