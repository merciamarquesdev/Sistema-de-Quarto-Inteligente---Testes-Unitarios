package service;
import model.QuartoInteligente;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class ModoServiceTest {

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
    void deveBli() {
        quartoInteligenteService.tocarAlarme(quartoInteligente);
        Assertions.assertTrue(quartoInteligente.getAlarme());
    }
}