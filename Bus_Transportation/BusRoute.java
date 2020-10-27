package Bus_Transportation;

public class BusRoute {
    int route;
    String start;

    public BusRoute(int route, String start){
        this.route = route;
        this.start = start;
    }

    public void setRoute(int route){
        this.route = route;
    }

    public void setStart(String start){
        this.start = start;
    }

    public int getRoute(){
        return route;
    }

    public String getStart(){
        return start;
    }

    public String toString(){
        return ("The route number is " + route + " and it starts at " + start);
    }
}
