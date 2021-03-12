public class Hourly extends Employee{
    private double hWage, hWorkedforMonth;
    public Hourly(String name, String ssNum, double hWage, double hWorkedforMonth){
        super(name, ssNum);
        this.hWage = hWage;
        this.hWorkedforMonth = hWorkedforMonth;
    }

    public double getSalary(){
        if (hWorkedforMonth > 160){
            return (hWorkedforMonth * hWage + (hWorkedforMonth - 160) * 2);
        } else {
            return (hWorkedforMonth * hWage);
        }
    }
}
