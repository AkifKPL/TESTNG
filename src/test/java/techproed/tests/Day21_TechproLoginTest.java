package techproed.tests;
import org.testng.annotations.Test;
import techproed.pages.TechproLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
public class Day21_TechproLoginTest {
    @Test
    public void loginTest(){
        Driver.getDriver().get("https://testcenter.techproeducation.com/index.php?page=form-authentication");
        TechproLoginPage techproLoginPage = new TechproLoginPage();
        techproLoginPage.username.sendKeys(ConfigReader.getProperty("techpro_test_username"));
        techproLoginPage.password.sendKeys(ConfigReader.getProperty("techpro_test_password"));
        techproLoginPage.submitButton.click();
    }
}
