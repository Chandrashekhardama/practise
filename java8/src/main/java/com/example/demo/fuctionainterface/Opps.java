package com.example.demo.fuctionainterface;

interface A {
	default void add() {
		System.out.println("from A");
	}
}

interface B {
	default void add() {
		System.out.println("from B");
	}
}

class Opps implements A, B {

	@Override
	public void add() {
		A.super.add();
		B.super.add();
	}

	public static void main(String[] args) {
		A a = new Opps();
		a.add();
	}

}
