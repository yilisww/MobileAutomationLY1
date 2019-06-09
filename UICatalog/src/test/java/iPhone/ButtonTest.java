package iPhone;

import UiCatalogPage.UiCatalog;
import navigate.NavigateUi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class ButtonTest extends NavigateUi {

    @Test
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getButtonPage();
        sleep(2000);
    }

}
