package com.kkuk.ch08.part01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape shape = new Shape(); 인터페이스 객체(인스턴스) 생성 안됨
		
		
		Shape shape = new Rectangle(); // 일종의 업캐스팅
		shape = new Triangle(); //사각형 넣었다가 삼각형으로 바꿔치기 업캐스팅
		shape.getArea();
		shape.getColor();
		Draw draw;
		draw = new Triangle();
		draw.drawPen();
		draw.drawShape();
		
		Triangle triangle = new Triangle();
		triangle.drawPen();
		triangle.getArea();
		// 다중 구현 
}
}