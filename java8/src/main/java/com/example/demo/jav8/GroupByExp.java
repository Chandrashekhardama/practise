package com.example.demo.jav8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
	String name;
	Integer marks;
	String dep;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", dep=" + dep + "]";
	}

	public Student(String name, Integer marks, String dep) {
		super();
		this.name = name;
		this.marks = marks;
		this.dep = dep;
	}

}

public class GroupByExp {
	public static void main(String[] args) {
		List<Student> stdList = Arrays.asList(
				new Student("cd", 90, "ME"),
				new Student("dama", 80,"EC"),
				new Student("he",80,"EC"),
				new Student("bd",70,"ME")
				);

				Map<String, List<Student>> mapGrp = stdList.stream()
															.collect(Collectors.groupingBy(emp -> emp.getDep()));

				mapGrp.forEach((dep, empList) -> {
					System.out.println(dep);
					empList.forEach(System.out::println);
				});
			}
}
