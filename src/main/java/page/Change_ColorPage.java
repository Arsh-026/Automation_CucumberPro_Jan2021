package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Change_ColorPage {
	
	WebDriver driver;
	
	public Change_ColorPage(WebDriver driver) {
		this.driver = driver;
		
	}
		
		@FindBy(how=How.CSS, using = "button[onclick='myFunctionSky()']") WebElement SKYBLUE_BACKGROUND_BUTTON;
		@FindBy(how=How.CSS, using = "body[style='background-color: skyblue;']") WebElement CHANGED_TO_SKYBLUE_BACKGROUND;
		@FindBy(how=How.CSS, using = "button[onclick='myFunctionWhite()']") WebElement WHITE_BACKGROUND_BUTTON;
		@FindBy(how=How.CSS, using = "body[style='background-color: white;']") WebElement CHANGED_TO_WHITE_BACKGROUND;
		
		public void clickOnSkyBlueButton() {
			SKYBLUE_BACKGROUND_BUTTON.click();
		}
		
		public String buttonExists() {
			try {
				String blue = SKYBLUE_BACKGROUND_BUTTON.getText();
				System.out.println(blue);
				
			}catch(Exception e) {
				
				e.printStackTrace();
				System.out.println("button not found");
			}
			
			String blue = SKYBLUE_BACKGROUND_BUTTON.getText();
			System.out.println(blue);
			return blue;
		}
		
		public void changedBlueBackground() {
			
		}

		public void clickOnWhiteButton() {
			WHITE_BACKGROUND_BUTTON.click();
		}
		
		public String theButtonExists() {
			String white = WHITE_BACKGROUND_BUTTON.getText();
			return white;
		}
		
		public void changedWhiteBackground() {
			
			
		}
		
			
		
	}



