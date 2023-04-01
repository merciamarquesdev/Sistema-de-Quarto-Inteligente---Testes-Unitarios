package service;

import model.QuartoInteligente;

public class ModoService{

    public void modoDormir(QuartoInteligenteService quartoInteligenteService, QuartoInteligente quartoInteligente) throws Exception {
        quartoInteligenteService.apagarLuz(quartoInteligente);
        quartoInteligenteService.ligarArCondicionado(quartoInteligente);
        quartoInteligenteService.definirTemperaturaArCondicionado(quartoInteligente, 16);
    }

    public void modoAcordar(QuartoInteligenteService quartoInteligenteService, QuartoInteligente quartoInteligente){
        quartoInteligenteService.tocarAlarme(quartoInteligente);
        quartoInteligenteService.informarHoraCerta(quartoInteligente);
        quartoInteligenteService.acenderLuz(quartoInteligente);
    }

    public void modoRelaxar(QuartoInteligenteService quartoInteligenteService, QuartoInteligente quartoInteligente) throws Exception {
        quartoInteligenteService.ligarArCondicionado(quartoInteligente);
        quartoInteligenteService.definirTemperaturaArCondicionado(quartoInteligente,18);
        quartoInteligenteService.tocarMusica(quartoInteligente);
    }

    public void modoSair(QuartoInteligenteService quartoInteligenteService, QuartoInteligente quartoInteligente){
        quartoInteligenteService.desligarArCondicionado(quartoInteligente);
        quartoInteligenteService.desligarMusica(quartoInteligente);
        quartoInteligenteService.apagarLuz(quartoInteligente);
    }
}
