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
        Fleet f = new Fleet(this.name + " with only food-grade Tankers");
        for (Truck c : flotta) 
            if (c instanceof Tanker && ((Tanker)c).isFoodGrade())
                f.add(c);
        return f;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" contains:\n");
        for (Truck c : flotta) {
            sb.append(c).append('\n');
        }
        return sb.toString();
    }
}