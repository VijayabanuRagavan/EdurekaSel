package casestudy;

public class DemoCaseStudy4 {

	public static void main(String[] args) {
		
			CaseStudy4 cs = new CaseStudy4();
			
			//Launch browser and Navigate to Edureka website and Log In
			//Step 1
			cs.invokeBrowser();
			System.out.println("Website Launched successfully");
			cs.logIn();
			
			//Step 2 : Navigate to My Profile
			cs.mouseHover();
			System.out.println("Navigated to My Profile successfully");
			
			//step 3: Update professional and personal details and 
			//step 4 : Explore the blogs and Navigate to Main page
			
			cs.navigateThruProfile();
			System.out.println("Navigation completed");
					
			//step 5: Logout of the portal and close browser
			cs.logOut();
			System.out.println("Logout completed");
			//cs.closeBrowser();
			

	}

}
