public class AssessmentTwo {
    public static void main(String[] args) {
        AssessmentTwo assessment = new AssessmentTwo();
        assessment.partThree();
        assessment.partFourA();
    }

    public void partThree() {
        // Create a new Ride object
        Ride ride = new Ride("Roller Coaster", "Thrill", null);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("John Doe", 25, "123 Elm Street", "T12345", false);
        Visitor visitor2 = new Visitor("Jane Smith", 30, "456 Oak Avenue", "T12346", true);
        Visitor visitor3 = new Visitor("Alice Johnson", 22, "789 Pine Road", "T12347", false);
        Visitor visitor4 = new Visitor("Bob Brown", 28, "101 Maple Drive", "T12348", true);
        Visitor visitor5 = new Visitor("Charlie Davis", 35, "202 Birch Lane", "T12349", false);

        // Add visitors to the queue
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        // Remove a visitor from the queue
        ride.removeVisitorFromQueue(visitor3);

        // Print all visitors in the queue
        ride.printQueue();
    }

    public void partFourA() {
        // Create a new Ride object
        Ride ride = new Ride("Ferris Wheel", "Leisure", null);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("John Doe", 25, "123 Elm Street", "T12345", false);
        Visitor visitor2 = new Visitor("Jane Smith", 30, "456 Oak Avenue", "T12346", true);
        Visitor visitor3 = new Visitor("Alice Johnson", 22, "789 Pine Road", "T12347", false);
        Visitor visitor4 = new Visitor("Bob Brown", 28, "101 Maple Drive", "T12348", true);
        Visitor visitor5 = new Visitor("Charlie Davis", 35, "202 Birch Lane", "T12349", false);

        // Add visitors to the ride history
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        // Check if a visitor is in the ride history
        System.out.println("Is visitor2 in history? " + ride.isVisitorInHistory(visitor2));

        // Print the number of visitors in the ride history
        System.out.println("Number of visitors in history: " + ride.getNumberOfVisitorsInHistory());

        // Print all visitors in the ride history
        ride.printRideHistory();
    }

    public void partFourB() {
        // Implementation for part 4B
    }

    public void partFive() {
        // Implementation for part 5
    }

    public void partSix() {
        // Implementation for part 6
    }

    public void partSeven() {
        // Implementation for part 7
    }
}
