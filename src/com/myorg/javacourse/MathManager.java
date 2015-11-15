package com.myorg.javacourse;

public class MathManager {
	
	static int radius, base, exp, hypotenuse, angleB;
	
	public MathManager(int radiusVal, int baseVal, int expVal, int angleBVal, int hypotenuseVal){
	
		radius = radiusVal;
		base = baseVal;
		exp = expVal;
		hypotenuse = hypotenuseVal;
		angleB = angleBVal;
		
	}
	
	private static double calcCircleArea(){
		
		return radius*radius*Math.PI;	
	}
	
	private static double lengthOfOppositeTriangle(){
		
		return Math.sin(Math.toRadians(angleB))*hypotenuse;
	}
	
	private static double calcPower(){
		
		return Math.pow(base, exp);
	}
	
	public static String getResults(){
		
		String line1 = new String("Calculation 1 : The area of circle with radius " + radius + " is : " + MathManager.calcCircleArea() + " square-cm");
		String line2 = new String("Calculation 2 : Length of opposite where angle B is " + angleB + " degrees and hypotenuse length is " + hypotenuse + " cm is: " + MathManager.lengthOfOppositeTriangle() + " cm");
		String line3 = new String("Calculation 3 : Power of " + base + " with exp of " + exp + " is: " + MathManager.calcPower());
		
		String resultStr = line1 + "<br><br>" + line2 + "<br><br>" + line3;
		
		return resultStr;
	}
	
	

}
