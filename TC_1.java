package module_9.testCases;

import module_9.objectRepo.HomePageOR;
import module_9.objectRepo.TestingFormPageOR;
import module_9.utilities.BaseClass;

public class TC_1 extends BaseClass {
	public static void main (String[]args) {
openBrowser("Chrome");
openAUT();

 HomePageOR hor= new HomePageOR();
   //  hor.clickTestingFormPage();
    // hor.clickShortWait();
    
    TestingFormPageOR tfpor=new TestingFormPageOR();
    
    tfpor.formFill("Rahul", "Yadav", "Lucknow", 1);
}
}
