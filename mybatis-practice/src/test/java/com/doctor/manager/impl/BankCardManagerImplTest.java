package com.doctor.manager.impl;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.doctor.entity.BankCard;
import com.doctor.manager.BankCardManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = { "classpath:mybatisPracticeConfig/spring-context.xml" })
public class BankCardManagerImplTest {

	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Autowired
	@Qualifier("bankCardManager")
	private BankCardManager bankCardManager;

	@Before
	public void init() throws Throwable {
//		String driver = "org.apache.derby.jdbc.EmbeddedDriver";//
//		String dbName = "EmbeddedDB";
//		String dbURL = "jdbc:derby:" + dbName + ";create=true";// create=true表示当数据库不存在时就创建它
//		
//		Class.forName(driver);
//		Connection conn = DriverManager.getConnection(dbURL);// 启动嵌入式数据库
//		Statement st = conn.createStatement();
//
//		st.execute("create table bank_card (card_id int generated by default as identity ,"
//				+ "partner_id int  not null,"
//				+ "bank_code  int not null,"
//				+ "bank_account_no varchar(30) not null)");// 
//
////		st.executeUpdate("insert into foo(fooid,fooname) values (1,'chinajash')");// 插入一条数据
//
//		ResultSet rs = st.executeQuery("select * from bank_card");// 读取刚插入的数据
//		while (rs.next()) {
//			int id = rs.getInt(1);
//			String name = rs.getString(2);
//			System.out.println(id +" :" +  name);
//		}
//		rs.close();
//		st.close();
//		conn.close();
	}
	

	@Test
	public void test_insertBankCard() {
		BankCard bankCard = new BankCard("88s","ss","bb","dd","cc");
		boolean b = bankCardManager.insertBankCard(bankCard );
		assertTrue(b);
	}

	
	@Test
	public void test_queryBankCard(){
		BankCard bankCard = bankCardManager.queryBankCard(1L);
		System.out.println(bankCard);
	}
	
	@Test
	public void test_queryBankCard2(){
		BankCard bankCard = bankCardManager.queryBankCard2(1L);
		System.out.println(bankCard);
	}
}
