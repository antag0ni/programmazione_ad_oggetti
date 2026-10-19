import java.time.LocalDate;

public class Tanker extends Truck {

    private final Truck tractor;
    private final int totalCapacity;
    private final int compartments;
    private final boolean foodGrade;

    public Tanker(Truck tractor, int totalCapacity, int compartments, boolean foodGrade) {
        super(tractor.getChassisID(), tractor.getRegistrationDate());
        this.tractor = tractor;
        this.totalCapacity = totalCapacity;
        this.compartments = compartments;
        this.foodGrade = foodGrade;
        if (totalCapacity < 5000 || totalCapacity > 25000 || compartments > 4 || compartments < 0) {
            throw new IllegalArgumentException("Invalid total capacity value or bad compartments number");
        }
    }

    public int getTotalCapacity() {
        return this.totalCapacity;
    }

    public int getCompartments() {
        return this.compartments;
    }

    public boolean isFoodGrade() {
        return this.foodGrade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Tanker{totalCapacity=%d, compartments=%d, foodGrade=%b}", totalCapacity, compartments, foodGrade));
        return sb.toString();
    }
}