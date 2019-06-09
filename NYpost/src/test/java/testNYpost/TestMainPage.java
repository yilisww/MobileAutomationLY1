package testNYpost;

import common.MobileAPI;
import NYpost.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMainPage extends MobileAPI {
    MainPage mainpage = PageFactory.initElements(ad, MainPage.class);
    @Test
    public void enterMainPage() throws InterruptedException { mainpage.getContinue1();
    sleep(1000);}

    @Test
    public void testMenu() throws InterruptedException { mainpage.getMenu();
    sleep(1000);}

    @Test
    public void testHeadline(){ mainpage.getHeadline(); }

}
