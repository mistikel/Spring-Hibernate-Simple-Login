package com.bee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bee.dao.ReportDao;
import com.bee.model.Report;
@Service("reportService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ReportServiceImpl implements ReportService {
	@Autowired
	private ReportDao reportDao;
	@Override
	public void addReport(Report report) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Report> listReport() {
		// TODO Auto-generated method stub
		System.out.println("SERVICE");
		return reportDao.listReport();
	}

	@Override
	public Report getReport(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteReport(Report report) {
		// TODO Auto-generated method stub
		
	}

}
