package service;

import model.QuartoInteligente;

public class QuartoInteligenteService {

    public void tocarAlarme(QuartoInteligente quartoInteligente){
        quartoInteligente.setAlarme(true);
    }
    public void desligarAlarme(QuartoInteligente quartoInteligente){
        quartoInteligente.setAlarme(false);
    }
    public void ligarLuz(QuartoInteligente quartoInteligente) {
        quartoInteligente.setIluminacao(true);
    }

    public void apagarLuz(QuartoInteligente quartoInteligente) {
        quartoInteligente.setIluminacao(false);
    }

    public void ligarArCondicionado(QuartoInteligente quartoInteligente) {
        quartoInteligente.setArCondicionado(true);
    }

    public void desligarArCondicionado(QuartoInteligente quartoInteligente) {
        quartoInteligente.setArCondicionado(false);
    }

    public void aumentarTemperaturaArCondicionado(QuartoInteligente quartoInteligente, int temperatura) {
        quartoInteligente.setTemperaturaArCondicionado(quartoInteligente.getTemperaturaArCondicionado() + temperatura);
    }

    public void diminuirTemperaturaArCondicionado(QuartoInteligente quartoInteligente, int temperatura) {
        quartoInteligente.setTemperaturaArCondicionado(quartoInteligente.getTemperaturaArCondicionado() - temperatura);
    }

    public void tocarMusica(QuartoInteligente quartoInteligente){
        quartoInteligente.setMusica(true);
    }

    public void desligarMusica(QuartoInteligente quartoInteligente){
        quartoInteligente.setMusica(false);
    }
}
