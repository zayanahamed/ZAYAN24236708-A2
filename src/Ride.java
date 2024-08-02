import java.util.ArrayList;
import java.util.List;

public class Ride implements RideInterface {
    private String rideName;
    private String rideType;
    private Employee operator;
    private List<Visitor> queue;
    private List<Visitor> rideHistory;

    // Default constructor
    public Ride() {
        this.queue = new ArrayList<>();
        this.rideHistory = new ArrayList<>();
    }

    // Parameterized constructor
    public Ride(String rideName, String rideType, Employee operator) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.operator = operator;
        this.queue = new ArrayList<>();
        this.rideHistory = new ArrayList<>();
    }

    // Getters and setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    // Method to assign an Employee to operate the ride
    public void assignOperator(Employee operator) {
        this.operator = operator;
    }

    // Interface methods
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        queue.add(visitor);
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        queue.remove(visitor);
    }

    @Override
    public void printQueue() {
        System.out.println("Queue: ");
        for (Visitor v : queue) {
            System.out.println(v.getName());
        }
    }

    @Override
    public void runOneCycle() {
        System.out.println("Running one cycle of the ride...");
        // Simulate one cycle of the ride
        if (!queue.isEmpty()) {
            Visitor visitor = queue.remove(0);
            rideHistory.add(visitor);
            System.out.println("Visitor " + visitor.getName() + " took the ride.");
        } else {
            System.out.println("No visitors in the queue.");
        }
    }

    @Override
    public void printRideHistory() {
        System.out.println("Ride history: ");
        for (Visitor v : rideHistory) {
            System.out.println(v.getName());
        }
    }
}
