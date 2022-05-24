import com.Hepsiburada.Page.HomePage;
import com.Hepsiburada.Page.LoginPage;
import com.Hepsiburada.Page.SearchPage;
import org.junit.Test;
import com.Hepsiburada.WebDriver.WebDriverTest;
public class TestCase extends WebDriverTest{
    @Test
    public void HomeSuccess() throws InterruptedException {
        new HomePage(driver);

    }


    @Test
    public void LoginPageSucces() throws InterruptedException {
        new HomePage(driver).callLoginPage().login();

    }
    @Test
    public void SearchSuccess() throws InterruptedException {
        new SearchPage(driver).search();

    }


}

