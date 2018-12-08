
public class BaggageVehicle implements IBaggageVehicle{
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private Container container
    private IContainerLifter containerLifter;
    private Gate gate;

    public BaggageVehicle(String uuid, String id, String type, int speedInMPH, boolean isFlashingLightOn, Container container, IContainerLifter containerLifter, Gate gate) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.isFlashingLightOn = isFlashingLightOn;
        this.container = container;
        this.containerLifter = containerLifter;
        this.gate = gate;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeedInMPH() {
        return speedInMPH;
    }

    public void setSpeedInMPH(int speedInMPH) {
        this.speedInMPH = speedInMPH;
    }

    public boolean isFlashingLightOn() {
        return isFlashingLightOn;
    }

    public void setFlashingLightOn(boolean flashingLightOn) {
        isFlashingLightOn = flashingLightOn;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public IContainerLifter getContainerLifter() {
        return containerLifter;
    }

    public void setContainerLifter(IContainerLifter containerLifter) {
        this.containerLifter = containerLifter;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public void executeRequest(GateID gateID) {}
    public void store(Container container) {}
    public void setFlashingLightOn() {}
    public void move(int speedInMPH) {}
    public void stop() {}
    public void setGate(GateID gate) {}
    public void connect(IContainerLifter containerLifter) {}
    public void transferContainerToLifter() {}
    public void disconnect(IContainerLifter containerLifter) {}
    public void returnToBaggageSortingUnit() {}
    public void setFlashingLightOff() {}


}
