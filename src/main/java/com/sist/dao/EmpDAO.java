package com.sist.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmpDAO {
	@Autowired //interface���� ������ ������ �����. FOJO ����� Ŭ���� 
	private EmpMapper mapper;
	public List<EmpVO> empAllData(){
		return mapper.empAllData();
	}
	
	public EmpVO empFindData(int empno)
	{
		return mapper.empFindData(empno);
	}
	
	public void empInsert(EmpVO vo){
		mapper.empInsert(vo);
	}
}
