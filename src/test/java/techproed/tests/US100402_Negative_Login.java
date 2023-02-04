package techproed.tests;

import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class US100402_Negative_Login {
    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;

    @Test
    public void US100402_Negative_Login() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        BlueRentalHomePage BlueRentalHomePage = new BlueRentalHomePage();
        BlueRentalLoginPage BlueRentalLoginPage = new BlueRentalLoginPage();
        BlueRentalHomePage.loginLink.click();
        BlueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("Customer_email"));
        BlueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("Customer_password"));
        BlueRentalLoginPage.loginButton.click();
//        Thread.sleep(3000);
//        Assert.assertEquals(blueRentalLoginPage.alertmesaj.getText(),"Bad credentials");
        Driver.closeDriver();





        
    }


}
//Name:
//        US100402_Negative_Login
//        Description:
//        Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapılamamalı
//        Acceptance Criteria:
//        Kullanici dogru email ve yanlis sifre girildiginde, hata mesajini alınmalı
//        Hata Mesaji:
//        Bad credentials
//        Test Data:
//        Customer email: jack@gmail.com
//        Customer password: fakepass
//Name:
//        US101122_Negative_Login
//        Description:
//        Geçerli email uzantısı olmadan kullanıcı girişi yapılamamalı
//        Acceptance Criteria:
//        Kullanici geçersiz email uzantısı yazdiginda, hata mesajini almalı
//        Error Message: email must be a valid email
//        Dogru email uzantisi girildiğinde hata mesajı alınmamalı
//        https://email-verify.my-addr.com/list-of-most-popular-email-domains.php
//        email-verify.my-addr.comemail-verify.my-addr.com
//        List of most popular email domains (by number of live emails)
//        Top 100 - List of most popular email domains according to number of live email addreses.