package com.bee.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bee.bean.ReportBean;
import com.bee.model.Report;
import com.bee.service.ReportService;


@Controller
public class ReportController {
	@Autowired
	ReportService reportService;
	
	@RequestMapping("/report")
	public ModelAndView report(@ModelAttribute("command") ReportBean reportBean, 
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("reports",  prepareListofBean(reportService.listReport()));
		System.out.println("CONTROLLER");
		System.out.print(model.toString());
		return new ModelAndView("laporan",model);
	}
	
	private List<ReportBean> prepareListofBean(List<Report> reports){
		List<ReportBean> beans = null;
		if(reports != null && !reports.isEmpty()){
			beans = new ArrayList<ReportBean>();
			ReportBean bean = null;
			for(Report report : reports){
				bean = new ReportBean();
				bean.setDeskripsi(report.getDeskripsi());
				bean.setJumlah(report.getJumlah());
				bean.setId(report.getId());
				bean.setTanggal(report.getTanggal());
				beans.add(bean);
			}
		}
		return beans;
	}
}
