package testCNBC;

import CNBC.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    HomePage homePage = PageFactory.initElements(ad, HomePage.class);

    @Test
    public void enterHomePage() throws InterruptedException { homePage.getHome();
        sleep(1000);}

    @Test
    public void Test01() throws InterruptedException {
        System.out.println("CNBC launched.");
        clickOn();
        Thread.sleep(3000);
    }
}
