import java.util.*;

public class Pilot {
    private String pilotId;
    private String pilotName;
    private int yearsOfExperience;
    private List<Flight> assignedFlights;

    public Pilot(String pilotId, String pilotName, int yearsOfExperience) {
        this.pilotId = pilotId;
        this.pilotName = pilotName;
        this.yearsOfExperience = yearsOfExperience;
        this.assignedFlights = new ArrayList<>();
    }

    public void setFlightToPilot(Flight flight) { }
    public List<Flight> getFlightsAssigned() { return null; }
}