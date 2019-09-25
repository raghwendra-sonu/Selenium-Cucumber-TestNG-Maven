package ApplicationPages;

import WebConnector.webconnector;

public class Blogpage {
	webconnector wc=new webconnector();

	public void verifyPageTitle() {
    	try {
    		wc.PerformActionOnElement("RecentPosts_BlogPage","WaitForElementDisplay","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}