#Author: refaelaugsuto.paiva@e2etreinamentos.com.br

@regressivos
Feature: User List API Test
  Como usuario
  Quero acessar o site do YouTube
  Para assitir ao video Olha o Bicho Vindo
  
  Background: acessar servico
  Given que acesso a baseURL
  And valido o title do site
  
  
  @videoBichoVindo
  Scenario: Validar Titulo do Video
    When digito o nome do video desejado na barra de pesquisa
    And clico no botao de pesquisa
    And clico no video desejado
    Then valido o o titulo do video assistido
