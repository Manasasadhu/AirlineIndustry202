import java.time.LocalDateTime;
import java.util.*;

public class Flight {
    private String flightNumber;
    private LocalDateTime departureDate;
    private LocalDateTime departureLocalTime;
    private LocalDateTime arrivalDate;
    private LocalDateTime arrivalTime;
    private String flightStatus;
    private Airline operatingAirline;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private Pilot firstPilot;
    private Pilot secondPilot;
    private Airplane airplane;

    public Flight(String flightNumber, LocalDateTime departureDate, LocalDateTime arrivalDate) {
        this.flightNumber = flightNumber;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
    }

    public void addPilot(Pilot pilot) { }
    public void setAirplane(Airplane airplane) { }
}