public class Visitor extends Person {
    private String ticketNumber;
    private boolean hasAnnualPass;

    // Default constructor
    public Visitor() {}

    // Parameterized constructor
    public Visitor(String name, int age, String address, String ticketNumber, boolean hasAnnualPass) {
        super(name, age, address);
        this.ticketNumber = ticketNumber;
        this.hasAnnualPass = hasAnnualPass;
    }

    // Getters and setters
    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public boolean isHasAnnualPass() {
        return hasAnnualPass;
    }

    public void setHasAnnualPass(boolean hasAnnualPass) {
        this.hasAnnualPass = hasAnnualPass;
    }
}
