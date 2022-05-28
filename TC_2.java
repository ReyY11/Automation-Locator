package module_9.testCases;

import org.testng.annotations.Test;

import module_9.objectRepo.HomePageOR;
import module_9.utilities.BaseClass;

public class TC_2 extends BaseClass{
	@Test
		public void systemSetUp() {
			openBrowser("Chrome");
			openAUT();
			HomePageOR hor= new HomePageOR();
			hor.clickLongWait();
			hor.clickKeyBoardOperation();
					
		}
		

	}


