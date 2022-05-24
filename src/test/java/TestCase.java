import com.Hepsiburada.Page.HomePage;
import com.Hepsiburada.Page.LoginPage;
import org.junit.Test;
import com.Hepsiburada.WebDriver.WebDriverTest;
public class TestCase extends WebDriverTest{
    @Test
    public void LoginPageSucces() throws InterruptedException {
        new HomePage(driver).callLoginPage().login();

    }



}

