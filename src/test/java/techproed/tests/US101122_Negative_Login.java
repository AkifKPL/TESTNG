package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class US101122_Negative_Login {
    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;
    @Test
    public void US101122_Negative_Login(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

        BlueRentalHomePage blueRentalHomePage = new BlueRentalHomePage();
        BlueRentalLoginPage blueRentalLoginPage= new BlueRentalLoginPage();
        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("Faker_email"));
        Assert.assertEquals(blueRentalLoginPage.fakeremail.getText(),"email must be a valid email");




    }





}
//    Name:
//    US101122_Negative_Login
//    Description:
//    Geçerli email uzantısı olmadan kullanıcı girişi yapılamamalı
//    Acceptance Criteria:
//    Kullanici geçersiz email uzantısı yazdiginda, hata mesajini almalı
//    Error Message: email must be a valid email
//    Dogru email uzantisi girildiğinde hata mesajı alınmamalı
//    https://email-verify.my-addr.com/list-of-most-popular-email-domains.php
//    email-verify.my-addr.comemail-verify.my-addr.com
//    List of most popular email domains (by number of live emails)
//    Top 100 - List of most popular email domains according to number of live email addreses.