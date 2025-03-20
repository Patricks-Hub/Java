//Cat Class  

/**  
* Patrick Foy - pjfoy  
* CIS171 - 20390
* Feb 14, 2025  
*/

// It was mentioned in the video about wanting to know how to collapse all
// To collapse all methods right click bar next to numbers
// go to folding click collapse all

package Cat_Model;

import java.text.DecimalFormat;

public class CatModificationFoy {

	private String name;
	private int age;
	private double weight;
	private boolean isFixed;
	private boolean isAlive;

	// Default constructor
	public CatModificationFoy() {
		this.name = "NO name";
		this.age = 0;
		this.weight = 0.0;
		this.isFixed = false;
		this.isAlive =true;
	}

	// Non Default constructor
	public CatModificationFoy(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.isFixed = false;
		this.isAlive =true;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
 	public void eat() {
 		double weightGainRate = Math.random();
		weight += weightGainRate;
	}

	public void eat(double amount) {
		weight += amount;
	}

	public void play() {
		double activityRate = Math.random();
		weight -= activityRate;
	}
	
	public boolean isFixed() {
		return isFixed;
	}

	public void updateFixed() {
		isFixed = true;
	}
	
	public boolean isAlive() {
		return isAlive;
	}

	public void updateisAlive() {
		isAlive = false;
	}
	
	public void printInfo() {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("My cat is named: " + name + ".");
		System.out.println("My cats's age is: " + age + " years old.");
 		System.out.println("My cats's weight is: "   + df.format(weight) + " lbs.");
 		System.out.println("My cats's is fixed: "   + isFixed);
 		System.out.println("This cat is alive: "   + isAlive);
 		System.out.println("-----------");
	}
}

