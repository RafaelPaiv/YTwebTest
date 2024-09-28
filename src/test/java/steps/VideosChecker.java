package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import youTubeUITest.browsers.Browsers;

public class VideosChecker {
	
	Metodos metodo = new Metodos();

	@Given("que acesso a baseURL")
	public void queAcessoABaseURL() {

		Browsers.abrirNavegador("https://www.youtube.com/", "Chrome");

	}

	@Given("valido o title do site")
	public void validoOTitleDoSite() {
		
		metodo.validarTitle("YouTube");

	}

	@When("digito o nome do video desejado na barra de pesquisa")
	public void digitoONomeDoVideoDesejadoNaBarraDePesquisa() {
		
		metodo.digitar("olha o bicho vindo", metodo.SearchBar);

	}

	@When("clico no botao de pesquisa")
	public void clicoNoBotaoDePesquisa() {
		
		metodo.clicar(metodo.BtnSearch);
		

	}

	@When("clico no video desejado")
	public void clicoNoVideoDesejado() {
		
		metodo.clicar(metodo.video);

	}

	@Then("valido o o titulo do video assistido")
	public void validoOOTituloDoVideoAssistido() {
		
		metodo.validarTexto(metodo.textoVideo, "Vinicius No Dead Space 2 - Olha o Bicho Vindo");
		try {
			Thread.sleep(109000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Browsers.fecharNavegador();

	}

}
