package service;

import model.QuartoInteligente;

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

    public void desligarArCondicionado(QuartoInteligente quartoInteligente) {
        quartoInteligente.setArCondicionado(false);
    }

    public void definirTemperaturaArCondicionado(QuartoInteligente quartoInteligente, int temperatura) throws Exception {
        if (quartoInteligente.getArCondicionado()){
            if ( 16 <= temperatura && temperatura <= 26) {
                quartoInteligente.setTemperaturaArCondicionado(temperatura);
            }
            else {
                throw new Exception("Temperatura inválida: " + temperatura + ". A temperatura deve ser entre 16 e 26 graus.");
            }
        }
        else{
            throw new Exception("O ar condicionado deve estar ligado para definir nova temperatura.");
        }
    }

    public void tocarMusica(QuartoInteligente quartoInteligente){
        quartoInteligente.setMusica(true);
    }

    public void desligarMusica(QuartoInteligente quartoInteligente){
        quartoInteligente.setMusica(false);
    }
}
