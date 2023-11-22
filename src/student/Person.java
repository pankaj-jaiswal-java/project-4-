package student;

import java.util.Scanner;

public class Person {
	private final long adharno;
	private String name;
	private double height;
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your Adhar no : ");
		adharno = sc.nextLong();
	}
	
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public long getAdharno() {
		return adharno;
	}

	@Override
	public String toString() {
		return "\n Adhar Number = " + adharno + 
				"\n Name        = " + name + 
				"\n Height      = " + height;
	}

	
}
