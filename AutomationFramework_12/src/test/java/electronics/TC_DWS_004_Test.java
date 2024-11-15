package electronics;

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
public class TC_DWS_004_Test extends BaseClass {
	
	@Test
	public void clickOnElectronics() throws EncryptedDocumentException, IOException {
		hp = new HomePgae(driver);
		Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Electronics", 1, 0),"Electronics should not be displayed");
		test.log(Status.PASS, "Electronics page is displayed");
	}

}
