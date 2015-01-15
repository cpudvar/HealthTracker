/*
Lead Programmer: Caleb Pudvar

Changelog: 1/1/2015 - initial health info design and testing;
		   1/5/2015 - restructure object assignments, prep csv generation and research medical data
		   1/6/2015 - randomize layout, modified health card CTOR to accept user input

*/

public class main {
	
	public static void execute(){
		HealthInfo User1 = new HealthInfo(70, 140.2, 0, 65.5, 0);
		//HealthInfo User2 = new HealthInfo(30, 90, 160.8, 0, 80.4, 0);
		
		// TODO Auto-generated method stub
		System.out.println(User1.getName());
		//System.out.println(User2.getTemperature());
		
		/*
		 * simulate each applicable data value
		 * write data to correct csv columns
		 * repeat for 100 (1000) iterations
		 * android emulator?
		 */
		
		//write columns
		
		for(int i=0; i<100; i++){
			//write current data
			//randomize
			User1.setTemperature();
			System.out.println();
		}
		
		//generateCsvFile(System.getProperty("user.home") + "test.csv");
		//generateCsvFile("E:\Programming\workspace\MedPing2.0\data"); 
		
	}

	public static void main(String[] args) {
		execute();
	}

}
