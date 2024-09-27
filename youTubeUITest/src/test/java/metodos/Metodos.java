package metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import youTubeUITest.drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public By SearchBar = By.xpath("//input[@id='search']");
	public By BtnSearch = By.xpath("//button[@id='search-icon-legacy']");
	public By video = By.xpath("//body/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-search[1]/div[1]/ytd-two-column-search-results-renderer[1]/div[1]/ytd-section-list-renderer[1]/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-video-renderer[1]/div[1]/div[1]/div[1]/div[1]/h3[1]/a[1]/yt-formatted-string[1]");
	public By textoVideo = By.xpath("//body/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-watch-flexy[1]/div[5]/div[1]/div[1]/div[2]/ytd-watch-metadata[1]/div[1]/div[1]/h1[1]/yt-formatted-string[1]");
	
	public void digitar(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {

		driver.findElement(elemento).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void apagarTexto(By elemento) {

		driver.findElement(elemento).clear();

	}

	public void validarTexto(By elemento, String textoEsperado) {

		String textoValidado = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoValidado);

	}
	
	
	public void validarTitle (String titleEsperado) {
		
		String titleObtido = driver.getTitle();
		assertEquals(titleObtido, titleEsperado);	
	
	}
	
	
	

}
