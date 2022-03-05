
	package UtilsLayer;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	import com.BaseLayer.BaseClass;

	public class SelectClassMethods extends BaseClass {

		
		public static void selectDropdownByVisibleText(WebElement wb,String value) {
			new Select(wb).selectByVisibleText(value);
		}

	}



