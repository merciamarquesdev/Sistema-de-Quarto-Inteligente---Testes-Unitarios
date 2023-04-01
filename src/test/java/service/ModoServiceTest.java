package service;
import model.QuartoInteligente;
import org.junit.jupiter.api.*;

public class ModoServiceTest {

    private ModoService modoService;
    private QuartoInteligente quartoInteligente;
    private QuartoInteligenteService quartoInteligenteService;

    @BeforeEach
    public void setup() {
        modoService = new ModoService();
        quartoInteligente = new QuartoInteligente();
        quartoInteligenteService = new QuartoInteligenteService();
    }

    @Test
    @DisplayName("Teste modoDormir")
    public void modoDormirDeveFuncionarCorretamente() throws Exception {
        modoService.modoDormir(quartoInteligenteService, quartoInteligente);
        Assertions.assertEquals(16, quartoInteligente.getTemperaturaArCondicionado());
        Assertions.assertTrue(quartoInteligente.getArCondicionado());
        Assertions.assertFalse(quartoInteligente.getIluminacao());
    }

    @Test
    @DisplayName("Teste modoAcordar")
    public void modoAcordarDeveFuncionarCorretamente() {
        modoService.modoAcordar(quartoInteligenteService, quartoInteligente);
        Assertions.assertTrue(quartoInteligente.getAlarme());
        Assertions.assertTrue(quartoInteligente.getIluminacao());
    }

    @Test
    @DisplayName("Teste modoRelaxar")
    public void modoRelaxarDeveFuncionarCorretamente() throws Exception {
        modoService.modoRelaxar(quartoInteligenteService, quartoInteligente);
        Assertions.assertEquals(18, quartoInteligente.getTemperaturaArCondicionado());
        Assertions.assertTrue(quartoInteligente.getArCondicionado());
        Assertions.assertTrue(quartoInteligente.getMusica());
    }

    @Test
    @DisplayName("Teste modoSair")
    public void modoSairDeveFuncionarCorretamente() {
        modoService.modoSair(quartoInteligenteService, quartoInteligente);
        Assertions.assertFalse(quartoInteligente.getArCondicionado());
        Assertions.assertFalse(quartoInteligente.getMusica());
        Assertions.assertFalse(quartoInteligente.getIluminacao());
    }
}