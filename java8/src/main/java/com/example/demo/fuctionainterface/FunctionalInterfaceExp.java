package com.example.demo.fuctionainterface;

@FunctionalInterface
interface AA {
	void show();

}

//class BB implements AA {
//
//	@Override
//	public void show() {
//		System.out.println("from AA");
//	}
//}

public class FunctionalInterfaceExp {

	public static void main(String[] args) {
		// --before java7
//		AA obj = new AA() {
//			public void show() {
//				System.out.println("Hi from show");
//			}
//		};

		// java 8-it jvm will create the implemetaion class along with object of that,
		// defines the method as well as functional interface having only one method which handles "->"
		AA obj = () -> System.out.println("Hi from Show");
		obj.show();
	}
}
