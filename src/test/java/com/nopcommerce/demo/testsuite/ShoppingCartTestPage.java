package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.pages.ShoppingCartPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShoppingCartTestPage extends BaseTest {
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        shoppingCartPage.clickOnComputerAndDesktop();
        shoppingCartPage.clickOnSortByAToZ();
        shoppingCartPage.clickOnAddToCart();
        assertAssert("Not matching", shoppingCartPage.exptectedTextMessage("Build your own computer"), shoppingCartPage.actualTextToVerify(By.xpath("//h1[contains(text(),'Build your own computer')]")));
        shoppingCartPage.selectIntelPentiumDualCore();
        Thread.sleep(7000);
        shoppingCartPage.select8GB$60();
        shoppingCartPage.selectHDDRadio400GB();
        shoppingCartPage.selectOSRadioVistaPremium();
        shoppingCartPage.checkTwoMicrosoftOfficeBoxes();
        Thread.sleep(5000);
        assertAssert("Not correct", shoppingCartPage.exptectedTextMessage("$1,475.00"), shoppingCartPage.actualTextToVerify(By.xpath("//span[@id='price-value-1']")));
        shoppingCartPage.clickOnAddtoCartButton();
        assertAssert("Not matching", shoppingCartPage.exptectedTextMessage("The product has been added to your shopping cart"), shoppingCartPage.actualTextToVerify(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]")));
        shoppingCartPage.ClickOnCloseBarButton();
        shoppingCartPage.mouseHoverShoppingAndGoToCart();
        assertAssert("Not matching", shoppingCartPage.exptectedTextMessage("Shopping cart"), shoppingCartPage.actualTextToVerify((By.xpath("//h1[contains(text(),'Shopping cart')]"))));
        shoppingCartPage.updateQuantityTwo();
        shoppingCartPage.updateOnCartTo();
        Thread.sleep(2000);
        assertAssert("Not matching", shoppingCartPage.exptectedTextMessage("$2,950.00"), shoppingCartPage.actualTextToVerify(By.xpath("(//strong[text()='$2,950.00'])[2]")));
        shoppingCartPage.setClickOnServiceCheckBox();
        shoppingCartPage.clickOnCheckOutBox();
        assertAssert("Not matching", shoppingCartPage.exptectedTextMessage("Welcome, Please Sign In!"), shoppingCartPage.actualTextToVerify(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")));
        shoppingCartPage.clickOnCheckOutGuestBox();
        //2.22 Fill the all mandatory field
        shoppingCartPage.mandatoryFieldsFirstName();
        shoppingCartPage.filllastName();
        shoppingCartPage.fillEmail();
        shoppingCartPage.fillCountry();
        shoppingCartPage.fillCity();
        shoppingCartPage.fillAddress1();
        shoppingCartPage.fillZipPostalCode();
        shoppingCartPage.fillPhoneNumber();
        //2.23 Click on “CONTINUE”
        shoppingCartPage.clickOnContinue();
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        shoppingCartPage.RadioButtonNextDayAir();
        //  2.25 Click on “CONTINUE
        shoppingCartPage.clickOnContinue1();
        //2.26 Select Radio Button “Credit Card”
        shoppingCartPage.radioButtonCreditCard();
        //2.27 Select “Master card” From Select credit card dropdown
        Thread.sleep(5000);
        shoppingCartPage.selectMasterCard();
        //2.28 Fill all the details
        shoppingCartPage.fillCardholderName();
        shoppingCartPage.fillCardNumber();
        shoppingCartPage.fillExpiryMonth();
        shoppingCartPage.fillExpiryYear();
        shoppingCartPage.fillCardCode();
        //2.29 Click on “CONTINUE”
        shoppingCartPage.clickOnContinue3();
        //2.30 Verify “Payment Method” is “Credit Card”
        assertAssert("This is not payment method", shoppingCartPage.exptectedTextMessage("Payment Method:"), shoppingCartPage.actualTextToVerify(By.xpath("//span[contains(text(), 'Payment Method:')]")));
        assertAssert("Verify Payment Method is Credit Card", shoppingCartPage.exptectedTextMessage("Credit Card"),
                shoppingCartPage.actualTextToVerify(By.xpath("//span[contains(text(), 'Credit Card')]")));
        //2.32 Verify “Shipping Method” is “Next Day Air”
        assertAssert("This is not shipping method", shoppingCartPage.exptectedTextMessage("Shipping Method:"), shoppingCartPage.actualTextToVerify(By.xpath("//span[contains(text(), 'Shipping Method:')]")));
        assertAssert("Verify “Shipping Method” is Next Day Air", shoppingCartPage.exptectedTextMessage("Next Day Air"),
                shoppingCartPage.actualTextToVerify(By.xpath("//span[contains(text(), 'Next Day Air')]")));
        //2.33 Verify Total is “$2,950.00”
        assertAssert("Verify Total is $2,950.00", shoppingCartPage.exptectedTextMessage("$2,950.00"),
                shoppingCartPage.actualTextToVerify(By.xpath("(//strong[text()='$2,950.00'])[2]")));
        //2.34 Click on “CONFIRM”
        shoppingCartPage.confirm();
        //2.35 Verify the Text “Thank You”
        assertAssert("Message not displayed", shoppingCartPage.exptectedTextMessage("Thank you"), shoppingCartPage.actualTextToVerify(By.xpath("//h1[contains(text(),'Thank you')]")));
        //2.36 Verify the message “Your order has been successfully processed!”
        assertAssert("Not correct payment method", shoppingCartPage.exptectedTextMessage("Your order has been successfully processed!"), shoppingCartPage.actualTextToVerify(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]")));
        //2.37 Click on “CONTINUE”
        shoppingCartPage.clickOnContinue4();
        //2.37 Verify the text “Welcome to our store”
        assertAssert("Message not displayed", shoppingCartPage.exptectedTextMessage("Welcome to our store"), shoppingCartPage.actualTextToVerify(By.xpath("//h2[text()='Welcome to our store']")));


    }
}
