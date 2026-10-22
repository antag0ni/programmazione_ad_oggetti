import java.time.LocalDate;

public class Truck {

    private final String chassisID;
    private final LocalDate registrationDate;

    public Truck(String chassisID, LocalDate registrationDate) {
        this.chassisID = chassisID;
        this.registrationDate = registrationDate;
    }

    public String getChassisID() {
        return this.chassisID;
    }

    public LocalDate getRegistrationDate() {
        return this.registrationDate;
    }

    @Override
    public int hashCode() {
        return chassisID.hashCode();
    }

    @Override
    public final boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
            
        Truck t = (Truck)o;
        return getChassisID().equals(t.getChassisID());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Truck{chassisID=%s, registrationDate=%s}", this.getChassisID(), this.getRegistrationDate()));
        return sb.toString();
    }
}