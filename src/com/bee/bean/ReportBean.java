package com.bee.bean;

import java.sql.Date;
import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.sun.istack.internal.NotNull;


public class ReportBean {
	@NotNull
	private Integer id;
	
	@NotNull
	private List<Integer> checkId;
	
	@NotNull
	@NotEmpty(message = "Todak Boleh Kosong")
	@Size(min=4,max=25)
	private Date tanggal;
	
	@NotNull
	@NotEmpty(message = "Todak Boleh Kosong")
	@Size(min=4,max=25)
	private String deskripsi;
	
	@NotNull
	@NotEmpty(message = "Todak Boleh Kosong")
	private Integer jumlah;
	
	public void setCheckId(List<Integer> checkId){
		this.checkId = checkId;
	}
	
	public List<Integer> getCheckId(){
		return this.checkId;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	
	public void setTanggal(Date tanggal){
		this.tanggal = tanggal;
	}
	public Date getTanggal(){
		return this.tanggal;
	}
	
	public void setDeskripsi(String deskripsi){
		this.deskripsi = deskripsi;
	}
	public String getDeskripsi(){
		return this.deskripsi;
	}
	
	public void setJumlah(Integer jumlah){
		this.jumlah = jumlah;
	}
	public Integer getJumlah(){
		return this.jumlah;
	}
}
