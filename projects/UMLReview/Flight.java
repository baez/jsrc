package projects.UMLReview;

import java.sql.Date;

public class Flight {
     Integer flightNumber;
     Date departurDate;
     String departureAirport;
     String arrivalAirport;
     Boolean isOnTime;
     Integer flightDurationInMinutes;
     PlaneV1 plane;

     Flight(/* add the rest of the required parameters here and do validation checks */ ) {
        this.plane = null;
        this.isOnTime = true;
     } 

     public void setPlane(PlaneV1 plane) {
        this.plane = plane;
     }

    public void setIsOnTime(Boolean isOnTime) {
        this.isOnTime = isOnTime;
    }
}
