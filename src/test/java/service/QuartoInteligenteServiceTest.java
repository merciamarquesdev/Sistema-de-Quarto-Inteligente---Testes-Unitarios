package service;

import model.QuartoInteligente;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

class QuartoInteligenteServiceTest {

    private QuartoInteligenteService quartoInteligenteService;
    private QuartoInteligente quartoInteligente;
    private QuartoInteligente quartoInteligenteMock;

    @BeforeEach
    void setUp() {
        quartoInteligenteService = new QuartoInteligenteService();
        quartoInteligente = new QuartoInteligente();
        quartoInteligenteMock = mock(QuartoInteligente.class);
    }

    @Test
    @DisplayName("Testa o método tocarAlarme")
    void deveTocarAlarmeComSucesso() {
        quartoInteligenteService.tocarAlarme(quartoInteligente);
        Assertions.assertTrue(quartoInteligente.getAlarme());
    }

    @Test
    @DisplayName("Testa o método desligarAlarme")
    void deveDesligarAlarmeComSucesso() {
        quartoInteligenteService.desligarAlarme(quartoInteligente);
        Assertions.assertFalse(quartoInteligente.getAlarme());
    }

    @Test
    @DisplayName("Testa o método acenderLuz")
    void deveAcenderLuzComSucesso() {
        quartoInteligenteService.acenderLuz(quartoInteligente);
        Assertions.assertTrue(quartoInteligente.getIluminacao());
    }

    @Test
    @DisplayName("Testa o método apagarLuz")
    void deveApagarLuzComSucesso() {
        quartoInteligenteService.apagarLuz(quartoInteligente);
        Assertions.assertFalse(quartoInteligente.getIluminacao());
    }

    @Test
    @DisplayName("Testa o método ligarArCondicionado")
    void deveLigarArCondicionadoComSucesso() {
        quartoInteligenteService.ligarArCondicionado(quartoInteligente);
        Assertions.assertTrue(quartoInteligente.getArCondicionado());
    }

    @Test
    @DisplayName("Testa o método desligarArCondicionado")
    void deveDesligarArCondicionadoComSucesso() {
        quartoInteligenteService.desligarArCondicionado(quartoInteligente);
        Assertions.assertFalse(quartoInteligente.getArCondicionado());
    }

    @Test
    @DisplayName("Testa o método definirTemperaturaArCondicionado")
    public void deveDefinirTemperaturaArCondicionadoComSucesso() throws Exception {
        Mockito.when(quartoInteligenteMock.getArCondicionado()).thenReturn(true);
        quartoInteligenteService.definirTemperaturaArCondicionado(quartoInteligenteMock, 18);
        Mockito.verify(quartoInteligenteMock).setTemperaturaArCondicionado(18);
    }

    @Test
    @DisplayName("Testa o método definirTemperaturaArCondicionado em caso de temperatura invalida")
    public void deveLancarExcecaoEmDefinirTemperaturaArCondicionadoEmCasoDeTemperaturaInvalida() throws Exception {
        Mockito.when(quartoInteligenteMock.getArCondicionado()).thenReturn(true);
        Exception exception = assertThrows(Exception.class, () ->
                quartoInteligenteService.definirTemperaturaArCondicionado(quartoInteligenteMock, 30));
        assertEquals("Temperatura inválida: 30. A temperatura deve ser entre 16 e 26 graus.", exception.getMessage());
    }

    @Test
    @DisplayName("Testa o método definirTemperaturaArCondicionado em caso de aparelho desligado")
    public void naoDeveDefinirTemperaturaArCondicionadoSeArCondicionadoEstiverDesligado() {
        Mockito.when(quartoInteligenteMock.getArCondicionado()).thenReturn(false);
        Exception exception = assertThrows(Exception.class, () ->
                quartoInteligenteService.definirTemperaturaArCondicionado(quartoInteligenteMock, 15));
        assertEquals("O ar condicionado deve estar ligado para definir nova temperatura.", exception.getMessage());
    }

    @Test
    @DisplayName("Testa o método tocarMusica")
    void deveTocarMusicaComSucesso(){
        quartoInteligenteService.tocarMusica(quartoInteligente);
        Assertions.assertTrue(quartoInteligente.getMusica());
    }

    @Test
    @DisplayName("Testa o método desligarMusica")
    void deveDesligarMusicaComSucesso(){
        quartoInteligenteService.desligarMusica(quartoInteligente);
        Assertions.assertFalse(quartoInteligente.getMusica());
    }
}