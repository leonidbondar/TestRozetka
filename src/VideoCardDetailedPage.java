import java.util.ArrayList;

import org.openqa.selenium.WebElement;


public class VideoCardDetailedPage {
	private ArrayList<WebElement> videoCardShortDetails;
	
	public String getGraphicCheapDetails () {
		return videoCardShortDetails.get(0).getText();
	}
	public String getRAMSize () {
		return videoCardShortDetails.get(1).getText();
	}
	public String getMemoryType () {
		return videoCardShortDetails.get(2).getText();
	}
	public String getCoolingSystemDetails () {
		return videoCardShortDetails.get(3).getText();
	}
	public String getBitMemoryBus() {
		return videoCardShortDetails.get(3).getText();
	}
}
