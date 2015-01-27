import java.util.Scanner;


public class HealthInfo {
	private String name;                           // = "Caleb";
	private int age;                        	   // = 999;
	private double temperature = 98.6;
	private double bloodAlcContent = 0.0;
	private int heartrateBPM = 130;           //patient heart rate in beats per minute
	private int cholesterol = 100;
	private int glucose = 100;

	
	/*
	 * DEFAULT CTOR
	 * "Health Card" which tracks user information, as well as current medical information
	 */
	public HealthInfo(double temperature, double bloodAlcContent,  int heartrateBPM, int cholesterol, int glucose, Scanner scan){
		this.setName(scan);
		this.setAge(scan);
		
		//set arbitrary initial values and randomize over time
		this.temperature = temperature;
		//this.setTemperature(temperature);
		this.bloodAlcContent = bloodAlcContent;
		this.heartrateBPM = heartrateBPM;
		this.cholesterol = cholesterol;
		this.glucose = glucose;
	}
	
	/**
	 * @return the name
	 */
	
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(Scanner scan) {
		System.out.print("Enter Patient Name: ");
		String name = scan.next();
		
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param scan 
	 * @param age the age to set
	 */
	public void setAge(Scanner scan) {
		System.out.print("Enter age: " ); 
		int age = scan.nextInt();
		
		this.age = age;
	}
	/**
	 * @return the temperature
	 */
	public double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(){
		this.temperature = RandomizeData.randomizeTemperature();
	}

	/**
	 * @return the bloodAlcContent
	 */
	public double getBloodAlcContent() {
		return bloodAlcContent;
	}

	/**
	 * @param bloodAlcContent the bloodAlcContent to set
	 */
	public void setBloodAlcContent() {
		this.bloodAlcContent = RandomizeData.randomizeBAC();
	}

	/**
	 * @return the heartrateBPM
	 */
	public int getHeartrateBPM() {
		return heartrateBPM;
	}
	/**
	 * @param heartrateBPM the heartrateBPM to set
	 */
	public void setHeartrateBPM() {
		this.heartrateBPM = RandomizeData.randomizeHeartRate();
	}
	/**
	 * @return the cholesterol
	 */
	public double getCholesterol() {
		return cholesterol;
	}
	/**
	 * @param cholesterol the cholesterol to set
	 */
	public void setCholesterol() {
		this.cholesterol = RandomizeData.randomizeCholesterol();
	}
	/**
	 * @return the glucose
	 */
	public double getGlucose() {
		return glucose;
	}
	/**
	 * @param glucose the glucose to set
	 */
	public void setGlucose() {
		this.glucose = RandomizeData.randomizeGlucose();
	}
}
