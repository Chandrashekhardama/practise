package interviewqn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountMarksTest {

	public static void main(String[] args) {
		List<Student> studentlist= Arrays.asList(
				new Student("Aman",70),
				new Student("Om", 80),
				new Student("Hari", 60),
				new Student("Shiv", 70));
		
		Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
		for (Student std : studentlist) {
			map.put(std.marks, map.getOrDefault(std.marks, 0) + 1);
		}
		System.out.println(map);
	}

	static class Student {
		String name;
		Integer marks;

		public Student(String name, Integer marks) {
			this.name = name;
			this.marks = marks;
		}

	}
}
