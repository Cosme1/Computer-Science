package Bus_Transportation;

public class BusDriver {
    public static int DRIVERS = 0;
    public static void main(String[] args) {
        Bus bus = new Bus(1001, "N Prakesh", new BusRoute(431, "Klang"));
        System.out.println(bus.toString());

        int MAX_BUSES = 12;
        Bus[] buses = new Bus[MAX_BUSES];
        buses[0] = new Bus(1001, "N Prakesh", new BusRoute(431, "Klang"));
        buses[1] = new Bus(1010, "J Carey", new BusRoute(342, "Tanglin"));
        buses[2] = new Bus(1014, "H Lee", new BusRoute(411, "Queenstown"));
        buses[3] = new Bus(1015, "K Peters", new BusRoute(319, "Jamaica Street"));
        showBusDrivers(buses, 1010);
        System.out.println("Number of buses: ");
        PrintBusInfo(buses);
        System.out.println(DRIVERS);
    }

    public static void showBusDrivers(Bus[] b, int n){
        for (int i = 0; i < b.length; i++){
            if (b[i] == null){
                break;
            }
            else if (b[i].getID() <= n){
                System.out.println(b[i].getDriver());
            }
            DRIVERS++;
        }
    }

    public static void PrintBusInfo(Bus[] b){
        for (int i = 0; i < b.length; i++){
            if (b[i] == null){
                break;
            }
            else System.out.println(b[i].busRoute);
        }
    }
}
