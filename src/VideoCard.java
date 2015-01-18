import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class VideoCard extends TestDrive{
	private String GraphicCheapDetails;
	private String RAMSize;
	private String MemoryType;
	private String CoolingSystemDetails;
	private String BitMemoryBus;

	public void setParams() {
		WebDriver driver = new FirefoxDriver();
		VideoCardDetailedPage page = PageFactory.initElements(driver,
				VideoCardDetailedPage.class);
		
		this.GraphicCheapDetails = page.getGraphicCheapDetails();
		this.RAMSize = page.getRAMSize();
		this.MemoryType = page.getMemoryType();
		this.BitMemoryBus = page.getBitMemoryBus();
	}
	

	public void printParams() {
		System.out.print("GraphicCheapDetails: " + this.GraphicCheapDetails);
		System.out.print("RAMSize: " + this.RAMSize);
		System.out.print("MemoryType: " + this.MemoryType);
		System.out.print("CoolingSystemDetails: " + this.CoolingSystemDetails);
		System.out.println("BitMemoryBus: " + this.BitMemoryBus);
		
	}

}
