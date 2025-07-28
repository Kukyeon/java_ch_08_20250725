package com.kkuk.ch08.part02.cast;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver dirver = new Driver();
		
		Bus bus = new Bus();
		Truck truck = new Truck();
		
		dirver.carDrive(bus);
		dirver.carDrive(truck);
		
		
	}

}
