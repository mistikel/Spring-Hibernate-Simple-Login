package com.bee.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bee.model.Report;
@Repository("reportDao")
public class ReportDaoImpl implements ReportDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addReport(Report report) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Report> listReport() {
		System.out.println("DAO");
		return (List<Report>) sessionFactory.getCurrentSession().createCriteria(Report.class).list();
	}

	@Override
	public Report getReport(int id) {
		
		return null;
	}

	@Override
	public void deleteReport(Report report) {
		// TODO Auto-generated method stub
		
	}

}
