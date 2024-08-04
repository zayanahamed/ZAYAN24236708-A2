import java.io.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ride implements RideInterface {

    private String rideName;
    private int rating;
    private Employee employee;

    private final Queue<Visitor> queue;
    private final LinkedList<Visitor> rideHistory;
    private int maxRider;
    private int numOfCycles;
    private final Lock lock;

    // Default constructor
    public Ride() {
        queue = new LinkedList<>();
        rideHistory = new LinkedList<>();
        lock = new ReentrantLock();
    }

    public Ride(String rideName, int rating, Employee employee, int maxRider, int numOfCycles) {
        this.rideName = rideName;
        this.rating = rating;
        this.employee = employee;
        this.maxRider = maxRider;
        this.numOfCycles = numOfCycles;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.lock = new ReentrantLock();

    }

    // Getters and setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Employee getEmployee() {
        return employee;
    }

    // Method to assign an Employee
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    // Interface methods
    @Override
    public void AddVisitorToQueue(Visitor visitor) {
        queue.add(visitor);
        System.out.println(visitor.getName() + " successfully added to the queue.");
    }

    @Override
    public void RemoveVisitorToQueue(Visitor visitor) {

        if (queue.remove(visitor)) {

            System.out.println(visitor.getName() + " removed from the queue.");

        } else {

            System.out.println(visitor.getName() + " not found in the queue.");
        }
    }

    @Override
    public void PrintQueue() {

        for (Visitor visitor : queue) {

            System.out.println(visitor.getName() +", "+ visitor.getAge() +", "+ visitor.getAddress() +", "+ visitor.getTicketNum() +", "+ visitor.isPremium());
        }
    }

    @Override
    public void RunOneCycle() {

        lock.lock();

        try {

            if (employee == null) {

                System.out.println("No operator assigned to the ride. Cannot run the ride.");

                return;
            }

            if (queue.isEmpty()) {

                System.out.println("No visitors in the queue. Cannot run the ride.");

                return;
            }

            int riders = Math.min(maxRider, queue.size());

            for (int i = 0; i < riders; i++) {

                Visitor visitor = queue.poll();

                if (visitor != null) {

                    rideHistory.add(visitor);

                    System.out.println(visitor.getName() + " took the ride.");
                }
            }

            numOfCycles++;

        } finally {

            lock.unlock();
        }

    }

    @Override
    public void PrintRideHistory() {

        lock.lock();

        try {

            System.out.println("Visitors who took the ride:");

            Iterator<Visitor> iterator = rideHistory.iterator();

            while (iterator.hasNext()) {

                System.out.println(iterator.next().getName());

            }

        } finally {

            lock.unlock();
        }
    }

    public void addVisitorToCollection(Visitor visitor) {

        lock.lock();

        try {

            rideHistory.add(visitor);

            System.out.println(visitor.getName() + " added to the ride history.");

        } finally {

            lock.unlock();
        }
    }

    public boolean isVisitorInCollection(Visitor visitor) {

        lock.lock();

        try {

            return rideHistory.contains(visitor);

        } finally {

            lock.unlock();
        }
    }

    public int getNumberOfVisitorsInCollection() {

        lock.lock();

        try {

            return rideHistory.size();

        } finally {

            lock.unlock();
        }
    }

    public void sortVisitorsInCollection(VisitorComparator comparator) {

        lock.lock();

        try {

            Collections.sort(rideHistory, comparator);

            System.out.println("Ride history sorted.");

        } finally {

            lock.unlock();
        }
    }

    public void writeVisitorsToFile(String filename) {

        lock.lock();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {

            Iterator<Visitor> iterator = rideHistory.iterator();

            while (iterator.hasNext()) {

                Visitor visitor = iterator.next();

                writer.write(visitor.getName() + "," + visitor.getAge() + "," + visitor.getAddress() + "," + visitor.getTicketNum() + "," + visitor.isPremium());

                writer.newLine();
            }

            System.out.println("Visitors written to file: " + filename);

        } catch (IOException e) {

            System.out.println("Error writing to file: " + e.getMessage());

        } finally {

            lock.unlock();
        }
    }

    public void readVisitorsFromFile(String filename) {

        lock.lock();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] details = line.split(",");

                Visitor visitor = new Visitor(details[0], Integer.parseInt(details[1]), details[2], details[3], Boolean.parseBoolean(details[4]));

                rideHistory.add(visitor);
            }

            System.out.println("Visitors read from file: " + filename);

        } catch (IOException e) {

            System.out.println("Error reading from file: " + e.getMessage());

        } finally {

            lock.unlock();
        }
    }

}

interface RideInterface{

    void AddVisitorToQueue(Visitor visitor);
    void RemoveVisitorToQueue(Visitor visitor);
    void PrintQueue();
    void RunOneCycle();
    void PrintRideHistory();
}
