import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class TestDrive {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://hard.rozetka.com.ua/videocards/c80087/");
		
		VideoCardsResultPage page = PageFactory.initElements(driver, VideoCardsResultPage.class);
		
		page.ExploreViderCard(0);
		VideoCard videoCard1 = new VideoCard();
		videoCard1.setParams();
		
		driver.get("http://hard.rozetka.com.ua/videocards/c80087/");
		page.ExploreViderCard(1);
		VideoCard videoCard2 = new VideoCard();
		videoCard2.setParams();
		
		videoCard1.printParams();
		videoCard2.printParams();
	
	}
}
