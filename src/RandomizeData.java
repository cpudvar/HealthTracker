import java.math.BigDecimal;
import java.math.RoundingMode;


public class RandomizeData {
	/*
	public static void randomizeAllData(HealthInfo user){
	
		user.setTemperature(user.randomizeTemperature());
		user.setBloodAlcContent(randomizeBAC(user.getBloodAlcContent()));
		user.setHeartrateBPM(randomizeHeartRate(user.getHeartrateBPM()));
		user.setCholesterol(randomizeCholesterol(user.getCholesterol()));
		user.setGlucose(randomizeGlucose(user.getGlucose()));
	}
	*/
	
	//TODO compare effeciency of math.random vs nextDouble
	public static double randomizeTemperature(){//double temperature){
		//range of temperature between 95F and 105F
		final int minTemp = 95;
		final int maxTemp = 105;

		double temperature = Math.random() * (maxTemp - minTemp) + minTemp;
		temperature = round(temperature, 1);
		System.out.println(temperature);
		
		return temperature;
	}
	
	public static double randomizeBAC(){
		//range of BAC between 0.00 and 0.3 (cutoff where death is possible)
		final double minBAC = 0.00;
		final double maxBAC = 0.30;
		
		double BAC = Math.random() * (maxBAC - minBAC) + minBAC;		
		BAC = round(BAC, 2);
		System.out.println(BAC);
		
		return BAC;
	}
	/*
	public static int randomizeHeartRate(){
		//TODO check this range
		//range of heart rate between 50 and 200
		
		return heartRateBPM;
		
	}
	
	public static int randomizeCholesterol(){
		//TODO break down to HDL, LDL, triglycerides?
		//range of cholesterol between 100 and 300
		
		return cholesterol;
	}
	
	public static int randomizeGlucose(){
		//TODO check if hypoglycemic/normal/diabetic and modify warning ranges accordingly
		//range of glucose between 50 and 250
		
		return glucose;
	}
	*/
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
}
