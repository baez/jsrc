package projects.UMLReview;

/* The version of the Plane class used in the uni-directional relationship  
 * The Plane class has no knowledge of the flight class
*/
public class PlaneV2 {
    String airPlaneType;
    String airPlanId;

    PlaneV2(String airPlanType, String airPlaneId) {
        if (airPlanType == null || airPlaneType == "") {
            throw new IllegalArgumentException("Input params airPlanType cannot be null or empty");
        }

        if (airPlaneId == null || airPlaneId == "") {
            throw new IllegalArgumentException("Input params airPlanId cannot be null or empty");
        }
        
        this.airPlanId = airPlanType;
        this.airPlaneType = airPlanType;   
    }
 
    public String getAirPlaneType() {
        return this.airPlaneType;
    }

    public String getAirPlaneId() {
        return this.airPlanId;
    }
}
