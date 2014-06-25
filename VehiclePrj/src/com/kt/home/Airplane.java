//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Template
//  @ File Name : Airplane.java
//  @ Date : 2014-04-16
//  @ Author : 
//
//



package com.kt.home;


public class Airplane extends Vehicle {
	public int costPerDistance;
	public void setDistance(int distance) {
		super.setDistance(distance);
		if(distance < 100) {
			costPerDistance = 10;
		}else if(distance >= 100 && distance <200) {
			costPerDistance = 9;
		}else {
			costPerDistance = 8;
		}
	}
	
	protected int cost() {
		return getDistance()*costPerDistance;
	}
}