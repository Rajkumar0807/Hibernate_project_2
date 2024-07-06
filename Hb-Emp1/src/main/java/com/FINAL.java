package com;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class FINAL{
	public static void main(String[]args) {
		Transaction tr=null;
		try (Session ses=HbUtil.getSesFactory().openSession()){
			tr=ses.beginTransaction();
			Emp e1=new Emp("subi");
			RegEmp e2=new RegEmp(500,"sales","Sureh");
			Trainee e3=new Trainee(200,"6-months","kum");
			
			
			ses.persist(e1); ses.persist(e2); ses.persist(e3);
			
			tr.commit();
			ses.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
