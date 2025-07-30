package pac_1;

import org.testng.annotations.Test;

public class contactModule {
	@Test
	public void createContact() {
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		String testcase=System.getProperty("suite");
		System.out.println(browser);
		System.out.println(url);
		System.out.println(testcase);
		System.out.println("Creating contact");
	}
	@Test
	public void modifyingContact() {
		System.out.println("Contact is modified");
	}

}
