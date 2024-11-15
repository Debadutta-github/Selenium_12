package books;

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
public class TC_DWS_001_Test extends BaseClass {

	@Test
	public void clickOnBooks() throws EncryptedDocumentException, IOException {
		hp = new HomePgae(driver);
		hp.getBooksLink().click();
		Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Books", 1, 0),
				"Books page is not displayed");
		test.log(Status.FAIL, "Books page is displayed");
	}
}
