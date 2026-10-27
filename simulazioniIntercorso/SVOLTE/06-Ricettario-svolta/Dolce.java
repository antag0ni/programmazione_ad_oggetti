public class Dolce extends Ricetta {

    private final int caloriePerPorzione;
    private final int grammiZucchero;

    public Dolce(String codice, String nome, int porzioni, int caloriePerPorzione, int grammiZucchero)
            throws RicettaNonValidaException {
        super(codice, nome, porzioni);
        this.grammiZucchero = grammiZucchero;
        this.caloriePerPorzione = caloriePerPorzione;
        if (grammiZucchero < 0 || caloriePerPorzione < 0) {
            throw new RicettaNonValidaException("Argomenti non validi");
        }
    }

    public int getCaloriePerPorzione() {
        return caloriePerPorzione;
    }

    public int getGrammiZucchero() {
        return grammiZucchero;
    }

    @Override
    public int calcolaCalorieTotali() {
        return caloriePerPorzione * getPorzioni();
    }

    @Override
    public String toString() {
        return super.toString() +  String.format("grammiZucchero=%d%ncaloriePerPorzione=%d%n", grammiZucchero, caloriePerPorzione);
    }
}
