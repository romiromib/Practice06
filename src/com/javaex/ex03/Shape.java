package com.javaex.ex03;

public class Shape {
	
	protected String fillColor;//private->protected로 변경
	protected String lineColor;//private->protected로 변경
	
	
	public Shape() { //생성자 추가
		super();
	}

	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}


	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	

	
	
	
	
	
	
	
}

