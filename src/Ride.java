import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    private String rideName;
    private String rideType;
    private Employee operator;
    private Queue<Visitor> queue;
    private Queue<Visitor> rideHistory; // Track visitors who have taken the ride

    // Default constructor
    public Ride() {
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Parameterized constructor
    public Ride(String rideName, String rideType, Employee operator) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.operator = operator;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
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
        if (queue.add(visitor)) {
            System.out.println("Visitor " + visitor.getName() + " has been added to the queue.");
        } else {
            System.out.println("Failed to add visitor " + visitor.getName() + " to the queue.");
        }
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (queue.remove(visitor)) {
            System.out.println("Visitor " + visitor.getName() + " has been removed from the queue.");
        } else {
            System.out.println("Visitor " + visitor.getName() + " is not in the queue.");
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Queue: ");
        for (Visitor v : queue) {
            System.out.println("Name: " + v.getName() + ", Age: " + v.getAge() + ", Address: " + v.getAddress());
        }
    }

    @Override
    public void runOneCycle() {
        System.out.println("Running one cycle of the ride...");
        if (!queue.isEmpty()) {
            Visitor visitor = queue.poll(); // Retrieve and remove the head of the queue
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
            System.out.println("Name: " + v.getName() + ", Age: " + v.getAge() + ", Address: " + v.getAddress());
        }
    }
}
