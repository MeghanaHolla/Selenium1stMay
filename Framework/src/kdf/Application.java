package kdf;

import java.io.IOException;

import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {
	@Test 
	public void verifyInvalidLogin() throws IOException {
		String[][] data = GenericMethods.getData("D:\\Sel3Apr\\TestData.xlsx"	, "Sheet2");
		Methods mtd = new Methods();
		for(int i = 1; i< data.length; i++) {
			switch(data[i][3]) {
			case "openApplication":
				mtd.navigateToApplication(data[i][6]);
				break;
			case "enterInTextBox":
				mtd.enterInATextbox(data[i][5], data[i][6]);
				break;
			case "clickButton":
				mtd.clickButton(data[i][5]);
				break;
			case "verifyMessage":
				mtd.getMsgText(data[i][5]);
				break;
			case "closeApplication":
				mtd.closeApplication();
				break;
				
			}
		}
	}

}
