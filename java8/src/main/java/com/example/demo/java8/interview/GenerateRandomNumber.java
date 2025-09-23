package com.example.demo.java8.interview;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		List<Double> randomNumbers = Stream.generate(Math::random).limit(5).collect(Collectors.toList());
		System.out.println(randomNumbers);// [0.149748312995991, 0.7989960146232042, 0.6578250473699506,
											// 0.27749370838516696, 0.3841036617274214]

	}
}
