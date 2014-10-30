package com.baobaotao.reflect;

public class Car {
	private String brand;
	private String color;
	private int maxSpeed;
	public Car(){}
	
	
	public Car(String brand,String color,int maxSp){
		this.brand=brand;
		this.color=color;
		this.maxSpeed=maxSp;
	}
	
	public void introduce(){
		System.out.print("brand:"+brand+";color:"+color+";maxSpeed:"+maxSpeed);
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
