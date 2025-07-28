package com.kkuk.ch08.part02;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.run();
		
		car.forntLeftTire = new KumhoTire(); 
		car.forntRightTire = new KumhoTire();
		car.run();
		
	}

}
