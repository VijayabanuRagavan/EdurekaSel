package casestudy;

public class DemoCaseStudy3 {

	public static void main(String[] args) {

		CaseStudy3 cs = new CaseStudy3();

		// Launch browser and Navigate to goindigo website
		// Step 1

		cs.invokeBrowser();
		System.out.println("Website Launched successfully");

		// Click on One way and accept alert
		cs.clickOneWay();
		System.out.println("End of Alert Handling");

		// Search Flight
		cs.searchOneWayFlight();
		System.out.println("OneWay Flight search completed successfully");
		
			//Close Browser after search
		cs.closeBrowser();
		
	}

}
