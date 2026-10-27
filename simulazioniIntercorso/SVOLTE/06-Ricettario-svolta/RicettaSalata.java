public class RicettaSalata extends Ricetta implements Vegetariana {

    private final int grammiSale;
    private boolean vegetariana;
    private final int caloriePerPorzione;

    public RicettaSalata(String codice, String nome, int porzioni, int grammiSale, int caloriePerPorzione, boolean vegetariana) throws RicettaNonValidaException {
        super(codice, nome, porzioni);
        this.grammiSale = grammiSale;
        this.vegetariana = vegetariana;
        this.caloriePerPorzione = caloriePerPorzione;
        if (grammiSale < 0) {
            throw new RicettaNonValidaException("Grammi di sale non validi");
        }
    }

    public int getGrammiSale() {
        return grammiSale;
    }

    @Override
    public boolean isVegetariana() {
        return vegetariana;
    }

    @Override
    public void impostaVegetariana(boolean vegetariana) {
        this.vegetariana = vegetariana;
    }

    @Override
    public int calcolaCalorieTotali() {
        return caloriePerPorzione * getPorzioni();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("grammiSale=%d%ncaloriePerPorzione=%d%nvegetariana=%b%n", grammiSale, caloriePerPorzione, vegetariana);
    }
}
