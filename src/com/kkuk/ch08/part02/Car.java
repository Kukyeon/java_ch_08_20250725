package com.kkuk.ch08.part02;

public class Car {

	Tire forntLeftTire = new HankookTire(); // UP캐스팅
	Tire forntRightTire = new HankookTire(); //
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	public void run(){
		forntLeftTire.roll();
		forntRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
	
}
