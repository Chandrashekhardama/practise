package com.example.demo.java8.interview.brushup;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PatitionByExp {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("cd", "IT", 9000), new Employee("gd", "IT", 6000),
				new Employee("bd", "HR", 4000), new Employee("hh", "sales", 5000));
		Map<Boolean, List<Employee>> collect = list.stream()
				.collect(Collectors.partitioningBy(e -> e.getSalary() >= 5000));
		System.out.println(collect.get(true));
		System.out.println(collect.get(false));
	}
}
