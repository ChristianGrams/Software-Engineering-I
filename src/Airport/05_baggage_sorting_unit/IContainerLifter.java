public interface IContainerLifter {
    void executeRequest(GateID gateID) ;
    void setFlashingLightOn() ;
    void move(int speedInMPH) ;
    void stop() ;
    void setGate(GateID gateID) ;
    void connectToAirplane() ;
    void up() ;
    void transferContainerToCargoSystem() ;
    void down() ;
    void disconnectFromAirplane() ;
    void notifyGroundOperations(ContainerLifterReceipt containerLifterReceipt);
    void setFlashingLightOff() ;
    void returnToAirportResourcePool() ;
}
