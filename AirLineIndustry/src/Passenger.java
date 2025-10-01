import java.util.*;

public class Passenger {
    private String passengerId;
    private String passengerName;
    private String identificationNumber;
    private List<Ticket> tickets;

    public Passenger(String passengerId, String passengerName, String identificationNumber) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.identificationNumber = identificationNumber;
        this.tickets = new ArrayList<>();
    }

    public Ticket bookFlight(Flight flight, Seat seat) { return null; }
    public void cancelTicket(Ticket ticket) { }
}
