package base;

import java.lang.Math;

public class Triangle extends GeometricObject{
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 3.0;
	
	/**construct a default triangle*/
	public Triangle()
	{
		
	}
	
	/**construct a triangle with length of sides*/
	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/**getter for length of sides*/
	public double get_side1()
	{
		return this.side1;
	}
	
	public double get_side2()
	{
		return this.side2;
	}
	
	public double get_side3()
	{
		return this.side3;
	}
	
	/**returns the area of the triangle*/
	@Override
	public double getArea()
	{
		double a = this.side1;
		double b = this.side2;
		double c = this.side3;
		double p = (a + b + c) / 2.0;
		double ssq = p * (p - a) * (p - b) * (p - c);
		return Math.sqrt(ssq);
	}
	
	/**returns the perimeter of the triangle*/
	@Override
	public double getPerimeter()
	{	
		return this.side1 + this.side2 + this.side3;
	}
	
	
	@Override
	public String toString()
	{
		return "side1 :" + side1 + "\nside2: " + side2 + "\nside3: "
		+ side3;
	}

}
