package AlibabaExpress;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {


    @FindBy (id = "tcom.alibaba.aliexpresshd:id/search_hint")
    WebElement SearchBox;

    @FindBy(id="com.alibaba.aliexpresshd:id/iv_close_poplayer")
    WebElement Coupon;


    public void getSearchBox(){ SearchBox.click(); }

    public void getCoupon(){ Coupon.click(); }

}
