package techproed.tests.smoketests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class deneme {
    @Test
    public void testName() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("userStoryURl"));
        Thread.sleep(20000);
//        1. Kullanici https://www.hubcomfy.com/ adresine gider
        Driver.getDriver().findElement(By.xpath("//*[@class='register inline-type']")).click();
//        2.Sağ üst köşedeki register butonuna tıklar
//       Driver.getDriver().findElement(By.xpath("//*[@id='reg_username']")).sendKeys("abc@gmail.com");
//       Driver.getDriver().findElement(By.xpath("//*[@class='woocommerce-Button woocommerce-button button woocommerce-form-register__submit']")).click();




//        3. Açılan sayfanın altında bulunan Become a Vendor yazısının üstünü tıklar
        Driver.getDriver().findElement(By.xpath(" (//*[@href='https://hubcomfy.com/vendor-register/'])[2]")).click();
//        4. Açılan sayfadaki imeal alanının girileceği kutuyu tıklar
        Driver.getDriver().findElement(By.xpath("//*[@id='user_email']")).click();


//        5. Kutuya geçerli bir imeal adresi girer
        Driver.getDriver().findElement(By.xpath("//*[@id='user_email']")).sendKeys("akdmrcan35@gmail.com");
//        6. Re-send-code isimli kutuya tıklar
        Driver.getDriver().findElement(By.xpath("//*[@value='Re-send Code']")).click();
        Thread.sleep(5000);
       String element= Driver.getDriver().findElement(By.xpath("//*[@class='wcfm-message email_verification_message wcfm-success']")).getText();
       System.out.println("element = " + element);

//        7. İmeal adresine gelen kodu. Kod kısmına girer
        Driver.getDriver().findElement(By.xpath("//*[@name='wcfm_email_verified_input']")).sendKeys("12345");

//        8.Password kısmının ilkini tıklar
        Driver.getDriver().findElement(By.xpath("//*[@id='passoword']")).sendKeys("1907Can3508..");

//        9. Oluşturdugu Passwordu girer
        Driver.getDriver().findElement(By.xpath("//*[@id='confirm_pwd']")).sendKeys("1907Can3508..");

//        10.Password kısmının ikincisine tıklar
//        11.Oluşturdugu passwordü tekrar girer
//        12.Register butonuna tıklar
        Driver.getDriver().findElement(By.id("wcfm_membership_register_button")).click();

//        13.Kayıt olarak siteye vendor olarak giriş yapabilmeli


    }
}
