package giftcard;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListnerUtility;
import objectrepository.HomePgae;

@Listeners(ListnerUtility.class)
public class TC_DWS_003_Test extends BaseClass {
	@Test
	public void clickOnGiftcard() throws EncryptedDocumentException, IOException {
		hp = new HomePgae(driver);
		Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("GiftCards", 1, 0),"Gift cards is not displayed");
		test.log(Status.PASS, "Gift card is displayed");
	}
}
