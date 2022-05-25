import com.Hepsiburada.Page.HomePage;
import com.Hepsiburada.Page.SearchPage;
import com.Hepsiburada.Page.Favorite_Add;
import org.junit.After;
import org.junit.Test;
import com.Hepsiburada.WebDriver.WebDriverTest;

public class TestCase extends WebDriverTest {
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

    @Test
    public void SecondPage() throws InterruptedException {
        new SearchPage(driver).search().search_plus();

    }

    @Test
    public void FavoriteAdd() throws InterruptedException {
        new SearchPage(driver).favoriteAdd().favorite();

    }

    @Test
    public void FavoriteRemove() throws InterruptedException {
        new SearchPage(driver).favoriteRemove().favorite();
        //Login işleminde HB de beklenmeyen hata uyarısı veriyor
        //chrome driverda o yüzden favoriden çıkarmayı tekrar arayıp clickliyerek yaptım
    }
}

