import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VideoCardsResultPage{
	private WebDriver driver = new FirefoxDriver();
	private ArrayList<WebElement> videoCardDetailsLinks;
	private ArrayList<WebElement> videoCardPurchseButtons;

	public void GetVideoCard(int numberOfvideoCardPurchseButton) {
		videoCardPurchseButtons.get(numberOfvideoCardPurchseButton).click();
	}

	public void ExploreViderCard(int numberOfvideoCardDetailsLink) {
		videoCardDetailsLinks.get(numberOfvideoCardDetailsLink).click();
	}

	public ArrayList<WebElement> getVideoCardDetailsLinks() {
		return videoCardDetailsLinks;
	}

	public void setVideoCardDetailsLinks(
			ArrayList<WebElement> videoCardDetailsLinks) {
		for (int i = 0; i < 10; i++) {
			videoCardDetailsLinks.add(driver.findElements(
					By.cssSelector(".gtile-i-title>a")).get(i));
		}
		this.videoCardDetailsLinks = videoCardDetailsLinks;
	}

	public ArrayList<WebElement> getVideoCardPurchseButtons() {
		return videoCardPurchseButtons;
	}

	public void setVideoCardPurchseButtons(
			ArrayList<WebElement> videoCardPurchseButtons) {
		for (int i = 0; i < 10; i++) {
			videoCardPurchseButtons.add(driver.findElements(
					By.cssSelector(".ibutton-css-green")).get(i));
		}
		this.videoCardPurchseButtons = videoCardPurchseButtons;
	}

}
