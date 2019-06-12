package AlibabaExpress;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {



    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageView")
    WebElement AllCategories;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.ImageView")
    WebElement Brands;

    @FindBy (id = "com.alibaba.aliexpresshd:id/menu_badge_icon")
    WebElement Cart;

    @FindBy(id="com.alibaba.aliexpresshd:id/iv_close_poplayer")
    WebElement Coupon;



    public void getCategories(){ AllCategories.click(); }

    public void getBrands(){ Brands.click(); }

    public void getCartContents(){ Cart.click(); }

    public void getCoupon(){ Coupon.click(); }
}
