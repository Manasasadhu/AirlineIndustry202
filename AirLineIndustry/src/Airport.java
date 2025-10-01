import java.util.*;

public class Airport {
    private String airportCode;
    private String airportName;
    private String airportCity;
    private List<Flight> flights;

    public Airport(String airportCode, String airportName, String airportCity) {
        this.airportCode = airportCode;
        this.airportName = airportName;
        this.airportCity = airportCity;
        this.flights = new ArrayList<>();
    }

    public List<Flight> getFlights() { return null; }
    public void addFlight(Flight flight) { }
}