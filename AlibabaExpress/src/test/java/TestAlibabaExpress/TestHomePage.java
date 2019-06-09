package TestAlibabaExpress;

import AlibabaExpress.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.MobileAPI.ad;
import static java.lang.Thread.sleep;

public class TestHomePage {

    HomePage homepage = PageFactory.initElements(ad, HomePage.class);
    @Test
    public void enterMainPage() throws InterruptedException { homepage.getSearchBox();
        sleep(1000);}

    @Test
    public void testMenu() throws InterruptedException { homepage.getCoupon();
        sleep(1000);}

}
