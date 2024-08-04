public class AssessmentTwo {

    public static void main(String[] args) {
        partThree();
        partFourA();
        partFourB();
        partFive();
    }

    public static void partThree(){
        Employee employee = new Employee("Emily Smith", 25, "88 High Street", "Water Ride Operator", 30000);

        Ride ride = new Ride("Water Riders", 5, employee, 5, 1);

        // Add a minimum of 5 Visitors to the Queue
        Visitor visitor1 = new Visitor("Mitchell Marsh", 20, "42 Smith Street", "Ticket" + 1, true);
        ride.AddVisitorToQueue(visitor1);

        Visitor visitor2 = new Visitor("Sean Abbott", 23, "11 King Street", "Ticket" + 2, false);
        ride.AddVisitorToQueue(visitor2);

        Visitor visitor3 = new Visitor("Alex Carey", 29, "3 Banksia Street", "Ticket" + 3, false);
        ride.AddVisitorToQueue(visitor3);

        Visitor visitor4 = new Visitor("Nathan Ellis", 35, "88 High Street", "Ticket" + 4, true);
        ride.AddVisitorToQueue(visitor4);

        Visitor visitor5 = new Visitor("Jake Fraser", 15, "5 Bayview Terrace", "Ticket" + 5, true);
        ride.AddVisitorToQueue(visitor5);

        // Remove a Visitor from the Queue
        ride.RemoveVisitorToQueue(visitor5);

        // Print all Visitors in the Queue
        ride.PrintQueue();
    }

    public static void partFourA() {
        // Implementation from previous part
    }

    public static void partFourB() {
        // Implementation from previous part
    }

    public static void partFive(){

        // Create a new Ride object
        Employee employee = new Employee("Thomas Wilson", 25, "62 Ocean Parade", "Roller Coaster Operator", 40000);
        Ride ride = new Ride("Roller Coaster", 3, employee, 5, 4);

        // Add a minimum of 5 Visitor to the collection
        Visitor visitor1 = new Visitor("Mitchell Marsh", 40, "30, Hech street", "Ticket" + 99, false);
        ride.AddVisitorToQueue(visitor1);

        Visitor visitor2 = new Visitor("Sean Abbott", 23, "42 Smith Street", "Ticket" + 22, false);
        ride.AddVisitorToQueue(visitor2);

        Visitor visitor3 = new Visitor("Alex Carey", 29, "15 Johnson Avenue", "Ticket" + 11, false);
        ride.AddVisitorToQueue(visitor3);

        Visitor visitor4 = new Visitor("Nathan Ellis", 35, "7 Bond Street", "Ticket" + 33, true);
        ride.AddVisitorToQueue(visitor4);

        Visitor visitor5 = new Visitor("Jake Fraser", 15, "29 Beach Road", "Ticket" + 66, true);
        ride.AddVisitorToQueue(visitor5);

        Visitor visitor6 = new Visitor("Cameron Green", 40, "29 Beach Road", "Ticket" + 65, false);
        ride.AddVisitorToQueue(visitor6);

        Visitor visitor7 = new Visitor("Aaron Hardie", 23, "6 Manning Street", "Ticket" + 45, true);
        ride.AddVisitorToQueue(visitor7);

        Visitor visitor8 = new Visitor("Josh Hazlewood", 29, "33 Adelaide Terrace", "Ticket" + 87, false);
        ride.AddVisitorToQueue(visitor8);

        Visitor visitor9 = new Visitor("DA Warner", 35, "14 Flinders Lane", "Ticket" + 67, true);
        ride.AddVisitorToQueue(visitor9);

        Visitor visitor10 = new Visitor("PJ Cummins", 15, "9 Bay Street", "Ticket" + 21, true);
        ride.AddVisitorToQueue(visitor10);

        // Print all Visitors in the Queue
        ride.PrintQueue();

        // Run one cycle
        ride.RunOneCycle();

        // Print all Visitors in the Queue
        ride.PrintQueue();

        // Print all Visitors in the collection
        ride.PrintRideHistory();
    }

    public static void partSix() {
        // Implementation for part 6
    }

    public static void partSeven() {
        // Implementation for part 7
    }
}
