package NYpost;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MainPage extends MobileAPI {

    @FindBy(id = "Continue")
    public WebElement clickContinue;
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open menu\"]")
    public WebElement OpenMenu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView")
    public WebElement Headline;


    public void getContinue1(){ clickContinue.click(); }

    public void getMenu(){ OpenMenu.click(); }

    public void getHeadline(){ Headline.click();}

}

