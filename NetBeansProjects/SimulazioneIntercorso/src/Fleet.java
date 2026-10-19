import java.util.*;

public class Fleet {

    private Set<Truck> flotta;
    private final String name;

    public Fleet(String name) {
        flotta = new HashSet<>();
        this.name = name;
    }

    public void add(Truck tractor) {
        flotta.add(tractor);
    }

    public Fleet filterFoodGrade() {
        Fleet f = new Fleet(this.name);
        
        for (Truck c : flotta) {
            if (c.getClass().equals(Tanker.class)) {
                Tanker t = (Tanker)c;
                if (t.isFoodGrade()) f.add(t);
            }
        }
        
        return f;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" contains:\n");
        for (Truck c : flotta) {
            if (c.getClass().equals(Truck.class)) {
                sb.append(c).append('\n');
            } else {
                sb.append(String.format("Truck{chassisID=%s, registrationDate=%s}", c.getChassisID(), c.getRegistrationDate())).append(" -> ").append(c).append('\n');
            }
        }
        return sb.toString();
    }
}