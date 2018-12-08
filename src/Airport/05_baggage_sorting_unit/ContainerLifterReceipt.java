import java.util.ArrayList;

public class ContainerLifterReceipt {
    private String uuid;
    private String containerLifterID;
    private GateID gateID;
    private int numberOfContainer;
    private ArrayList containerIDList;

    public ContainerLifterReceipt(String uuid, String containerLifterID, GateID gateID, int numberOfContainer, ArrayList containerIDList) {
        this.uuid = uuid;
        this.containerLifterID = containerLifterID;
        this.gateID = gateID;
        this.numberOfContainer = numberOfContainer;
        this.containerIDList = containerIDList;
    }

    public String getUuid() {
        return uuid;
    }

    public String getContainerLifterID() {
        return containerLifterID;
    }

    public GateID getGateID() {
        return gateID;
    }

    public int getNumberOfContainer() {
        return numberOfContainer;
    }

    public ArrayList getContainerIDList() {
        return containerIDList;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setContainerLifterID(String containerLifterID) {
        this.containerLifterID = containerLifterID;
    }

    public void setGateID(GateID gateID) {
        this.gateID = gateID;
    }

    public void setNumberOfContainer(int numberOfContainer) {
        this.numberOfContainer = numberOfContainer;
    }

    public void setContainerIDList(ArrayList containerIDList) {
        this.containerIDList = containerIDList;
    }
}
