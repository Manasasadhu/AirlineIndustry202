import java.util.*;

public class Airline {
    private String airlineId;
    private String airlineName;
    private List<Flight> flights;

    public Airline(String airlineId, String airlineName) {
        this.airlineId = airlineId;
        this.airlineName = airlineName;
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) { }
    public void removeFlight(String flightId) { }
    public Flight getFlight(String flightId) { return null; }
    public List<Flight> getAllFlightsIn(Airline airline) { return null; }
}