package tests;

import baseTests.BaseTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class TestVendorLoginPage extends BaseTest {

    @Test
    public void testVendorLoginPageUI() throws InterruptedException {
        pm.preLoginPage().clickOnVendorLoginButton();
        pm.vendorLoginPage().verifyVendorLoginPage();
        pm.vendorLoginPage().verifyEmailTxt();
        pm.vendorLoginPage().verifyPasswordTxt();
        pm.vendorLoginPage().verifyForgetPasswordTxt();
        pm.vendorLoginPage().verifyGooglebtn();
        pm.vendorLoginPage().verifyFacebookbtn();
        pm.vendorLoginPage().verifyWelcomeTxt();
        pm.vendorLoginPage().verifyLoginHeaderTxt();
        pm.vendorLoginPage().verifyWelcomeParagraphTxt();
        pm.vendorLoginPage().verifyRegisterNowLnk();


    }

    @Test
    public void testVendorWithValidCredentials() {
        pm.preLoginPage().clickOnVendorLoginButton();
        pm.vendorLoginPage().performLogin("palepu.jk@gmail.com", "Test@123456");
    }

    @Test
    public void testVendorWithInValidCredentials() {
        pm.preLoginPage().clickOnVendorLoginButton();
        pm.vendorLoginPage().verifyInValidEmail();
    }
}
