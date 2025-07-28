package com.kkuk.ch08.part02.cast;

public class Bus implements Vehicle {

	@Override
	public void run() { // 인터페이스의 추상메소드 오버라이딩
		// TODO Auto-generated method stub
		System.out.println("버어어어어스으으으 고이이이잉");
	}
	
	public void checkFare() { // 버스 클레스에만 적용/존재하는 메소드
		System.out.println("승차 요금을 첵크합니다.");
	}
	
}
