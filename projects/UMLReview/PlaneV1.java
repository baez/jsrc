package projects.UMLReview;
import java.util.*;

/* This version of the Plane class would be used for the bi-directional relationship with the Flight class
 * This Plane class has knowledge of all the flights its being added to.
  */
public class PlaneV1 {
    String airPlaneType;
    String airPlanId;
    ArrayList<Flight> flights;

    PlaneV1(String airPlanType, String airPlaneId) {
        if (airPlanType == null || airPlaneType == "") {
            throw new IllegalArgumentException("Input params airPlanType cannot be null or empty");
        }

        if (airPlaneId == null || airPlaneId == "") {
            throw new IllegalArgumentException("Input params airPlanId cannot be null or empty");
        }
        
        this.flights = new ArrayList<Flight>(100);
        this.airPlanId = airPlanType;
        this.airPlaneType = airPlanType;   
    }
 
    public String getAirPlaneType() {
        return this.airPlaneType;
    }

    public String getAirPlaneId() {
        return this.airPlanId;
    }

    public void AddFlight(Flight flight) {
        this.flights.add(flight);
    }
}
