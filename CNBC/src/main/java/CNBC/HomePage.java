package CNBC;

import common.MobileAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI {

    @FindBy(id = "com.cnbc.client:id/index_text")
    WebElement home;

    @FindBy(id = "com.cnbc.client:id/btnSelect")
    WebElement HomeButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout[2]/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.view.View/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    WebElement News;

    public void getHome(){ home.click(); }

    public void clickOn(){
        HomeButton.click();
        News.click();
    }
}
