package com.netanel.complex;

public class MyComplex {
	private double real;
	private double imag;

	//
	// Constructor
	//
	public MyComplex() {
		real = 0.0;
		imag = 0.0;
	}
	public MyComplex (double real, double imag)
	{
		this.real = real;
		this.imag = imag;
	}
	
	//
	// Getters
	//
	public double getReal()
	{
		return real;
	}
	
	public double getImag()
	{
		return imag;
	}
	
	//
	// Setters
	//
	public void setReal(double real)
	{
		this.real = real;
	}
	
	public void setImag(double imag)
	{
		this.imag = imag;
	}

	// toString
	public String toString()
	{
		return "(" + real + " + " + imag + "i)";
	}
	
	//
	// Methods
	//
	
	// Sets the complex values
	public void setValue(double real, double imag)
	{
		setReal(real);
		setImag(imag);
	}
	
	// Checks if is real
	public boolean isReal()
	{
		return (imag == 0);
	}
	
	// Checks if is imaginary
	public boolean isImaginary()
	{
		return (imag != 0);
	}
	
	// Checks equality to real/imaginary pair 
	public boolean equals(double real, double imag)
	{
		return (this.real == real && this.imag == imag);
	}
	
	// Checks equality to another complex
	public boolean equals(MyComplex another)
	{
		return (this.real == another.real && this.imag == another.imag);

	}
	
	// Returns the magnitude of this complex number
	public double magnitude()
	{
		return Math.sqrt(real*real + imag*imag);
	}
	
	// Returns the argument of this complex number in radians
	public double argument() {
		return Math.atan2(imag, real);
	}
	
	//  Adds the given MyComplex instance (called right), into this instance and returns this instance
	public MyComplex add(MyComplex right)
	{
		this.setValue(this.real + right.real, this.imag + right.imag);
		return this;
	}
	
	//  Subtract the given MyComplex instance (called right), from this instance and returns this instance
	public MyComplex subtract(MyComplex right)
	{
		this.setValue(this.real - right.real, this.imag - right.imag);
		return this;
	}
	
	// Adds this instance with the given MyComplex instance called right, and returns a new MyComplex instance containing the result
	public MyComplex addNew(MyComplex right)
	{
		return new MyComplex(this.real + right.real, this.imag + right.imag);
	}
	
	// Subtract this instance with the given MyComplex instance called right, and returns a new MyComplex instance containing the result
	public MyComplex subtractNew(MyComplex right)
	{
		return new MyComplex(this.real - right.real, this.imag - right.imag);
	}
	
	// Multiplies this instance with the given MyComplex instance right, and keeps the result in this instance, and returns this instance
	//	(a + bi) * (c + di) = (ac - bd) + (ad + bc)i
	public MyComplex multiply(MyComplex right)
	{
		double a = this.real;
		double b = this.imag;
		double c = right.real;
		double d = right.imag;
		
		this.setValue(a*c - b*d, a*d + b*c);
		return this; 	
	}
	
	// Divides this instance with the given MyComplex instance right, and keeps the result in this instance, and returns this instance\
	// (a + bi) / (c + di) = [(a + bi) * (c – di)] / (c*c + d*d)
	public MyComplex divide(MyComplex right)
	{
		double a = this.real;
		double b = this.imag;
		double c = right.real;
		double d = right.imag;
		
		this.setValue((a*c+b*d)/(c*c+d*d), (b*c-a*d)/(c*c+d*d));
		return this;
	}
	
	// Operates on this instance and returns this instance containing the complex conjugate
	public MyComplex conjugate()
	{
		this.setValue(real, -imag);
		return this;
	}
	
}
