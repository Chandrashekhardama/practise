package alearning;

import java.util.ArrayList;
import java.util.List;

public class Test {

//	Aman - 80
//	Ajay - 70
//	Anuj - 80
//	Amit - 70
//	Anirudh - 60
//	Arav - 70
//	List<Student> studentList -- return student names based on marks

	public static void countNumOfStudentsWithMarks(List<Student> studentList) {

//		Map<Integer, Integer> marksMap =  new HashMap<>();
//		 		
//		for (Student std : studentList) {
//			marksMap.put(std.marks, );
//		}

		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(12);
		numList.add(20);
		numList.add(15);
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < numList.size() - 1; i++) {
			if (largest < numList.get(i)) {
				largest = numList.get(i);
			}
		}
		System.out.println(largest);//20

	}

}
