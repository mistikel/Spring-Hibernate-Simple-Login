package com.bee.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="report")
public class Report implements Serializable {
	private static final long serialVersionUID = -723583058586873479L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="tanggal")
	private Date tanggal;
	
	@Column(name="deskripsi")
	private String deskripsi;
	
	@Column(name="jumlah")
	private Integer jumlah;
	
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
