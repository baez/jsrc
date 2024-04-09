package projects.UMLReview;

public class WaterTemperatureController implements WaterTemperatureDeviceController {

    private WaterTemperatureDeviceDriver waterTemperatureDeviceDriver;
    private WaterTemperatureReader waterTemperatureReader;

    public WaterTemperatureController(
        WaterTemperatureDeviceDriver waterTemperatureDeviceDriver,
        WaterTemperatureReader waterTemperatureReader) {
        
            this.waterTemperatureDeviceDriver = waterTemperatureDeviceDriver;
            this.waterTemperatureReader = waterTemperatureReader;
    }

    @Override
    public void start(int poolId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    @Override
    public void stop(int poolId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }

    @Override
    public void setTemprature(int temperature, int poolId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTemprature'");
    }

    @Override
    public int getBatteryLevel(int poolId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBatteryLevel'");
    }
}
