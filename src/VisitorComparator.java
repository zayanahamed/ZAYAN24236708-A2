import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // Compare by name first
        int compareName = v1.getName().compareTo(v2.getName());

        if (compareName != 0) {

            return compareName;

        } else {
            // If names are the same, compare by age
            return Integer.compare(v1.getAge(), v2.getAge());
        }

    }
}
