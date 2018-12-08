public class AirplaneLoadingManagement implements IAirplaneLoadingManagement{
    private LoadingStrategy strategy;

    public AirplaneLoadingManagement(LoadingStrategy strategy) {
        this.strategy = strategy;
    }

    public LoadingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(LoadingStrategy strategy) {
        this.strategy = strategy;
    }

    public void optimizeBalancing() {}
}
