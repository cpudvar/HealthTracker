/*
Lead Programmer: Caleb Pudvar

Changelog: 1/1/2015 - initial health info design and testing;
		   1/5/2015 - restructure object assignments, prep csv generation and research medical data
		   1/6/2015 - randomize layout, modified health card CTOR to accept user input
		   1/17/2015 - exported to github, further updates will be detailed in commits and changelog

*/

import java.util.Scanner;

public class main {
	
	//TODO write up a full readme
	
	public static void execute(){
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
		
		for(int i=0; i<100; i++){
			//write current data
			//randomize
			User1.setTemperature();
			User1.setBloodAlcContent();
			System.out.println();
		}
		
		//generateCsvFile(System.getProperty("user.home") + "test.csv");
		//generateCsvFile("E:\Programming\workspace\MedPing2.0\data"); 
		
	}

	public static void main(String[] args) {
		execute();
	}

}
