import java.util.Random;


public class RandomizeData {
	/*
	public static void randomizeAllData(Object user){
	
		user.setTemperature(randomizeTemperature(user.getTemperature()));
		user.setBloodAlcContent(randomizeBAC(user.getBloodAlcContent()));
		user.setHeartrateBPM(randomizeHeartRate(user.getHeartrateBPM()));
		user.setCholesterol(randomizeCholesterol(user.getCholesterol()));
		user.setGlucose(randomizeGlucose(user.getGlucose()));
	}
	*/
	public static double randomizeTemperature(){//double temperature){
		//range of temperature between 95F and 105F
		final int minTemp = 95;
		final int maxTemp = 105;
		
		Random r = new Random();
		
		//Math.random() * (upper - lower) + lower;
		double temperature = Math.random() * (maxTemp - minTemp) + minTemp;
		//temperature = r.nextDouble();
		System.out.println(temperature);
		
		return temperature;
	}
	
	public static double randomizeBAC(double BAC){
		//range of BAC between 0.00 and 0.3 (cutoff where death is possible)
		final double minBAC = 0.00;
		final double maxBAC = 0.30;
		
		Random r = new Random();
		BAC = minBAC+(maxBAC - minBAC) * r.nextDouble();
		
		System.out.println(BAC);
		
		return BAC;
	}
	
	public static int randomizeHeartRate(int heartRateBPM){
		//TODO check this range
		//range of heart rate between 50 and 200
		
		return heartRateBPM;
		
	}
	
	public static double randomizeCholesterol(double cholesterol){
		//TODO check cholesterol range
		//range of cholesterol between ??? and ???
		
		return cholesterol;
	}
	
	public static double randomizeGlucose(double glucose){
		//TODO check range of glucose
		//range of glucose between ??? and ???
		
		return glucose;
	}
}
