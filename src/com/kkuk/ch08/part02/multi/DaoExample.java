package com.kkuk.ch08.part02.multi;

public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dbWork(new OracleDao()); // 업캐스팅 -> 다향성
		dbWork(new MySqlDao());
	}

}
