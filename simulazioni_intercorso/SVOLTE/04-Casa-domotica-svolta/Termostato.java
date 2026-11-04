public class Termostato extends Dispositivo implements Connettibile {

    private final double temperaturaImpostata;
    private boolean connesso;

    public Termostato(String codice, String nome, int potenzaWatt, double temperaturaImpostata) {
        super(codice, nome, potenzaWatt);
        this.temperaturaImpostata = temperaturaImpostata;
        this.connesso = false;
        if (temperaturaImpostata < 5 || temperaturaImpostata > 35)
            throw new IllegalArgumentException();
    }

    public double getTemperaturaImpostata() {
        return temperaturaImpostata;
    }

    @Override
    public void connetti() {
        this.connesso = true;
    }

    @Override
    public void disconnetti() {
        this.connesso = false;
    }

    @Override
    public boolean isConnesso() {
        return connesso;
    }

    @Override
    public double consumo(int ore) {
        if (ore <= 0) 
            throw new IllegalArgumentException();
        return getPotenzaWatt() * ore * 1.2;
    }

    @Override
    public String toString() {
        return super.toString() + "temperatura=" + temperaturaImpostata + "\nconnesso=" + connesso + '\n';
    }
}
