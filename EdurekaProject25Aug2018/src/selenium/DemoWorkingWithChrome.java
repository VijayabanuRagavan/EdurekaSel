package selenium;

public class DemoWorkingWithChrome {

	public static void main(String[] args) {

		WorkingWithChrome wc = new WorkingWithChrome();
		
		wc.invokeBrowser();
		
		String pageTitle = wc.getPageTitle();
		System.out.println("Title of the page:"+pageTitle);
		
		wc.navigateCommands();
		
		wc.closeBrowser();

	}

}
