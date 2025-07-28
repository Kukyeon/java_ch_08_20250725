package com.kkuk.ch08.part01.book;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookService bookService = new BookServiceImpl(); // 구현 클래스
		Scanner scanner = new Scanner(System.in); // 키보드로부터 입력받아주는 클래스
		
		
		while(true) {
			System.out.println("-----도서관리시스템-----");
			System.out.println("1. 도서추가 ");
			System.out.println("2. 도서 목록 조회 ");
			System.out.println("3. 도서 검색 ");
			System.out.println("4. 프로그램 종료 ");
			System.out.println("==================");
			System.out.print("메뉴 선택 :  ");
			scanner.nextInt();// 사용자가 입력한 정수 번호 가져오기
			int choiceNem = scanner.nextInt();
			System.out.println("==================");
			switch(choiceNem) {
			
			case 1:
				
				System.out.println("도서 ID : ");
				int bookId = scanner.nextInt(); 
				scanner.nextLine();
				System.out.println("도서 제목 : ");
				String bookTitle = scanner.nextLine(); // 문자열
				System.out.println("도서 저자 : ");
				String bookAuthor = scanner.nextLine();
				
				Book book = new Book(bookId, bookTitle, bookAuthor);
				bookService.addBook(book); //컬랙션 북 리스트에 책 한권씩 넣어주는것
				System.out.println(" 입력하신 도서가 추가되었습니다  ");
				break;
			case 2:
				
				System.out.println("----- 도서 목록 -----");
				for(Book bookTemp:bookService.getAllBooks()) {
					System.out.println(bookTemp.getTitle() + " / " + bookTemp.getAuthor());
				}
				break;
			case 3:
				
			case 4:
				
				System.out.println(" 도서관리 프로그램을 종료합니다. ");
				scanner.close();
				break;
				
			default :
				System.out.println("잘못된 번호 선택입니다.");
			}
			
		}
	}

}
