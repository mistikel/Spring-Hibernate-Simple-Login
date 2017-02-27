package com.bee.service;

import java.util.List;

import com.bee.model.Report;

public interface ReportService {
	public void addReport(Report report);

	public List<Report> listReport();
	
	public Report getReport(int id);
	
	public void deleteReport(Report report);
}
