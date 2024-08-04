public class Visitor extends Person {
    private String ticketNum;
    private boolean isPremium;

    // Default constructor
    public Visitor() {}

    // Parameterized constructor
    public Visitor(String name, int age, String address, String ticketNum, boolean isPremium) {
        super(name, age, address);
        this.ticketNum = ticketNum;
        this.isPremium = isPremium;
    }

    // Getters and setters
    public String getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }
}
