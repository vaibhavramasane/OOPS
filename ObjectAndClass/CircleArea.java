/*
10. Find the Area of a Circle
Create a class CircleArea with a 
method findArea that calculates the area given the radius.
*/

import java.util.*;
class CircleArea{
	
	public double findArea(double r){
		
		return 3.14*r*r;
		
	}
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter radius of Circle: ");
		double radius = xyz.nextDouble();
		
		CircleArea obj = new CircleArea();
		System.out.println(obj.findArea(radius));
	}
}

		