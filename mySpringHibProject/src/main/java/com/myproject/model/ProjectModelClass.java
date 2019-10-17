package com.myproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProjectModelClass {

	
	@Id
	@Column(name = "serialnumber")
	int serialNumber;
	
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Column(name="brandname")
	String brandName;
	
	@Column(name="sizeCol")
	int size;
	
	
	@Override
    public String toString() {
        return getBrandName()+ " "+getSize();
    }
	
	
	
	
	
}
