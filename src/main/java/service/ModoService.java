package service;

import model.QuartoInteligente;

public class ModoService{

    public void modoSono(QuartoInteligenteService quartoInteligenteService, QuartoInteligente quartoInteligente){
        quartoInteligenteService.apagarLuz(quartoInteligente);
        quartoInteligenteService.ligarArCondicionado(quartoInteligente);
        if (quartoInteligente.getTemperaturaArCondicionado() >= 23){
            quartoInteligenteService.aumentarTemperaturaArCondicionado(quartoInteligente, 5);
        }
        //continuar
    }

    public void modoAcordar(QuartoInteligenteService quartoInteligenteService, QuartoInteligente quartoInteligente){
        quartoInteligenteService.tocarAlarme(quartoInteligente);
        quartoInteligenteService.ligarLuz(quartoInteligente);
    }

    public void modoRelaxar(QuartoInteligenteService quartoInteligenteService, QuartoInteligente quartoInteligente){

    }

    public void modoFoco(QuartoInteligenteService quartoInteligenteService, QuartoInteligente quartoInteligente){

    }

    public void modoSair(QuartoInteligenteService quartoInteligenteService, QuartoInteligente quartoInteligente){

    }
}
