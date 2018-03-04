package com.app.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IEmployeeDao;
import com.app.model.Employee;
@Repository("empDao")
public class EmployeeDaoHibernateImpl implements IEmployeeDao {
	@Autowired
	private SessionFactory factory;
	@Autowired
	private HibernateTemplate template;
	@Override
	public int insertEmployee(Employee emp) {
		Session ses=null;
		Transaction tx=null;
		int id=0;
		try{
			ses=factory.openSession();
			tx=ses.beginTransaction();
			tx.begin();
			id=(int) ses.save(emp);
			tx.commit();
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			if(ses!=null)
				ses.close();
		}
		//return  (int) template.save(emp);
		return id;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployeeRecords() {
		Session ses=null;
		 List<Employee> empList=null;
		try{
			ses=factory.openSession();
			empList=ses.createCriteria(Employee.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(ses!=null)
				ses.close();
		}
		return empList;
		/*List<Employee> empList=template.loadAll(Employee.class);
		return empList;*/
	}
	@Override
	public int deleteEmployee(Integer empId) {
		Session ses=null;
		Transaction tx=null;
		int id=0;
		try{
			ses=factory.openSession();
			tx=ses.beginTransaction();
			tx.begin();
			Query qry=ses.createQuery("delete from "+Employee.class.getName()+" where empId=:eid");
			qry.setParameter("eid", empId);
			id=qry.executeUpdate();
			tx.commit();
		}catch(Exception e){
			tx.rollback();
			System.out.println("Record Not Deleted");
			e.printStackTrace();
		}finally{
			if(ses!=null)
				ses.close();
		}
		/*template.delete("ID", empId);
		System.out.println("Record Not Deleted");
		return template.delete(empId);
		System.out.println("Record Deleted");*/
		return id;
	}

}
