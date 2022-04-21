package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		br.launchBrowser("chrome");
		br.launchUrl("www.amazon.com");
		String title = br.getPageTitle();
		System.out.println(title);
		if (title.contains("amazon")) {
			System.out.println("Correct title");
		} else {
			System.out.println("Incorrect title");
		}

		System.out.println(br.getPageUrl());
		br.closeBrowser();
	}

}
