import java.util.Date;

public class Reservation {
    private String reservationId;
    private Date bookingDate;
    private String bookingStatus;
    private double ticketPrice;
    private String otherBookingDetails;
    private Flight flight;
    private Seat seat;
    private Passenger passenger;

    public Ticket(String reservationId, Date bookingDate, Flight flight, Seat seat, Passenger passenger) {
        this.reservationId = reservationId;
        this.bookingDate = bookingDate;
        this.flight = flight;
        this.seat = seat;
        this.passenger = passenger;
    }

    public void confirmTicket() { }
    public void cancelTicket() { }
    public Ticket getTicket(String ticketId) { return null; }
}
