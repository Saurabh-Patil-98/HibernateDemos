package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "fruits")
public class Fruits {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "Fruit_Nm")
	private String fruitNm;
	@Column(name = "Fruit_Prz")
	private int fruitPrz;
	@Column(name = "Qnty")
	private int quantity;
	@Column(name = "D_City")
	private String dcity;
	
	public Fruits() {
	
	}
	

	public Fruits(int id, String fruitNm, int fruitPrz, int quantity, String dcity) {
		
		this.id = id;
		this.fruitNm = fruitNm;
		this.fruitPrz = fruitPrz;
		this.quantity = quantity;
		this.dcity = dcity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFruitNm() {
		return fruitNm;
	}

	public void setFruitNm(String fruitNm) {
		this.fruitNm = fruitNm;
	}

	public int getFruitPrz() {
		return fruitPrz;
	}

	public void setFruitPrz(int fruitPrz) {
		this.fruitPrz = fruitPrz;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDcity() {
		return dcity;
	}

	public void setDcity(String dcity) {
		this.dcity = dcity;
	}

	@Override
	public String toString() {
		return "Fruits [id=" + id + ", fruitNm=" + fruitNm + ", fruitPrz=" + fruitPrz + ", quantity=" + quantity
				+ ", dcity=" + dcity + "]";
	}
	
	
}
