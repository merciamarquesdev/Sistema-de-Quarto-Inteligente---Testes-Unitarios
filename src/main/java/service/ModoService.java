package service;

import model.QuartoInteligente;

public class ModoService{

    public void modoSono(QuartoInteligenteService quartoInteligenteService, QuartoInteligente quartoInteligente){
        quartoInteligenteService.apagarLuz(quartoInteligente);
        quartoInteligenteService.ligarArCondicionado(quartoInteligente);
        quartoInteligenteService.diminuirTemperaturaArCondicionado(quartoInteligente, 5);
    }

    public void modoAcordar(QuartoInteligenteService quartoInteligenteService, QuartoInteligente quartoInteligente){
        quartoInteligenteService.tocarAlarme(quartoInteligente);
        quartoInteligenteService.informarHoraCerta(quartoInteligente);
        quartoInteligenteService.acenderLuz(quartoInteligente);
        quartoInteligenteService.aumentarTemperaturaArCondicionado(quartoInteligente,5);
    }

    public void modoRelaxar(QuartoInteligenteService quartoInteligenteService, QuartoInteligente quartoInteligente){
        quartoInteligenteService.ligarArCondicionado(quartoInteligente);
        quartoInteligenteService.diminuirTemperaturaArCondicionado(quartoInteligente,5);
        quartoInteligenteService.tocarMusica(quartoInteligente);
    }

    public void modoSair(QuartoInteligenteService quartoInteligenteService, QuartoInteligente quartoInteligente){
        quartoInteligenteService.desligarArCondicionado(quartoInteligente);
        quartoInteligenteService.desligarMusica(quartoInteligente);
        quartoInteligenteService.apagarLuz(quartoInteligente);
    }
}
