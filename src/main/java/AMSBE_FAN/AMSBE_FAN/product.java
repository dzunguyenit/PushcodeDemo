package AMSBE_FAN.AMSBE_FAN;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class product {
	WebDriver driver;
	String username, password, urlProduct, productname, sku;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass() {
		username = "myfacefinal@gmail.com";
		password = "123456";

		driver = new ChromeDriver();
		driver.get("https://my.myface.vn/admin/auth");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void TC_27_EmailCannotHaveBlankSpace() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("$('[id=\"email\"]').val('" + username + "')");
		js.executeScript("$('[id=\"password\"]').val('" + password + "')");
		js.executeScript("$('[value=\"Đăng nhập\"').click()");

	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}
}
