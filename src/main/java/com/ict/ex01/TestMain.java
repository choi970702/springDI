package com.ict.ex01;


public class TestMain 
{
	public static void main(String[] args) 
	{
		// Service service = new Service();
		// service.biz();
	}
	// 생성자를 이용하서나 setter를 이용해서 dao를 지정할 수 있다.
	/*
	 * DAO oracleDAO = new OracleDAO(); Service service = new Service(oracleDAO);
	 * service.biz();
	 */
	
	/*
	DAO dao = null;
	int su = 2 ;
	switch (su)
	{
	case 1: dao = new MySQLDAO(); break;
	case 2 : dao = new OracleDAO(); break;
	}
	// 생성자나 setter를 이용할 수 있다.
	Service service = new Service(dao);
	// service.biz();
	System.out.println("====================================");
	
	Service service2 = new Service();
	service2.setDAO(dao);
	service2.biz();*/
}
