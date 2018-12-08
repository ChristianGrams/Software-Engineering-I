import java.util.ArrayList;

public class LoadingStrategy {
    private Stowage stowage;
    private ArrayList airCargoPalletIDList;

    public LoadingStrategy(Stowage stowage, ArrayList airCargoPalletIDList) {
        this.stowage = stowage;
        this.airCargoPalletIDList = airCargoPalletIDList;
    }

    public Stowage getStowage() {
        return stowage;
    }

    public ArrayList getAirCargoPalletIDList() {
        return airCargoPalletIDList;
    }

    public void setStowage(Stowage stowage) {
        this.stowage = stowage;
    }

    public void setAirCargoPalletIDList(ArrayList airCargoPalletIDList) {
        this.airCargoPalletIDList = airCargoPalletIDList;
    }
}
