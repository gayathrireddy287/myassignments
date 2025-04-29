package week1.day2;

public class Browser {
	public String launchBrowser(String browserName) {
		return(browserName);
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		
		Browser br=new Browser();
		br.launchBrowser("Chrome");
		System.out.println(br.launchBrowser("Chrome"));
		Browser b= new Browser();
		b.loadUrl();
	}
	}
