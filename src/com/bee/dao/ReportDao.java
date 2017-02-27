package com.bee.dao;

import java.util.List;

import com.bee.model.Report;

public interface ReportDao {
	public void addReport(Report report);

	public List<Report> listReport();
	
	public Report getReport(int id);
	
	public void deleteReport(Report report);
}
