package testCNBC;

import CNBC.HomePage;
import CNBC.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearchPage extends SearchPage {
    HomePage homePage = PageFactory.initElements(ad, HomePage.class);

    @Test
    public void Test01() throws InterruptedException {
        System.out.println("CNBC search page launched.");
        clickOn();
        Thread.sleep(3000);
    }
}
