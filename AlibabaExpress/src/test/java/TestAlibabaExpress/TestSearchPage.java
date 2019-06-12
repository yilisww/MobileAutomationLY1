package TestAlibabaExpress;

import AlibabaExpress.HomePage;
import AlibabaExpress.SearchPage;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearchPage extends MobileAPI {

    SearchPage searchPage = PageFactory.initElements(ad, SearchPage.class);

    @Test
    public void enterMainPage() throws InterruptedException { searchPage.getSearchBox();
        sleep(1000);}

    @Test
    public void testSearch() {
        searchPage.searchItems();
    }
}
