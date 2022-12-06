package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ShoppingCartPage extends Utility {

    By computerMenu = By.xpath("//ul[@class ='top-menu notmobile']/li/a[@href = '/computers']");
    By desktop = By.xpath("//ul[@class ='top-menu notmobile']//a[@href = '/desktops']");
    By sortByAToZ = By.id("products-orderby");
    By addToCart = By.xpath("(//button[contains(text(),'to cart')])[1]");
    By selectComputer = By.name("product_attribute_1");
    By select8GB = By.name("product_attribute_2");
    By selectHDDRadio400GB = By.id("product_attribute_3_7");
    By selectOSRadioVistaPremium = By.id("product_attribute_4_9");
    By checkMicrosoftOfficeBox = By.id("product_attribute_5_12");
    By clickOnAddToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By clickOnCloseBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By mouseHoverOnShoppingcart = (By.xpath("//body/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"));
    By clickOnCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By clickOnQuantity = By.xpath("//input[@class='qty-input']");
    By clickOnUpdateCart = By.id("updatecart");
    By clickOnServiceCheck = By.xpath("//input[@id='termsofservice']");
    By clickOnCheckOut = By.xpath("//button[@id='checkout']");
    By clickonCheckOutGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By mandatoryFieldsFirstName = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By email = By.id("BillingNewAddress_Email");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address1 = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipPostalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By clickContinue = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");

    By radioButtonNextDay = By.xpath("//input[@id='shippingoption_1']");

    By clickcontinue1 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");

    By creditCard = By.xpath("//input[@id='paymentmethod_1']");
    By clickcontinue5 = By.xpath("//button[@onclick='PaymentMethod.save()']");

    By masterCard = By.id("CreditCardType");

    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expiryMonth = By.xpath("//select[@id='ExpireMonth']");
    By expiryYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");

    By clickContinue3 = By.id("payment-info-buttons-container");

    By verifyPayment = By.xpath("//span[contains(text(), 'Payment Method:')]");

    By verifyCreditCard = By.xpath("//span[contains(text(), 'Credit Card')]");

    By verifyShippingMethod = By.xpath("//span[contains(text(), 'Shipping Method:')]");

    By verifyNextDayAir = By.xpath("//span[contains(text(),'Next Day Air')]");

    By verifyTotal = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");

    By clickConfirm = By.xpath("//button[contains(text(),'Confirm')]");

    By verifyThankYou = By.xpath("//h1[contains(text(),'Thank you')]");

    By verifyOrderSuccessful = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    By clickContinue4 = By.xpath("//button[contains(text(),'Continue')]");

    By veriftyWelcomeMessage = By.xpath("//h2[contains(text(),'Welcome to our store')]");


//***************************************************************


    public void clickOnComputerAndDesktop() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(computerMenu)).moveToElement(driver.findElement(desktop)).click().build().perform();
    }

    public void clickOnSortByAToZ() {
        selectByValueFromDropDown(sortByAToZ, "5");
    }

    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(5000);
        clickOnElement(addToCart);
    }

    public void selectIntelPentiumDualCore() {
        selectByVisibleTextFromDropDown(selectComputer, "2.2 GHz Intel Pentium Dual-Core E2200");
    }

    public void select8GB$60() {
        selectByVisibleTextFromDropDown(select8GB, "8GB [+$60.00]");
    }

    public void selectHDDRadio400GB() {
        clickOnElement(selectHDDRadio400GB);
    }

    public void selectOSRadioVistaPremium() {
        clickOnElement(selectOSRadioVistaPremium);
    }

    public void checkTwoMicrosoftOfficeBoxes() throws InterruptedException {
        Thread.sleep(6000);
        clickOnElement(checkMicrosoftOfficeBox);
    }

    public void clickOnAddtoCartButton() {
        clickOnElement(clickOnAddToCart);
    }

    public void ClickOnCloseBarButton() {
        clickOnElement(clickOnCloseBar);
    }

    public void mouseHoverShoppingAndGoToCart() {
        mouseHoverToElement(mouseHoverOnShoppingcart);
        clickOnElement(clickOnCart);
    }

    public String exptectedTextMessage(String exp) {

        return exp;
    }

    public String actualTextToVerify(By by) {
        String act = driver.findElement(by).getText();
        System.out.println(act);
        return act;
    }

    public void updateQuantityTwo() {
        driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
        sendTextToElement(clickOnQuantity, "2");
    }

    public void updateOnCartTo() {
        clickOnElement(clickOnUpdateCart);
    }

    public void setClickOnServiceCheckBox() {
        clickOnElement(clickOnServiceCheck);
    }

    public void clickOnCheckOutBox() {
        clickOnElement(clickOnCheckOut);
    }

    public void clickOnCheckOutGuestBox() {
        clickOnElement(clickonCheckOutGuest);
    }

    //2.22 Fill the all mandatory field

    public void mandatoryFieldsFirstName() {
        sendTextToElement(mandatoryFieldsFirstName, "Prime");
    }

    public void filllastName() {
        sendTextToElement(lastName, "Test");
    }

    public void fillEmail() {
        sendTextToElement(email, "john.smith@gmail.com");
    }

    public void fillCountry() {
        selectByValueFromDropDown(country, "233");
    }

    public void fillCity() {
        sendTextToElement(city, "London");
    }

    public void fillAddress1() {
        sendTextToElement(address1, "25 Granville Road ");
    }

    public void fillZipPostalCode() {
        sendTextToElement(zipPostalCode, "N12 0AJ");
    }

    public void fillPhoneNumber() {
        sendTextToElement(phoneNumber, "01234567890");
    }

    //2.23 Click on “CONTINUE”
    public void clickOnContinue() {
        clickOnElement(clickContinue);
    }

    //2.24 Click on Radio Button “Next Day Air($0.00)”
    public void RadioButtonNextDayAir() {
        clickOnElement(radioButtonNextDay);
    }

    //2.25 Click on “CONTINUE”
    public void clickOnContinue1() {
        clickOnElement(clickcontinue1);
    }

    //2.26 Select Radio Button “Credit Card”
    public void radioButtonCreditCard() {
        clickOnElement(creditCard);
        clickOnElement(clickcontinue5);
    }

    //2.27 Select “Master card” From Select credit card dropdown
    public void selectMasterCard() {
        selectByVisibleTextFromDropDown(masterCard, "Master card");

    }

    //2.28 Fill all the details
    public void fillCardholderName() {
        sendTextToElement(cardHolderName, "Mr J Smith");
    }

    public void fillCardNumber() {
        sendTextToElement(cardNumber, "5252158607699923");
    }

    public void fillExpiryMonth() {
        sendTextToElement(expiryMonth, "2");
    }

    public void fillExpiryYear() {
        sendTextToElement(expiryYear, "2027");

    }

    public void fillCardCode() {
        sendTextToElement(cardCode, "982");

    }

    //2.29 Click on “CONTINUE”
    public void clickOnContinue3() {
        clickOnElement(clickContinue3);
    }

    //2.34 Click on “CONFIRM”
    public void confirm() {
        clickOnElement(clickConfirm);
    }

    //2.37 Click on “CONTINUE”
    public void clickOnContinue4() {
        clickOnElement(clickContinue4);
    }

}







