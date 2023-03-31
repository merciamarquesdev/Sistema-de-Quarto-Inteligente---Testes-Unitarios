package service;
import model.QuartoInteligente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class QuartoInteligenteServiceTest {

    private QuartoInteligenteService quartoInteligenteService;
    private QuartoInteligente quartoInteligenteMock;
    private QuartoInteligente quartoInteligente;

    @BeforeEach
    void setUp() {
        quartoInteligenteService = new QuartoInteligenteService();
        quartoInteligente = new QuartoInteligente();
        quartoInteligenteMock = mock(QuartoInteligente.class);
    }

    @Test
    @DisplayName("Testa o método tocarAlarme")
    void tocarAlarmeTest() {
        quartoInteligenteService.tocarAlarme(quartoInteligente);
        Assertions.assertTrue(quartoInteligente.getAlarme());
    }

    @Test
    @DisplayName("Testa o método desligarAlarme")
    void desligarAlarmeTest() {
        quartoInteligenteService.desligarAlarme(quartoInteligente);
        Assertions.assertFalse(quartoInteligente.getAlarme());
    }

    @Test
    @DisplayName("Testa o método acenderLuz")
    void acenderLuzTest() {
        quartoInteligenteService.acenderLuz(quartoInteligente);
        Assertions.assertTrue(quartoInteligente.getIluminacao());
    }

    @Test
    @DisplayName("Testa o método apagarLuz")
    void apagarLuzTest() {
        quartoInteligenteService.apagarLuz(quartoInteligente);
        Assertions.assertFalse(quartoInteligente.getIluminacao());
    }

    @Test
    @DisplayName("Testa o método ligarArCondicionado")
    void ligarArCondicionadoTest() {
        quartoInteligenteService.ligarArCondicionado(quartoInteligente);
        Assertions.assertTrue(quartoInteligente.getArCondicionado());
    }

    @Test
    @DisplayName("Testa o método desligarArCondicionado")
    void desligarArCondicionadoTest() {
        quartoInteligenteService.desligarArCondicionado(quartoInteligente);
        Assertions.assertFalse(quartoInteligente.getArCondicionado());
    }

    @Test
    @DisplayName("Testa o método definirTemperaturaArCondicionado")
    void definirTemperaturaArCondicionadoTest() {
        when(quartoInteligenteMock.getArCondicionado()).thenReturn(true);
        when(quartoInteligenteMock.getTemperaturaArCondicionado()).thenReturn(19);
        quartoInteligenteService.definirTemperaturaArCondicionado(quartoInteligenteMock, 19);
        Assertions.assertEquals(19, quartoInteligenteMock.getTemperaturaArCondicionado());
    }

    @Test
    @DisplayName("Testa o método tocarMusica")
    void tocarMusicaTest(){
        quartoInteligenteService.tocarMusica(quartoInteligente);
        Assertions.assertTrue(quartoInteligente.getMusica());
    }

    @Test
    @DisplayName("Testa o método desligarMusica")
    void desligarMusicaTest(){
        quartoInteligenteService.desligarMusica(quartoInteligente);
        Assertions.assertFalse(quartoInteligente.getMusica());
    }

    @Test
    @DisplayName("Testa o método informarHoraCerta")
    void informarHoraCertaTest(){
        LocalDateTime expected = LocalDateTime.of(2023, 3, 30, 15, 0);
        Mockito.when(quartoInteligenteMock.getHorario()).thenReturn(expected);
        LocalDateTime result = quartoInteligenteService.informarHoraCerta(quartoInteligenteMock);
        Assertions.assertEquals(expected, result);
    }
}