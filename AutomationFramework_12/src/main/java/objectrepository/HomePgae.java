package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePgae {
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink;
	
	@FindBy(partialLinkText = "ELECTRONIS")
	private WebElement electronisLink;
	
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftCardLink;
	
	public WebElement getGiftCardLink() {
		return giftCardLink;
	}

	public WebElement getElectronisLink() {
		return electronisLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public HomePgae(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
}