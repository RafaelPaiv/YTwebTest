package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import metodos.Metodos;
import youTubeUITest.browsers.Browsers;
import youTubeUITest.drivers.DriversFactory;

public class TestesUnitarios extends DriversFactory {
	
	Metodos metodo = new Metodos();

	@Test
	public void test() throws InterruptedException {

		Browsers.abrirNavegador("https://www.youtube.com/", "Chrome");
		String titleEsperado = driver.getTitle();
		assertEquals(titleEsperado, "YouTube");
		metodo.digitar("olha o bicho vindo", metodo.SearchBar);
		metodo.clicar(metodo.BtnSearch);
		Thread.sleep(2000);
		metodo.clicar(metodo.video);
		Thread.sleep(2000);
		metodo.validarTexto(metodo.textoVideo, "Vinicius No Dead Space 2 - Olha o Bicho Vindo");
		Thread.sleep(109000);
		Browsers.fecharNavegador();

	}

}
