package AlibabaExpress;

import common.MobileAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends MobileAPI {

    @FindBy (id = "tcom.alibaba.aliexpresshd:id/search_hint")
    WebElement SearchBox;

    public WebElement getSearchInputField() {
        return SearchBox;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.SearchBox = searchInputField;
    }

    public void getSearchBox(){
        SearchBox.sendKeys("iphone");
        SearchBox.click();
    }

    public void searchItems(){
        List<String> itemList = setItemlist();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }

    public List<String> setItemlist(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Java Book");
        itemsList.add("Selenium Book");
        itemsList.add("Fishing rod");
        itemsList.add("Laptop");
        return itemsList;
    }
}
