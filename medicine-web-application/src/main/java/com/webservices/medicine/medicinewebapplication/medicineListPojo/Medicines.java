package com.webservices.medicine.medicinewebapplication.medicineListPojo;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Medicines")
public class Medicines {
	
	@Id
	private int id;
	private String medicineName;
	private String description;
	private Date targetDate;
	private boolean deliverable;
	private int[][] tempValues;
	private boolean orderRequest;
	private int currentTemp;
	private  int setTemp;
	private int maxTemp;
	private int minTemp;
	
	protected Medicines() {
		
	}
//	
//	{"medicineName":"Medicago Covifenz","description":"Corona","targetDate":"2023-06-08T22:31:54.492+00:00","deliverable":true,
//		 "tempValues":[[12,12],[1,11],[2,13],[3,13]                                                                                                                                                       ,[4,15],[5,20],[6,12]
//		,[7,14],[8,12],[9,10]],"orderRequest":false}
//	
	public Medicines(int id, String medicineName, String description, Date targetDate, boolean isDeliverable,
			int[][] tempValues, boolean orderRequest, int currentTemp, int setTemp, int maxTemp, int minTemp) {
		super();
		this.id = id;
		this.medicineName = medicineName;
		this.description = description;
		this.targetDate = targetDate;
		this.deliverable = isDeliverable;
		this.tempValues = tempValues;
		this.orderRequest = orderRequest;
		this.currentTemp = currentTemp;
		this.setTemp = setTemp;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDeliverable() {
		return deliverable;
	}
	public void setDeliverable(boolean isDeliverable) {
		this.deliverable = isDeliverable;
	}
	
	public int[][] getTempValues() {
		return tempValues;
	}

	public void setTempValues(int[][] tempValues) {
		this.tempValues = tempValues;
	}

	public boolean getOrderRequest() {
		return orderRequest;
	}

	public void setOrderRequest(boolean orderRequest) {
		this.orderRequest = orderRequest;
	}

	public int getCurrentTemp() {
		return currentTemp;
	}
	public void setCurrentTemp(int currentTemp) {
		this.currentTemp = currentTemp;
	}
	public int getSetTemp() {
		return setTemp;
	}
	public void setSetTemp(int setTemp) {
		this.setTemp = setTemp;
	}
	
	public int getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}
	public int getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(int minTemp) {
		this.minTemp = minTemp;
	}
	@Override
	public String toString() {
		return "Medicines [id=" + id + ", medicineName=" + medicineName + ", description=" + description
				+ ", targetDate=" + targetDate + ", deliverable=" + deliverable + ", tempValues="
				+ Arrays.toString(tempValues) + ", orderRequest=" + orderRequest + ", currentTemp=" + currentTemp
				+ ", setTemp=" + setTemp + ", maxTemp=" + maxTemp + ", minTemp=" + minTemp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(tempValues);
		result = prime * result + Objects.hash(currentTemp, deliverable, description, id, maxTemp, medicineName,
				minTemp, orderRequest, setTemp, targetDate);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicines other = (Medicines) obj;
		return currentTemp == other.currentTemp && deliverable == other.deliverable
				&& Objects.equals(description, other.description) && id == other.id && maxTemp == other.maxTemp
				&& Objects.equals(medicineName, other.medicineName) && minTemp == other.minTemp
				&& orderRequest == other.orderRequest && setTemp == other.setTemp
				&& Objects.equals(targetDate, other.targetDate) && Arrays.deepEquals(tempValues, other.tempValues);
	}
	
	
}
