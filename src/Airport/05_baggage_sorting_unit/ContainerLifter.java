import java.util.ArrayList;

public class ContainerLifter implements IContainerLifter {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private boolean isDown;
    private Container container;
    private int numberOfContainerLoaded;
    private ArrayList containerIDList;
    private Gate gate;
    private Airplane connectedAirplane;

    public ContainerLifter(String uuid, String id, String type, int speedInMPH, boolean isFlashingLightOn, Container container, int numberOfContainerLoaded, ArrayList containerIDList, Gate gate, Airplane connectedAirplane) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.isFlashingLightOn = isFlashingLightOn;
        this.isDown = true;
        this.container = container;
        this.numberOfContainerLoaded = numberOfContainerLoaded;
        this.containerIDList = containerIDList;
        this.gate = gate;
        this.connectedAirplane = connectedAirplane;
    }

    public String getUuid() {
        return uuid;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getSpeedInMPH() {
        return speedInMPH;
    }

    public boolean isFlashingLightOn() {
        return isFlashingLightOn;
    }

    public boolean isDown() {
        return isDown;
    }

    public Container getContainer() {
        return container;
    }

    public int getNumberOfContainerLoaded() {
        return numberOfContainerLoaded;
    }

    public ArrayList getContainerIDList() {
        return containerIDList;
    }

    public Gate getGate() {
        return gate;
    }

    public Airplane getConnectedAirplane() {
        return connectedAirplane;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeedInMPH(int speedInMPH) {
        this.speedInMPH = speedInMPH;
    }

    public void setFlashingLightOn(boolean flashingLightOn) {
        isFlashingLightOn = flashingLightOn;
    }

    public void setDown(boolean down) {
        isDown = down;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public void setNumberOfContainerLoaded(int numberOfContainerLoaded) {
        this.numberOfContainerLoaded = numberOfContainerLoaded;
    }

    public void setContainerIDList(ArrayList containerIDList) {
        this.containerIDList = containerIDList;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public void setConnectedAirplane(Airplane connectedAirplane) {
        this.connectedAirplane = connectedAirplane;
    }

    public void executeRequest(GateID gateID) {}
    public void setFlashingLightOn() {}
    public void move(int speedInMPH) {}
    public void stop() {}
    public void setGate(GateID gateID) {}
    public void connectToAirplane() {}
    public void up() {}
    public void transferContainerToCargoSystem() {}
    public void down() {}
    public void disconnectFromAirplane() {}
    public void notifyGroundOperations(ContainerLifterReceipt containerLifterReceipt){}
    public void setFlashingLightOff() {}
    public void returnToAirportResourcePool() {}
}
