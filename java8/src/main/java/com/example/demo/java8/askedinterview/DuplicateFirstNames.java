package com.example.demo.java8.askedinterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person {
	String fname;
	String lname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Person(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + "]";
	}

}

public class DuplicateFirstNames {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("john", "cena"), new Person("john", "abhram"),
				new Person("mick", "hassen"));

		Map<String, Integer> map = new HashMap<>();
		for (Person per : list) {
			map.put(per.getFname(), map.getOrDefault(per.getFname(), 0) + 1);
		}

		System.out.println("Duplicate fname: ");
		for (Person per : list) {
			if (map.get(per.getFname()) > 1) {
				System.out.println(per.getFname() + " " + per.getLname());
			}
		}

	}

}
