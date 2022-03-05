package Coupling;



	public class Prog2 implements WebDriver {

		public void get(String url) {
			System.out.println("Url is "+url);	
		}

		public void getTitle() {
			System.out.println("Get Title");
			
		}

		public void getCurrentUrl() {
			System.out.println("Get URl");
			
		}

		public void close() {
			System.out.println("close ");
			
		}
	}


