import java.util.ArrayList;
import java.util.List;

public class Airplane {
        private String airplaneId;
        private String totalNoOfSeats;
        private String airplaneModel;
        private List<Seat> seats;

        public Airplane(String airplaneId, String totalNoOfSeats, String airplaneModel) {
            this.airplaneId = airplaneId;
            this.totalNoOfSeats = totalNoOfSeats;
            this.airplaneModel = airplaneModel;
            this.seats = new ArrayList<>();
        }

        public void addSeat(Seat seat) { }
        public Seat getSeat(int rowNumber, char position) { return null; }
        public List<Seat> getAllSeats() { return null; }
}
