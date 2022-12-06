package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Computers;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputersTest extends BaseTest {
    Computers computers = new Computers();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        computers.clickOnComputerAndDesktop();
        computers.sortComputerDesktops("6");
        Assert.assertEquals(computers.gettingListOfProduct(), computers.gettingListBeforeSorting());
    }


}
