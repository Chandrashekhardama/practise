package com.example.demo.java8.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountInSentence {
	public static void main(String[] args) {
		String sentence = "Java is fun and Java is powerful";

		Map<String, Long> wordCounts = Arrays.stream(sentence.split(" "))
				.collect(Collectors.groupingBy(w->w, Collectors.counting()));
		System.out.println(wordCounts); //{Java=2, powerful=1, and=1, is=2, fun=1}

	}

}
