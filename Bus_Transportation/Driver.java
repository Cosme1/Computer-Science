package Bus_Transportation;

public class Driver {
    boolean qualified;
    int trainedRoute;

    public void getQualified(boolean qualified){
        this.qualified = qualified;
    }

    public void getTrainedRoute(int trainedRoute){
        this.trainedRoute = trainedRoute;
    }

    public boolean setQualified(){
        return qualified;
    }

    public int setTrainedRoute(){
        return trainedRoute;
    }
}
