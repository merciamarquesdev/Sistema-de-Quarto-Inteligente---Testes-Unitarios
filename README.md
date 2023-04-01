# Sistema de Quarto Inteligente - Testes Unitários

Sistema gerenciador de Quarto Inteligente, no qual é possível controlar iluminação, ligar e desligar ar condicionado, definir temperatura do ar condicionado, 
controle de música e alarme. Ainda é possível ativar diferentes modos:<br />

Modo Acordar: alarme toca e iluminação acende automaticamente.<br />
Modo Dormir: iluminação apaga, ar condicionado é ligado e é definida uma temperatura padrão automaticamente (foi usado como exemplo 16 graus).<br />
Modo Relaxar: ar condicionado é ligado, é definida temperatura de 18 graus e música começa a tocar automaticamente (foi usado como exemplo 18 graus).<br />
Modo Sair: ar condicionado, música e iluminação são todos desligados automaticamente.<br />

O sistema é composto por uma entidade, QuartoInteligente, e duas classes service, QuartoInteligenteService e ModoService.

O sistema é totalmente testado através de testes unitários usando JUnit 5. Nos métodos de teste relacionados ao ar condicionado, como 
deveDefinirTemperaturaArCondicionadoComSucesso(), deveLancarExcecaoEmDefinirTemperaturaArCondicionadoEmCasoDeTemperaturaInvalida() e
naoDeveDefinirTemperaturaArCondicionadoSeArCondicionadoEstiverDesligado(), são utilizados mocks através do Mockito e também são testadas exceções.

O projeto possui coverage de 100% em service. E para fazer a cobertura dos testes foi feita a configuração do JaCoCo.
Ao final, um relatório foi gerado exibindo as coberturas.

A imagem abaixo mostra a cobertura de model e service:
![image](https://user-images.githubusercontent.com/68623425/229315326-a2bebc87-bf39-4c6e-b1cf-16fca54735d4.png)

A imagem abaixo mostra a cobertura de 100% dos métodos em service:
![image](https://user-images.githubusercontent.com/68623425/229315813-b06a9382-0337-46de-a041-3e73d3b54108.png)

A imagem abaixo mostra a cobertura da classe QuartoInteligenteService:
![image](https://user-images.githubusercontent.com/68623425/229315839-83fca704-b66d-4ba0-b60a-3b8f20b9af16.png)

A imagem abaixo mostra a cobertura da classe ModoService:
![image](https://user-images.githubusercontent.com/68623425/229315851-ebf2deec-bcc2-4438-bb53-a9b099e1b4bb.png)
