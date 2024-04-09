package projects.UMLReview;

public interface WaterTemperatureDeviceController {
    void start(int poolId);
    void stop(int poolId);
    void setTemprature(int temperature, int poolId);
    int getBatteryLevel(int poolId);
}
