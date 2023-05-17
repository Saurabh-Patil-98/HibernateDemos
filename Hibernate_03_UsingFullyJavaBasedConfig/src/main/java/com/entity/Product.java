package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "Prd_Name")
	private String prdNm;
	@Column(name = "Prd_Prz")
	private int prdPrz;
	@Column(name = "Color")
	private String color;
	@Column(name = "Size")
	private int size;
	
	public Product() {
	
	}

	public Product(String prdNm, int prdPrz, String color, int size) {
		
		this.prdNm = prdNm;
		this.prdPrz = prdPrz;
		this.color = color;
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrdNm() {
		return prdNm;
	}

	public void setPrdNm(String prdNm) {
		this.prdNm = prdNm;
	}

	public int getPrdPrz() {
		return prdPrz;
	}

	public void setPrdPrz(int prdPrz) {
		this.prdPrz = prdPrz;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", prdNm=" + prdNm + ", prdPrz=" + prdPrz + ", color=" + color + ", size=" + size
				+ "]";
	}

	
}



	