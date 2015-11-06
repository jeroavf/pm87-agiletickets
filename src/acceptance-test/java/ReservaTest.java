import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import br.com.caelum.agiletickets.acceptance.page.ReservaPage;

public class ReservaTest {

	private WebDriver browser ;
	
	@Before 
	public void setUp() throws Exception {
		browser = new FirefoxDriver() ;
		
	}
	
	@After
	public void tearDown() {
		browser.close() ;
	}
	
	
	
}
