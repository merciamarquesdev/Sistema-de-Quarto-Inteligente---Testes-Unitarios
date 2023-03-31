package service;

import model.QuartoInteligente;

import java.time.LocalDateTime;

public class QuartoInteligenteService {

    public void tocarAlarme(QuartoInteligente quartoInteligente){
        quartoInteligente.setAlarme(true);
    }
    public void desligarAlarme(QuartoInteligente quartoInteligente){
        quartoInteligente.setAlarme(false);
    }
    public void acenderLuz(QuartoInteligente quartoInteligente) {
        quartoInteligente.setIluminacao(true);
    }

    public void apagarLuz(QuartoInteligente quartoInteligente) {
        quartoInteligente.setIluminacao(false);
    }

    public void ligarArCondicionado(QuartoInteligente quartoInteligente) {
        quartoInteligente.setArCondicionado(true);
    }

    public void desligarArCondicionado(QuartoInteligente quartoInteligente) {quartoInteligente.setArCondicionado(false);}

    public void definirTemperaturaArCondicionado(QuartoInteligente quartoInteligente, int temperatura) {
        quartoInteligente.setTemperaturaArCondicionado(temperatura);
    }

    public void tocarMusica(QuartoInteligente quartoInteligente){
        quartoInteligente.setMusica(true);
    }

    public void desligarMusica(QuartoInteligente quartoInteligente){
        quartoInteligente.setMusica(false);
    }

    public LocalDateTime informarHoraCerta(QuartoInteligente quartoInteligente){
        LocalDateTime localDateTime = LocalDateTime.now();
        quartoInteligente.setHorario(localDateTime);
        return quartoInteligente.getHorario();
    }
}
