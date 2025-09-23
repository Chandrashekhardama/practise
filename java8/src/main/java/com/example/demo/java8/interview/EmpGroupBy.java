package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp {
	String name;
	String dep;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Employe [name=" + name + ", dep=" + dep + "]";
	}

	public Emp(String name, String dep) {
		super();
		this.name = name;
		this.dep = dep;
	}

}

public class EmpGroupBy {

	public static void main(String[] args) {
		List<Emp> emp = Arrays.asList(new Emp("cd", "IT"), new Emp("md", "Sales"), new Emp("sd", "IT"),
				new Emp("dd", "HR"));

		Map<String, List<Emp>> groupByDep = emp.stream().collect(Collectors.groupingBy(e -> e.getDep()));
		groupByDep.forEach((dep, emps) -> System.out.println(dep + ":" + emps.stream().map(e -> e.getName()).toList()));
//	Sales:[md]
//	HR:[dd]
//	IT:[cd, sd]

//		Map<String, Long> collect = emp.stream().collect(Collectors.groupingBy(e->e.getDep(),Collectors.counting()));
//		System.out.println(collect);//{Sales=1, HR=1, IT=2}

	}

}
