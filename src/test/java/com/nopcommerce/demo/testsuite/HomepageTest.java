package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Homepage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTest extends BaseTest {

    Homepage homePage = new Homepage();

    @Test
    public void verifyPageNavigation(){

        homePage.selectMenu("Computers");
        String expText = "Computers";
        String actText = getTextFromElement(By.xpath("//h1[contains(text()," + "'" + "Computers" +"')]"));
        System.out.println(actText);
        Assert.assertEquals(actText,expText,"Not matching");
    }



}
