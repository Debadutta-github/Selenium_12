package computers;

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
public class TC_DWS_002_Test extends BaseClass {
	
	@Test
	public void clickOnComputers() throws EncryptedDocumentException, IOException {
		hp = new HomePgae(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Computers", 1, 0),"Computers page is not displayed");
		test.log(Status.PASS, "Computer page is displayed");
	}

}
