package com.ict.ex01;

public class OracleDAO implements DAO
{
	public OracleDAO()
	{
		System.out.println("오라클 생성자");
	}
	@Override
	public void prn() 
	{
		System.out.println("오라클 실행 메소드");
		
	}
}
