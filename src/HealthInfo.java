import java.util.Scanner;


public class HealthInfo {
	private String name;                           // = "Caleb";
	private int age;                        	   // = 999;
	private static double temperature;             // = 98.6;
	private static double bloodAlcContent;         // = 0.0;
	private static int heartrateBPM;               // = 2000;                 //patient heart rate in beats per minute
	private static double cholesterol;             // = 999.99;
	private static double glucose;                 // = 999.99;

	
	/*
	 * DEFAULT CTOR
	 * "Health Card" which tracks user information, as well as current medical information
	 */
	public HealthInfo(double temperature, double bloodAlcContent,  int heartrateBPM, double cholesterol, double glucose){	
		this.setName();
		this.setAge();
		
		//set arbitrary initial values and randomize over time
		this.temperature = 98.6;
		//this.setTemperature(temperature);
		this.setBloodAlcContent(bloodAlcContent);
		this.setHeartrateBPM(heartrateBPM);
		this.setCholesterol(cholesterol);
		this.setGlucose(glucose);
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
	public void setName() {
		System.out.print("Enter Patient Name: ");
		
		Scanner scan = new Scanner(System.in);
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
	 * @param age the age to set
	 */
	public void setAge() {
		System.out.print("Enter age: " ); 

		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		scan.close();
		
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
	public void setTemperature(){//double temperature) {
		HealthInfo.temperature = RandomizeData.randomizeTemperature();
	}

	/**
	 * @return the bloodAlcContent
	 */
	public static double getBloodAlcContent() {
		return bloodAlcContent;
	}

	/**
	 * @param bloodAlcContent the bloodAlcContent to set
	 */
	public void setBloodAlcContent(double bloodAlcContent) {
		HealthInfo.bloodAlcContent = bloodAlcContent;
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
	public void setHeartrateBPM(int heartrateBPM) {
		HealthInfo.heartrateBPM = heartrateBPM;
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
	public void setCholesterol(double cholesterol) {
		HealthInfo.cholesterol = cholesterol;
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
	public void setGlucose(double glucose) {
		HealthInfo.glucose = glucose;
	}
}
