package Bus_Transportation;

public class BusDriver {
    public static void main(String[] args) {
        Bus bus = new Bus(1001, "N Prakesh", new BusRoute(431, "Klang"));
        System.out.println(bus.toString());
    }
}
