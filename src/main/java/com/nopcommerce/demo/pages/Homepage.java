package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homepage extends Utility {

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(By.xpath("//ul[@class = 'top-menu notmobile']/li"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                    String selectedMenu = getTextFromElement(By.xpath("//h1[contains(text()," + "'" + menu +"')]"));

                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//ul[@class = 'top-menu notmobile']/li"));
        }
    }

}
