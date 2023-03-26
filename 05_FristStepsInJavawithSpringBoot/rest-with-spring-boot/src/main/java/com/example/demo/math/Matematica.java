package com.example.demo.math;

public class Matematica {
	
	public Double sum(Double num1, Double num2){
		return num1 + num2;
	}
	
	public Double sub(Double num1, Double num2){
		return num1 - num2;
	}
	
	public Double div(Double num1, Double num2) {
		return num1 / num2;
	}
	
	public Double multi(Double num1, Double num2) {
		return num1 * num2;
	}
	
	public Double media(Double num1, Double num2){
		
		Double media = ((num1 + num2)/2);
		
		return media;
	}
	
	public Double raiz2(Double num1){
		return Math.sqrt(num1);
	}
}
