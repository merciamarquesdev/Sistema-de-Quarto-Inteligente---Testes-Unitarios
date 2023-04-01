package model;

public class QuartoInteligente {
    private boolean iluminacao;
    private boolean arCondicionado;
    private int temperaturaArCondicionado;
    private boolean musica;
    private boolean alarme;

    public QuartoInteligente(){
    }


    public boolean getIluminacao() {
        return iluminacao;
    }

    public void setIluminacao(boolean iluminacao) {
        this.iluminacao = iluminacao;
    }

    public boolean getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public int getTemperaturaArCondicionado() {
        return temperaturaArCondicionado;
    }

    public void setTemperaturaArCondicionado(int temperaturaArCondicionado) {
        this.temperaturaArCondicionado = temperaturaArCondicionado;
    }

    public boolean getMusica() {
        return musica;
    }

    public void setMusica(boolean musica) {
        this.musica = musica;
    }

    public boolean getAlarme() {
        return alarme;
    }

    public void setAlarme(boolean alarme) {this.alarme = alarme;}
}

