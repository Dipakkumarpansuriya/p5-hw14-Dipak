package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Electronics extends Utility {
    By electronicsMenu = By.xpath("//ul[@class ='top-menu notmobile']/li/a[@href = '/electronics']");
    By cellPhone = By.xpath("//ul[@class ='top-menu notmobile']//a[@href = '/cell-phones']");

    By getTextCellPhone = (By.xpath("//h1[contains(text(),'Cell phones')]"));
    By clickOnListTab = (By.xpath("//a[contains(text(),'List')]"));
    By clickOnNokiaLumia1020 = By.xpath("//h2/a[contains(text(),'Nokia Lumia 1020')]");
    By getTextNokiaLumia1020 = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By getPriceForNokiaLumia = By.xpath("//span[@id='price-value-20']");
    By updateQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCart = By.id("add-to-cart-button-20");
    By addedToCartMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By hoverToShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickOnGoToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By shoppingCartMessage = By.xpath("//span[contains(text(),'Shopping cart')]");


   //**************************************************************************


    public void clickOnElectronicsMenuAndCellPhone() {

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(electronicsMenu)).moveToElement(driver.findElement(cellPhone)).click().build().perform();
    }

    public String getCellPhoneText() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(getTextCellPhone);
    }

    public void clickOnListTab() {
        clickOnElement(clickOnListTab);
    }

    public void clickOnNokiaLumia1020() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(clickOnNokiaLumia1020);
    }

    public String getNokiaLumiaText() {

        return getTextFromElement(getTextNokiaLumia1020);
    }

    public String getPriceForNokiaLumia() {

        return getTextFromElement(getPriceForNokiaLumia);
    }

    public void updateQuantityTo2() {
        driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']")).clear();
        sendTextToElement(updateQuantity, "2");
    }

    public void setAddToCart() {
        clickOnElement(addToCart);
    }

    public String getAddedToCartMessage() {

        return getTextFromElement(addedToCartMessage);
    }

    public void closePopUpMessage() {
        clickOnElement(closeMessage);
    }

    public void clickOnGoToCart() {
        mouseHoverToElement(hoverToShoppingCart);
        clickOnElement(clickOnGoToCart);
    }

    public String shoppingCartMessage() {

        return getTextFromElement(shoppingCartMessage);
    }


}
