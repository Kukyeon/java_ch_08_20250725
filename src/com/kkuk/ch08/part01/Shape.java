package com.kkuk.ch08.part01;

public interface Shape {
	// 인터페이스 내에서는 상수만 선언 가능
	public static final double SALE_RATE = 0.2;
			
	
	public abstract void getArea(); // 추상 메소드만 선언 가능, abstract 생략가능
	public abstract String getColor(); // 추상 메소소소오오드 abstract 생략가능
	
	//생성자 생성 불가;; 쉽지않네 -> 메모리에 객체 생성(인스턴스 생성) 불가!
	
}
