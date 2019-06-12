package TestAlibabaExpress;

import AlibabaExpress.HomePage;
import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.MobileAPI.ad;
import static java.lang.Thread.sleep;

public class TestHomePage extends MobileAPI {

    HomePage homepage = PageFactory.initElements(ad, HomePage.class);



    @Test
    public void testCategories() throws InterruptedException { homepage.getCategories();
        sleep(1000);}

    @Test
    public void testBrands() throws InterruptedException { homepage.getBrands();
        sleep(1000);}

    @Test
    public void testCart() throws InterruptedException { homepage.getCartContents();
        sleep(1000);}

    @Test
    public void testMenu() throws InterruptedException { homepage.getCoupon();
        sleep(1000);}

}
