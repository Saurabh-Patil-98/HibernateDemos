package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ClientDetails")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int clId;
	@Column(name="name")
	private String clNm;
	@Column(name="city")
	private String city;
	@Column(name="qulification")
	private String qulifications;
	
	public Client() {
		
	}

	public Client( String clNm, String city, String qulifications) {
		
		//this.clId = clId;
		this.clNm = clNm;
		this.city = city;
		this.qulifications = qulifications ;
	}

	public int getClId() {
		return clId;
	}

	public void setClId(int clId) {
		this.clId = clId;
	}

	public String getClNm() {
		return clNm;
	}

	public void setClNm(String clNm) {
		this.clNm = clNm;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getqulifications() {
		return qulifications;
	}

	public void setQulification(String qulifications) {
		this.qulifications = qulifications ;
	}

	@Override
	public String toString() {
		return "Client [clId=" + clId + ", clNm=" + clNm + ", city=" + city + ", qulifications=" + qulifications + "]";
	}
	
	
	
}
