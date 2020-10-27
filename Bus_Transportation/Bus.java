package Bus_Transportation;

public class Bus {
    int id;
    String driver;
    BusRoute busRoute;

    public Bus(int id, String driver, BusRoute busRoute){
        this.id = id;
        this.driver = driver;
        this.busRoute = busRoute;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setDriver(String driver){
        this.driver = driver;
    }

    public void setBusRoute(BusRoute busRoute){
        this.busRoute = busRoute;
    }    

    public int getID(){
        return id;
    }

    public String getDriver(){
        return driver;
    }

    public BusRoute getRoute(){
        return busRoute;
    }

    public String toString(){
        return ("The bus id is " + id + ". " + busRoute);
    }
}
