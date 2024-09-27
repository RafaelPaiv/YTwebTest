package youTubeUITest.browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import youTubeUITest.drivers.DriversFactory;

public class Browsers extends DriversFactory {

	public static void abrirNavegador(String site, String navegador) {

		switch (navegador) {
		case "Chrome":

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get(site);

			break;

		case "Edge":

			EdgeOptions options2 = new EdgeOptions();
			options2.addArguments("--disable-notifications");

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(options2);
			driver.manage().window().maximize();
			driver.get(site);

			break;

		default:
			break;
		}

	}

	public static void fecharNavegador() {

		driver.quit();

	}

}
