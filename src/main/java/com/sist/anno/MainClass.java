package com.sist.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.sist.dao.EmpDAO;
import com.sist.dao.EmpVO;

import java.util.*;
/*
 * 	Dao
 * 	a()	Dao
 * 	b()
 * 	c()
 * 
 * */
/*@Component
//mainClass(���̵� ��jƮ�� ����. �ҹ���)
*/public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getBean("dao");
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		EmpDAO dao=(EmpDAO)app.getBean("empDAO");
	/*	List<EmpVO> list=dao.empAllData();
		for(EmpVO vo:list){
			System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+" "+vo.getSal()+" "+vo.getHiredate()+" ");
		}*/
	EmpVO vo1=new EmpVO();
	vo1.setEname("ȫ�浿");
	vo1.setJob("�븮");
	vo1.setSal(3000);
	dao.empInsert(vo1);
	
		List<EmpVO> list=dao.empAllData();
	for(EmpVO vo:list){
		System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+" "+vo.getSal()+" "+vo.getHiredate()+" ");
	}
	}

}
