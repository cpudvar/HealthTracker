/*
Lead Programmer: Caleb Pudvar

Changelog: 1/1/2015 - initial health info design and testing;
		   1/5/2015 - restructure object assignments, prep csv generation and research medical data
		   1/6/2015 - randomize layout, modified health card CTOR to accept user input
		   1/17/2015 - exported to github, further updates will be detailed in commits and changelog

*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
	static String pathName = "C:\\Users\\Caleb\\git\\HealthTracker\\test.csv";
	//System.getProperty("user.home") + "test.csv");
	//TODO write up a full readme

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		HealthInfo User1 = new HealthInfo(70, 140.2, 0, 65, 0, scan);
		//HealthInfo User2 = new HealthInfo(30, 90, 160.8, 0, 80.4, 0);
		
		scan.close();
		
		/*
		 * simulate each applicable data value
		 * write data to correct csv columns
		 * repeat for 100 (1000) iterations
		 * android emulator?
		 */
		
		//write csv columns
		FileWriter writer = new FileWriter(pathName);
		generateCSVColumns(pathName, User1, writer);
		
		for(int i=0; i<100; i++){
			//write current data
			//randomize
			writeCurrentPersonalHealthInfo(User1, writer);
			User1.setTemperature();
			User1.setBloodAlcContent();
			User1.setHeartrateBPM();
			User1.setCholesterol();
			User1.setGlucose();
		} 
		
		writer.flush();
	    writer.close();
	}
	
	private static void generateCSVColumns(String pathName, HealthInfo User, FileWriter writer) {
		// TODO Auto-generated method stub
		try {	
			writer.append("Health information for: " + User.getName());
		    writer.append(',');
		    writer.append("Age: " + User.getAge());
		    writer.append('\n');
		    
			writer.append("Temperature");
		    writer.append(',');
		    writer.append("Blood Alcohol Content");
		    writer.append(',');
		    writer.append("Heart Rate");
		    writer.append(',');
		    writer.append("Cholesterol");
		    writer.append(',');
		    writer.append("Glucose");
		    writer.append('\n');
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void writeCurrentPersonalHealthInfo(HealthInfo User, FileWriter writer){
		try{	 
			writer.append(String.valueOf(User.getTemperature()));
		    writer.append(',');
		    writer.append(String.valueOf(User.getBloodAlcContent()));
		    writer.append(',');
		    writer.append(String.valueOf(User.getHeartrateBPM()));
		    writer.append(',');
		    writer.append(String.valueOf(User.getCholesterol()));
		    writer.append(',');
		    writer.append(String.valueOf(User.getGlucose()));
		    writer.append('\n');
		}
		catch(IOException e)
		{
		     e.printStackTrace();
		} 
	}

}
