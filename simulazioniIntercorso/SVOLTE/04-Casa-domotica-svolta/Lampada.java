public class Lampada extends Dispositivo implements Connettibile {

    private final int lumen;
    private boolean connessa;

    public Lampada(String codice, String nome, int potenzaWatt, int lumen) {
        super(codice, nome, potenzaWatt);
        this.lumen = lumen;
        this.connessa = false;
        if (lumen <= 0)
            throw new IllegalArgumentException();
    }

    public int getLumen() {
        return lumen;
    }

    @Override
    public void connetti() {
        this.connessa = true;
    }

    @Override
    public void disconnetti() {
        this.connessa = false;
    }

    @Override
    public boolean isConnesso() {
        return connessa;
    }

    @Override
    public double consumo(int ore) {
        if (ore <= 0) 
            throw new IllegalArgumentException();
        return this.getPotenzaWatt() * ore;
    }

    @Override
    public String toString() {
        return super.toString() + "lumen=" + lumen + "\nconnessa=" + connessa + '\n';
    }
}
